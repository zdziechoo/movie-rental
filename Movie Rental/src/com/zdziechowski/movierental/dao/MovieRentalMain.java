/* zaimplementowaæ program do obs³ugi wypo¿yczalni video
 * funkcjonalnosci: dodaj plyte (do zbioru), dodaj kasete, wypozycz plyte, wypozycz kasete
 * mozliwosc wypisywania wszystkich plyt i kaset na stanie
 * mozliwosc wypisania posortowanych plyt: a po typie filmu, b po tytule
*/
package com.zdziechowski.movierental.dao;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.zdziechowski.movierental.carrier.Carrier;
import com.zdziechowski.movierental.carrier.Dvd;
import com.zdziechowski.movierental.carrier.Videotape;

public class MovieRentalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieRental mvrental = new MovieRental();
		Dvd dvd1 = new Dvd("Terminator", "action");
		Dvd dvd2 = new Dvd("Terminator 2", "action");
		Dvd dvd3 = new Dvd("Dumb & Dumber", "comedy");
		Dvd dvd4 = new Dvd("Ace Ventura", "comedy");
		
		Videotape video1 = new Videotape("Terminator 2","action");
		Videotape video2 = new Videotape("Avengers","action");
		Videotape video3 = new Videotape("Pocahontas 2", "for kids");
		
		mvrental.addCarrier(dvd1);
		mvrental.addCarrier(dvd2);
		mvrental.addCarrier(dvd3);
		mvrental.addCarrier(dvd4);
		
		mvrental.addCarrier(video1);
		mvrental.addCarrier(video2);
		mvrental.addCarrier(video3);
		
		showMovies(mvrental.movies);
		
		//mvrental.showMovies();
		
		//loan carrier - example	
		mvrental.rentCarrier(dvd4);
		mvrental.rentCarrier(video1);
				
		
		showMovies(mvrental.movies);
		sortMoviesByCategory(mvrental.movies);
		mvrental.rentCarrier(dvd4);
		mvrental.rentCarrier(video1);
		showMovies(mvrental.movies);
		sortMoviesByTitle(mvrental.movies);
		showMovies(mvrental.movies);
		
	}
	private static void showMovies(Collection<Carrier> movies){
		System.out.println("-----------------------------------------------------------------");
		for (Carrier carrier : movies){
			
			System.out.println("Title: " + carrier.getName() + ", Category: " 
					+carrier.getCategory() + ", carrier: "+ carrier.getCarrier()
					+ ", available: " + carrier.isAvailavble());
		}
		
	}
	private static void sortMoviesByTitle(List<Carrier> movies){
		Collections.sort(movies, new Comparator<Carrier>(){

			@Override
			public int compare(Carrier o1, Carrier o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		});
	}
	
	private static void sortMoviesByCategory(List<Carrier> movies){
		Collections.sort(movies,new Comparator<Carrier>() {

			@Override
			public int compare(Carrier arg0, Carrier arg1) {
				return arg0.getCategory().compareTo(arg1.getCategory());
			}
		});
	}

}
