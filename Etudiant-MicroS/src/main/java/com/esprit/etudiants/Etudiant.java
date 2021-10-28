package com.esprit.etudiants;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Etudiant implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int age;
	private int cin;
	private int classe;
	
	
	public Etudiant(String name, int age, int cin, int classe) {
		super();
		this.name = name;
		this.age = age;
		this.cin = cin;
		this.classe = classe;
	}


	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getCin() {
		return cin;
	}


	public void setCin(int cin) {
		this.cin = cin;
	}


	public int getClasse() {
		return classe;
	}


	public void setClasse(int classe) {
		this.classe = classe;
	}


	@Override
	public String toString() {
		return "Etudiant [id=" + id + ", name=" + name + ", age=" + age + ", cin=" + cin + ", classe="
				+ classe + "]";
	}

	
}
