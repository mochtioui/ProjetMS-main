package tn.esprit.spring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ClasseRepository extends JpaRepository<Classe, Integer> {
	@Query("select c from Classe where c.niveau like :niveau")
	public Page<Classe> classeParNiveau(@Param("niveau") String n, Pageable pageable);
}
