package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {

	@Autowired
    private EventRepository eventRepository;
	
	public Event add(Event event) {
		return eventRepository.save(event);
	}
	public Event update(long id,Event event) {
		Event existingEvent=eventRepository.findById(id).get();
        existingEvent.setAddress(event.getAddress());
        existingEvent.setEndDate(event.getEndDate());
        existingEvent.setHourEnd(event.getHourEnd());
        existingEvent.setHourStart(event.getHourStart());
        existingEvent.setHourEnd(event.getHourEnd());
        existingEvent.setPayOrNot(event.getPayOrNot());
        existingEvent.setPrice(event.getPrice());
        existingEvent.setStartDate(event.getStartDate());
        existingEvent.setClub(event.getClub());
		return eventRepository.save(existingEvent);
	}
	public boolean delete(long id) {
		if(eventRepository.findById(id).isPresent()) {
			eventRepository.deleteById(id);
			return true;
		}
		return false;
	}
	public Event getById(long id) {
		return eventRepository.findById(id).get();
	}
	public List<Event> getAll(){
		return (List<Event>)eventRepository.findAll();
	}
}
