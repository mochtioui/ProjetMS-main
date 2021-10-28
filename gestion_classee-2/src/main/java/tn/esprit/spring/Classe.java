package tn.esprit.spring;

import java.io.Serializable;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "Classe")

public class Classe implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int id;
	private String niveau;
	private String caracteristiques;
	private int nbEleves;
	private String adresseMail;

	public int getId() {
		return id;
	}

	public Classe() {
		super();
	}

	public Classe(String niveau) {
		super();
		this.niveau = niveau;
	}

	public Classe(String niveau, String caracteristiques, int nbEleves, String adresseMail) {
		super();
		this.niveau = niveau;
		this.caracteristiques = caracteristiques;
		this.nbEleves = nbEleves;
		this.adresseMail = adresseMail;
	}

	@Override
	public String toString() {
		return "Classe [niveau=" + niveau + ", caracteristiques=" + caracteristiques + ", nbEleves=" + nbEleves
				+ ", adresseMail=" + adresseMail + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public String getCaracteristiques() {
		return caracteristiques;
	}

	public void setCaracteristiques(String caracteristiques) {
		this.caracteristiques = caracteristiques;
	}

	public int getNbEleves() {
		return nbEleves;
	}

	public void setNbEleves(int nbEleves) {
		this.nbEleves = nbEleves;
	}

	public String getAdresseMail() {
		return adresseMail;
	}

	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}

}
