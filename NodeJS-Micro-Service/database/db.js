const mongoose = require('mongoose')
const con = mongoose
  .connect("mongodb+srv://m001-student:m001-mongodb-basics@sandbox.stloa.mongodb.net/testdata?retryWrites=true&w=majority", {
    useNewUrlParser: true,
    useUnifiedTopology: true,
  })
  .then((success) => {
    console.log(
      '=> Successfully MongoDb Connected : ',
      success.connections[0].host
    )
  })
  .catch((error) => {
    console.log(error)
  })

module.exports = con
