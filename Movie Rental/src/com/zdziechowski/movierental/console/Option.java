package com.zdziechowski.movierental.console;

import com.zdziechowski.movierental.carrier.Carrier;
import com.zdziechowski.movierental.carrier.Dvd;
import com.zdziechowski.movierental.carrier.NoCarrierOrAlreadyRentException;
import com.zdziechowski.movierental.carrier.Videotape;
import com.zdziechowski.movierental.dao.MovieRental;

import java.util.Scanner;

enum Option {

    ADD_VIDEOTAPE("1 - add videotape", '1') {
        void invoke(MovieRental movieRental) {
            Carrier newCarrier = new Videotape();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Set title: ");
            newCarrier.setName(scanner.nextLine());
            System.out.println("Set category: ");
            newCarrier.setCategory(scanner.nextLine());
            movieRental.addCarrier(newCarrier);
        }
    },
    ADD_DVD("2 - add dvd", '2') {

        @Override
        void invoke(MovieRental movieRental) {
            Carrier newCarrier = new Dvd();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Set title: ");
            newCarrier.setName(scanner.nextLine());
            System.out.println("Set category: ");
            newCarrier.setCategory(scanner.nextLine());
            movieRental.addCarrier(newCarrier);
        }
    },
    RENT_VIDEOTAPE("3 - rent videotape", '3') {
        void invoke(MovieRental movieRental) {
            System.out.println("Set title of videotape to rent: ");
            rent(movieRental);
        }
    },
    RENT_DVD("4 - rent dvd", '4') {
        void invoke(MovieRental movieRental) {
            System.out.println("Set title of dvd to rent: ");
            rent(movieRental);
            }
    },
    SHOW_CARRIERS("5 - show carriers", '5') {
        void invoke(MovieRental movieRental) {
            showCarriers(movieRental);
        }
    },
    SORT_CARRIERS_BY_CATEGORY("6 - sort by category", '6') {
        void invoke(MovieRental movieRental) {
            movieRental.sortByCategory();
            showCarriers(movieRental);
        }
    },
    SORT_CARRIERS_BY_TITLE("7 - sort by title", '7') {
        void invoke(MovieRental movieRental) {
            movieRental.sortByTitle();
            showCarriers(movieRental);
        }
    },
    END_THE_PROGRAM("0 - end the program", '0') {
        void invoke(MovieRental movieRental) {
        }

    };

    private String description;
    private Character param;

    Option(String description, Character param) {
        this.description = description;
        this.param = param;
    }

    String getDescription() {
        return description;
    }

    boolean accept(Character c) {
        return c.equals(param);
    }

    abstract void invoke(MovieRental movieRental);

    private static void showCarriers(MovieRental movierental) {
        System.out.println("-----------------------------------------------------------------");
        for (Carrier carrier : movierental.getMovies()) {
            System.out.println("Title: " + carrier.getName() + ", Category: "
                    + carrier.getCategory() + ", carrier: " + carrier.getCarrier()
                    + ", available: " + carrier.isAvailable());
        }
    }

    private static void rent(MovieRental movieRental) {
        Scanner scanner = new Scanner(System.in);
        String titleToRent = scanner.nextLine();
        try {
            movieRental.rentCarrierByTitle(titleToRent);
        } catch (NoCarrierOrAlreadyRentException e) {
            System.out.println(e.getMessage());
        }
    }
}
