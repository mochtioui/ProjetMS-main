package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Club {

	private static final long serialVersionUID = -7049957706738879274L;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String libelleClub;
	private String domaineClub;
	private String descriptionClub;
	private String sloganClub;
	private String logo;
	private String presidentClub;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLibelleClub() {
		return libelleClub;
	}
	public void setLibelleClub(String libelleClub) {
		this.libelleClub = libelleClub;
	}
	public String getDomaineClub() {
		return domaineClub;
	}
	public void setDomaineClub(String domaineClub) {
		this.domaineClub = domaineClub;
	}
	public String getDescriptionClub() {
		return descriptionClub;
	}
	public void setDescriptionClub(String descriptionClub) {
		this.descriptionClub = descriptionClub;
	}
	public String getSloganClub() {
		return sloganClub;
	}
	public void setSloganClub(String sloganClub) {
		this.sloganClub = sloganClub;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getPresidentClub() {
		return presidentClub;
	}
	public void setPresidentClub(String presidentClub) {
		this.presidentClub = presidentClub;
	}
	public Club(String libelleClub, String domaineClub, String descriptionClub, String sloganClub, String logo,
			String presidentClub) {
		super();
		this.libelleClub = libelleClub;
		this.domaineClub = domaineClub;
		this.descriptionClub = descriptionClub;
		this.sloganClub = sloganClub;
		this.logo = logo;
		this.presidentClub = presidentClub;
	}
	public Club(String libelleClub, String domaineClub, String descriptionClub, String sloganClub, String logo) {
		super();
		this.libelleClub = libelleClub;
		this.domaineClub = domaineClub;
		this.descriptionClub = descriptionClub;
		this.sloganClub = sloganClub;
		this.logo = logo;
	}
	public Club(String libelleClub) {
		super();
		this.libelleClub = libelleClub;
	}
	public Club() {
		super();
	}
	
}
