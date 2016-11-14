package com.zdziechowski.movierental.dao;
import java.util.ArrayList;
import java.util.List;

import com.zdziechowski.movierental.carrier.*;

class MovieRental {
	List<Carrier> movies = new ArrayList<Carrier>();


	private void addCarrier(Carrier add_carrier) {
		movies.add(add_carrier);

	}
	
	public void rentCarrier(Carrier rent_carrier) throws CarrierAlreadyRentException{
		if(!rent_carrier.isAvailavble()){
			throw new CarrierAlreadyRentException();
		}
		rent_carrier.setAvailavble(false);

	}
	
	public List<Carrier> getMovies() {
		return movies;
	}

	public void setMovies(List<Carrier> movies) {
		this.movies = movies;
	}

	private boolean isEmpty() {
		return movies.isEmpty();
	}
}
