package com.zdziechowski.movierental.carrier;

public class Dvd implements Carrier {
	private String title;
	private String category;
	private boolean available = true; // when true - available, false - loaned

	public Dvd(String name, String category) {
		super();
		this.title = name;
		this.category = category;
		this.available = true;
	}

	public Dvd() {
	}

	public String getName() {
		return title;
	}

	public void setName(String name) {
		this.title = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean status) {
		this.available = status;
	}

	public String getCarrier() {
		return "dvd";
	}

}
