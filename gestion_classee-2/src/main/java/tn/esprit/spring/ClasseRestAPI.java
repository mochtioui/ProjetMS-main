package tn.esprit.spring;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping(value = "api/classes")

public class ClasseRestAPI {
	private String title = "hello classes ";
	@Autowired
	private ClasseService classeService;

	@RequestMapping("/helloClasse")
	public String sayHello() {
		System.out.println(title);
		return title;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Classe> createClasse(@RequestBody Classe classe) {
		return new ResponseEntity<>(classeService.ajouterClasse(classe), HttpStatus.OK);

	}

	@PutMapping(value = "/{id", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Classe> updateClasse(@PathVariable(value = "id") int id, @RequestBody Classe classe) {
		return new ResponseEntity<>(classeService.updateClasse(id, classe), HttpStatus.OK);

	}

	@DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> deleteClasse(@PathVariable(value = "id") int id) {
		return new ResponseEntity<>(classeService.deleteClasse(id), HttpStatus.OK);
	}

}
