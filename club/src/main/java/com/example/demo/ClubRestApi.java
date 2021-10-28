package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/club")
public class ClubRestApi {
	
	@Autowired
	private ClubService clubService;
	
	@Autowired
    private ClubRepository clubRepository;
	
	
	
	  @PostMapping
	  @ResponseStatus(HttpStatus.CREATED)
	  public  ResponseEntity<Club> create(@RequestBody Club newClub){
		  return new ResponseEntity<Club>(clubService.add(newClub),HttpStatus.OK);
	  }
	  @PutMapping(value="/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	  @ResponseStatus(HttpStatus.CREATED)
	  public ResponseEntity<Club> update(@PathVariable(value= "id") int id,@RequestBody Club newClub){
		  return new ResponseEntity<Club>(clubService.update(id,newClub),HttpStatus.OK);

	  }
	  @DeleteMapping(value="/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	  @ResponseStatus(HttpStatus.CREATED)
	  public ResponseEntity<Boolean> delete(@PathVariable(value= "id") int id){
		  return new ResponseEntity<>(clubService.delete(id),HttpStatus.OK);
	  }
	  @GetMapping
	    public ResponseEntity<List<Club>> getAll() {
	        return new ResponseEntity<>(clubService.getAll(), HttpStatus.OK);
	    }
	  @GetMapping(value="/{id}")
	    public ResponseEntity<Club> getById(@PathVariable long id) {
		  Optional<Club> club = clubRepository.findById(id);
	        if (club.isPresent()) {
	            return new ResponseEntity<Club>(club.get(),HttpStatus.OK);
	        } else {
	            return null;
	        }
	    }


}
