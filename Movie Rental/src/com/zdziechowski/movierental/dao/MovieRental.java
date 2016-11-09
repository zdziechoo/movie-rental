package com.zdziechowski.movierental.dao;
import java.util.ArrayList;
import java.util.List;

import com.zdziechowski.movierental.carrier.*;

public class MovieRental {
	List<Carrier> movies = new ArrayList<Carrier>();
	
	
	public void addCarrier(Carrier add_carrier){
		movies.add(add_carrier);
		//mam w¹tpliwoœci czy taki zapis jest prawid³owy/zalecany
	}
	
	public void rentCarrier(Carrier rent_carrier) throws CarrierAlreadyRentException{
		if(!rent_carrier.isAvailavble()){
			throw new CarrierAlreadyRentException();
		}
		rent_carrier.setAvailavble(false);
		//metoda do implementacji
	}
	
	public List<Carrier> getMovies() {
		return movies;
	}

	public void setMovies(List<Carrier> movies) {
		this.movies = movies;
	}
	
}
