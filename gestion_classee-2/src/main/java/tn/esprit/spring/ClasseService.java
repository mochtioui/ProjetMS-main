package tn.esprit.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClasseService {

	@Autowired
	private ClasseRepository classeRepo;

	public Classe ajouterClasse(Classe classe) {
		return classeRepo.save(classe);
	}

	public Classe updateClasse(int id, Classe nvclasse) {
		if (classeRepo.findById(id).isPresent()) {
			Classe existingClasse = classeRepo.findById(id).get();
			existingClasse.setNiveau(nvclasse.getNiveau());
			existingClasse.setAdresseMail(nvclasse.getAdresseMail());

			existingClasse.setCaracteristiques(nvclasse.getCaracteristiques());
			existingClasse.setNbEleves(nvclasse.getNbEleves());
			existingClasse.setNiveau(nvclasse.getNiveau());
			return classeRepo.save(existingClasse);
		} else
			return null;
	}

	public String deleteClasse(int id) {
		if (classeRepo.findById(id).isPresent()) {
			classeRepo.deleteById(id);
			return "classe supprimée ";
		} else
			return "classe no supprimée ";
	}
}
