package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClubService {
	
	@Autowired
    private ClubRepository clubRepository;
	
	public Club add(Club club) {
		return clubRepository.save(club);
	}
	public Club update(long id,Club club) {
		Club existingClub=clubRepository.findById(id).get();
		existingClub.setDescriptionClub(club.getDescriptionClub());
		existingClub.setDomaineClub(club.getDomaineClub());
		existingClub.setLibelleClub(club.getLibelleClub());
		existingClub.setLogo(club.getLogo());
		existingClub.setPresidentClub(club.getPresidentClub());
		existingClub.setSloganClub(club.getSloganClub());
		return clubRepository.save(existingClub);
	}
	public boolean delete(long id) {
		if(clubRepository.findById(id).isPresent()) {
			clubRepository.deleteById(id);
			return true;
		}
		return false;
	}
	public Club getById(long id) {
		return clubRepository.findById(id).get();
	}
	public List<Club> getAll(){
		return (List<Club>)clubRepository.findAll();
	}

}
