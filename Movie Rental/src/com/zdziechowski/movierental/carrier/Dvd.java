package com.zdziechowski.movierental.carrier;

public class Dvd implements Carrier {
	private String title;
	private String category;
	boolean available; // when true - available, false - loaned
	final String carrier = "dvd";

	public Dvd(String name, String category) {
		super();
		this.title = name;
		this.category = category;
		this.available = true;
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

	public boolean isAvailavble() {
		return available;
	}

	public void setAvailavble(boolean status) {
		this.available = status;
	}

	public String getCarrier() {
		return carrier;
	}

}
