const express = require('express')
const bcrypt = require('bcryptjs')
const User = require('../models/userSchema')
const router = express.Router()


router.get('/users', async (req, res) => {
  const users = await User.find()
  res.json(users)
})

router.get('/users/:id', async (req, res) => {
  const userDetails = await User.findById(req.params.id)
  res.json(userDetails)
})


router.post('/users', async (req, res) => {
  const createdUser = await User.create(req.body)
 
  const salt = bcrypt.genSaltSync(10)
  const hash = bcrypt.hashSync(req.body.password, salt)

  createdUser.password = hash
  createdUser.save()
 
  res.json(createdUser)
})


router.put('/users/:id', async (req, res) => {
  const updatedUser = await User.findByIdAndUpdate(req.params.id, req.body, {
    new: true,
  })
  res.json(updatedUser)
})


router.delete('/users/:id', async (req, res) => {
  await User.findByIdAndRemove(req.params.id)
  res.json({ message: 'User deleted successfully!' })
})

module.exports = router
