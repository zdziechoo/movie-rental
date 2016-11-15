/* zaimplementować program do obsługi wypożyczalni video
 * funkcjonalnosci: dodaj plyte (do zbioru), dodaj kasete, wypozycz plyte, wypozycz kasete
 * mozliwosc wypisywania wszystkich plyt i kaset na stanie
 * mozliwosc wypisania posortowanych plyt: a po typie filmu, b po tytule
*/
package com.zdziechowski.movierental.console;

import java.util.*;

import com.zdziechowski.movierental.carrier.*;
import com.zdziechowski.movierental.dao.MovieRental;

public class MovieRentalMain {
    private static MovieRental mvrental = new MovieRental();
    private static Character option = 'x';
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //loadSampleData()
        //printMenu
        //Option o = readOption
        //o.invoke
        loadSampleData();
        printMenu();


        while (!option.equals('e')) {
            //'e' means exit

            //option = menu();
            switch (option) {
                case '1':
                    addVideotape();
                    break;
                case '2':
                    addDvd();
                    break;
                case '3':
                    rentVideotape();
                    break;
                case '4':
                    rentDvd();
                    break;
                case '5':
                    showMovies(mvrental.getMovies());
                    break;
                case '6':
                    sortMoviesByCategory(mvrental.getMovies());
                    break;
                case '7':
                    sortMoviesByTitle(mvrental.getMovies());
                    break;
                case 'e':
                    System.out.println("END");
                    break;
                default:
                    System.out.println("I don't understand");
            }
        }
    }


    private static void addVideotape() {
        Carrier newCarrier = new Videotape();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set title: ");
        newCarrier.setName(scanner.nextLine());
        System.out.println("Set category: ");
        newCarrier.setCategory(scanner.nextLine());
        mvrental.addCarrier(newCarrier);
    }

    private static void addDvd() {
        Carrier newCarrier = new Dvd();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set title: ");
        newCarrier.setName(scanner.nextLine());
        System.out.println("Set category: ");
        newCarrier.setCategory(scanner.nextLine());
        mvrental.addCarrier(newCarrier);
    }

    private static void rentVideotape() {
        //to do
    }

    private static void rentDvd() {
        //to do
    }

    private static void printMenu() {

            System.out.println("******MENU******");
            System.out.println("1 - add videotape");
            System.out.println("2 - add dvd");
            System.out.println("3 - rent videotape");
            System.out.println("4 - rent dvd");
            System.out.println("5 - show carriers");
            System.out.println("6 - sort carriers by category");
            System.out.println("7 - sort carriers by title");
            System.out.println("e - end");
            System.out.print("> ");
            option = scanner.next().charAt(0);

    }

    private static void loadSampleData() {
        if (mvrental.isEmpty()) {
            //adding sample data
            Dvd dvd1 = new Dvd("Terminator", "action");
            Dvd dvd2 = new Dvd("Terminator 2", "action");
            Dvd dvd3 = new Dvd("Dumb & Dumber", "comedy");
            Dvd dvd4 = new Dvd("Ace Ventura", "comedy");

            Videotape video1 = new Videotape("Terminator 2", "action");
            Videotape video2 = new Videotape("Avengers", "action");
            Videotape video3 = new Videotape("Pocahontas 2", "for kids");

            mvrental.addCarrier(dvd1);
            mvrental.addCarrier(dvd2);
            mvrental.addCarrier(dvd3);
            mvrental.addCarrier(dvd4);

            mvrental.addCarrier(video1);
            mvrental.addCarrier(video2);
            mvrental.addCarrier(video3);
        }
    }

    private static void showMovies(Collection<Carrier> movies) {
        System.out.println("-----------------------------------------------------------------");
        for (Carrier carrier : movies) {
            System.out.println("Title: " + carrier.getName() + ", Category: "
                    + carrier.getCategory() + ", carrier: " + carrier.getCarrier()
                    + ", available: " + carrier.isAvailavble());
        }

    }

    private static void sortMoviesByTitle(List<Carrier> movies) {
        Collections.sort(movies, new Comparator<Carrier>() {

            @Override
            public int compare(Carrier o1, Carrier o2) {
                return o1.getName().compareTo(o2.getName());
            }

        });
    }

    private static void sortMoviesByCategory(List<Carrier> movies) {
        Collections.sort(movies, new Comparator<Carrier>() {

            @Override
            public int compare(Carrier arg0, Carrier arg1) {
                return arg0.getCategory().compareTo(arg1.getCategory());
            }
        });
    }
}
