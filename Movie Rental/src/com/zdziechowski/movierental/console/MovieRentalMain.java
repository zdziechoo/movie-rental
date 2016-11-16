/* zaimplementować program do obsługi wypożyczalni video
 * funkcjonalnosci: dodaj plyte (do zbioru), dodaj kasete, wypozycz plyte, wypozycz kasete
 * mozliwosc wypisywania wszystkich plyt i kaset na stanie
 * mozliwosc wypisania posortowanych plyt: a po typie filmu, b po tytule
*/
package com.zdziechowski.movierental.console;

import java.util.*;

import com.zdziechowski.movierental.carrier.*;
import com.zdziechowski.movierental.dao.MovieRental;

import static com.zdziechowski.movierental.console.Option.*;


class MovieRentalMain {
    private static final MovieRental movierental = new MovieRental();
    private static Option o;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //loadSampleData()
        //printMenu
        //Option o = readOption
        //o.invoke
        loadSampleData();
        printMenu();
        readOption();
        o.invoke();
    }

    private static void addVideotape() {
        Carrier newCarrier = new Videotape();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set title: ");
        newCarrier.setName(scanner.nextLine());
        System.out.println("Set category: ");
        newCarrier.setCategory(scanner.nextLine());
        movierental.addCarrier(newCarrier);
    }

    private static void addDvd() {
        Carrier newCarrier = new Dvd();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set title: ");
        newCarrier.setName(scanner.nextLine());
        System.out.println("Set category: ");
        newCarrier.setCategory(scanner.nextLine());
        movierental.addCarrier(newCarrier);
    }

    private static void rentVideotape() {
        //to do
    }

    private static void rentDvd() {
        //to do
    }

    private static void printMenu() {

            System.out.println("******MENU******");
        System.out.println(ADD_VIDEOTAPE.getDescription());
        System.out.println(ADD_DVD.getDescription());
        System.out.println(Option.RENT_VIDEOTAPE.getDescription());
        System.out.println(Option.RENT_DVD.getDescription());
        System.out.println(Option.SHOW_CARRIERS.getDescription());
        System.out.println(Option.SORT_CARRIERS_BY_CATEGORY.getDescription());
        System.out.println(Option.SORT_CARRIERS_BY_TITLE.getDescription());
        System.out.println(Option.END_THE_PROGRAM.getDescription());
            System.out.print("> ");
    }

    private static void readOption() {
        Character c = scanner.next().charAt(0);
        while (!c.equals('0')) {
            switch (c) {
                case '1':
                    o = ADD_VIDEOTAPE;
                    break;
                case '2':
                    o = ADD_DVD;
                    break;
                case '3':
                    o = RENT_VIDEOTAPE;
                    break;
                case '4':
                    o = RENT_DVD;
                    break;
                case '5':
                    o = SHOW_CARRIERS;
                    break;
                case '6':
                    o = SORT_CARRIERS_BY_CATEGORY;
                    break;
                case '7':
                    o = SORT_CARRIERS_BY_TITLE;
                    break;
                case '0':
                    o = END_THE_PROGRAM;
                    break;
                default:
                    o = INCORRECT_INSCRIPTION;
            }
        }
    }

    private static void loadSampleData() {
        if (movierental.isEmpty()) {
            //adding sample data
            Dvd dvd1 = new Dvd("Terminator", "action");
            Dvd dvd2 = new Dvd("Terminator 2", "action");
            Dvd dvd3 = new Dvd("Dumb & Dumber", "comedy");
            Dvd dvd4 = new Dvd("Ace Ventura", "comedy");

            Videotape video1 = new Videotape("Terminator 2", "action");
            Videotape video2 = new Videotape("Avengers", "action");
            Videotape video3 = new Videotape("Pocahontas 2", "for kids");

            movierental.addCarrier(dvd1);
            movierental.addCarrier(dvd2);
            movierental.addCarrier(dvd3);
            movierental.addCarrier(dvd4);

            movierental.addCarrier(video1);
            movierental.addCarrier(video2);
            movierental.addCarrier(video3);
        }
    }

    private static void showMovies(Collection<Carrier> movies) {
        System.out.println("-----------------------------------------------------------------");
        for (Carrier carrier : movies) {
            System.out.println("Title: " + carrier.getName() + ", Category: "
                    + carrier.getCategory() + ", carrier: " + carrier.getCarrier()
                    + ", available: " + carrier.isAvailable());
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
