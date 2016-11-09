package com.zdziechowski.movierental.carrier;

public interface Carrier {
	//final String[] CATEGORIES = {"comedy","horror","action","thriller","biography","for children","for teenagers"};
	
	public String getName();

	public void setName(String name);

	public String getCategory();

	public void setCategory(String category);
	
	public String getCarrier();
	
	public boolean isAvailavble();
	
	public void setAvailavble(boolean status);
	
}
