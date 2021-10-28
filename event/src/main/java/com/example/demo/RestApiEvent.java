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
@RequestMapping("/api/event")
public class RestApiEvent {

	@Autowired
	private EventService eventService;
	
	@Autowired
    private EventRepository eventRepository;
	
	
	
	  @PostMapping
	  @ResponseStatus(HttpStatus.CREATED)
	  public  ResponseEntity<Event > create(@RequestBody Event  newEvent ){
		  return new ResponseEntity<Event >(eventService.add(newEvent ),HttpStatus.OK);
	  }
	  @PutMapping(value="/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	  @ResponseStatus(HttpStatus.CREATED)
	  public ResponseEntity<Event > update(@PathVariable(value= "id") int id,@RequestBody Event  newEvent ){
		  return new ResponseEntity<Event >(eventService.update(id,newEvent ),HttpStatus.OK);

	  }
	  @DeleteMapping(value="/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	  @ResponseStatus(HttpStatus.CREATED)
	  public ResponseEntity<Boolean> delete(@PathVariable(value= "id") int id){
		  return new ResponseEntity<>(eventService.delete(id),HttpStatus.OK);
	  }
	  @GetMapping
	    public ResponseEntity<List<Event >> getAll() {
	        return new ResponseEntity<>(eventService.getAll(), HttpStatus.OK);
	    }
	  @GetMapping(value="/{id}")
	    public ResponseEntity<Event > getById(@PathVariable long id) {
		  Optional<Event > event  = eventRepository.findById(id);
	        if (event .isPresent()) {
	            return new ResponseEntity<Event >(event .get(),HttpStatus.OK);
	        } else {
	            return null;
	        }
	    }
}
