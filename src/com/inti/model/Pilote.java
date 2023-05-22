package com.inti.model;

public class Pilote {
	private Long idPilote;
	private String nom;
	private int age;
	public Pilote() {
		this.idPilote = 1L;
		this.nom = "Jean";
		this.age = 36;
	}
	public Long getIdPilote() {
		return idPilote;
	}
	public void setIdPilote(Long idPilote) {
		this.idPilote = idPilote;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Pilote [idPilote=" + idPilote + ", nom=" + nom + ", age=" + age + "]";
	}
	
}
