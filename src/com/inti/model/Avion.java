package com.inti.model;

public class Avion {
	private Long id;
	private String brand;
	private String model;
	public Avion() {
		this.id=1L;
		this.brand ="airbus";
		this.model ="A320";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Avion [id=" + id + ", brand=" + brand + ", model=" + model + "]";
	}
	
	
}
