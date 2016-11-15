package com.zdziechowski.movierental.dao;
import java.util.ArrayList;
import java.util.List;

import com.zdziechowski.movierental.carrier.*;

public class MovieRental {
	List<Carrier> movies = new ArrayList<Carrier>();


	public void addCarrier(Carrier add_carrier) {
		movies.add(add_carrier);
	}
	
	public void rentCarrier(Carrier rent_carrier) throws CarrierAlreadyRentException{
		if(!rent_carrier.isAvailavble()){
			throw new CarrierAlreadyRentException();
		}
		rent_carrier.setAvailavble(false);

	}
	
	public List<Carrier> getMovies() {
		List<Carrier> result = new ArrayList<>();
		for (Carrier m : movies) {
			if (m instanceof Videotape) {
				result.add(new Videotape(m.getName(), m.getCategory()));
			}
		}
		return result;
	}

	public void setMovies(List<Carrier> movies) {
		this.movies = movies;
	}

	public boolean isEmpty() {
		return movies.isEmpty();
	}
}
