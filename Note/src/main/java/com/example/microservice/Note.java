package com.example.microservice;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

	@Entity
	public class Note implements Serializable {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public Note(String matiere, String etudiant, String status) {
			this.matiere = matiere;
			this.etudiant = etudiant;
			this.status = status;
		}
		
		public Note() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Id
		@GeneratedValue
		private int id;
		private String matiere, etudiant, status;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}

		public String getMatiere() {
			return matiere;
		}

		public void setMatiere(String matiere) {
			this.matiere = matiere;
		}

		public String getEtudiant() {
			return etudiant;
		}

		public void setEtudiant(String etudiant) {
			this.etudiant = etudiant;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
		
		
		
		

}
