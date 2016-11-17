package com.zdziechowski.movierental.dao;
import java.util.ArrayList;
import java.util.List;

import com.zdziechowski.movierental.carrier.*;

public class MovieRental {
	private List<Carrier> movies = new ArrayList<>();


    public void addCarrier(Carrier addCarrier) {
        movies.add(addCarrier);
    }


    public void rentCarrier(Carrier rentCarrier) throws CarrierAlreadyRentException {
        if (!rentCarrier.isAvailable()) {
            throw new CarrierAlreadyRentException();
		}
        rentCarrier.setAvailable(false);

	}

    public void rentCarrierByTitle(String title) throws NoCarrierOrAlreadyRentException {
        for (Carrier m : movies) {
            if (m.getName().equals(title) && m.isAvailable()) {
                m.setAvailable(false);
                break;
            }
            throw new NoCarrierOrAlreadyRentException();
        }
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
