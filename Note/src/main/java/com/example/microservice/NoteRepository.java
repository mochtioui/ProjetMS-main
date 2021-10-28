package com.example.microservice;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

	public interface NoteRepository extends JpaRepository<Note, Integer> {

		@Query("select c from Note c where c.matiere like :matiere")
		public Page<Note> noteByMatiere(@Param("matiere") String n, Pageable pageable);
		

	

}
