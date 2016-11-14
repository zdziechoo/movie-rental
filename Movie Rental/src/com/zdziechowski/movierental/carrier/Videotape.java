package com.zdziechowski.movierental.carrier;

public class Videotape implements Carrier {
	private String title;
	private String category;
	private boolean available = true; // when true - available, false - loaned

	private final String carrier = "videotape";

	public Videotape(String name, String category) {
		super();
		this.title = name;
		this.category = category;
		this.available = true;
	}

	public Videotape() {
	}

	@Override
	public String getName() {
		return title;
	}

	@Override
	public void setName(String name) {
		this.title = name;
	}

	@Override
	public String getCategory() {
		return category;
	}

	@Override
	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String getCarrier() {
		return carrier;
	}

	@Override
	public boolean isAvailavble() {
		// TODO Auto-generated method stub
		return available;
	}

	@Override
	public void setAvailavble(boolean status) {
		// TODO Auto-generated method stub
		this.available = status;
	}

}
