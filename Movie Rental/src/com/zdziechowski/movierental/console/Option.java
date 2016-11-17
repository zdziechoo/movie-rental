package com.zdziechowski.movierental.console;

import com.zdziechowski.movierental.carrier.Carrier;
import com.zdziechowski.movierental.carrier.Dvd;
import com.zdziechowski.movierental.carrier.Videotape;
import com.zdziechowski.movierental.dao.MovieRental;

import java.util.Scanner;

enum Option {

    ADD_VIDEOTAPE {
        @Override
        String getDescription() {
            return "1 - add videotape";
        }

        void invoke(MovieRental movierental) {
            Carrier newCarrier = new Videotape();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Set title: ");
            newCarrier.setName(scanner.nextLine());
            System.out.println("Set category: ");
            newCarrier.setCategory(scanner.nextLine());
            movierental.addCarrier(newCarrier);
        }

    },
    ADD_DVD {
        @Override
        String getDescription() {
            return "2 - add dvd";
        }

        @Override
        void invoke(MovieRental movierental) {
            Carrier newCarrier = new Dvd();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Set title: ");
            newCarrier.setName(scanner.nextLine());
            System.out.println("Set category: ");
            newCarrier.setCategory(scanner.nextLine());
            movierental.addCarrier(newCarrier);
        }

    },
    RENT_VIDEOTAPE {
        @Override
        String getDescription() {
            return "3 - rent videotape";
        }

        void invoke(MovieRental movierental) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Set title of videotape to rent: ");
            String titleToRent = scanner.nextLine();
            movierental.rentCarrierByTitle(titleToRent);
        }
    },
    RENT_DVD {
        @Override
        String getDescription() {
            return "4 - rent dvd";
        }

        void invoke(MovieRental movierental) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Set title of dvd to rent: ");
            String titleToRent = scanner.nextLine();
            movierental.rentCarrierByTitle(titleToRent);
        }

    },
    SHOW_CARRIERS {
        @Override
        String getDescription() {
            return "5 - show carriers";
        }

        void invoke(MovieRental movierental) {
            System.out.println("-----------------------------------------------------------------");
            for (Carrier carrier : movierental.getMovies()) {
                System.out.println("Title: " + carrier.getName() + ", Category: "
                        + carrier.getCategory() + ", carrier: " + carrier.getCarrier()
                        + ", available: " + carrier.isAvailable());
            }
        }

    },
    SORT_CARRIERS_BY_CATEGORY {
        String getDescription() {
            return "6 - sort by category";
        }

        void invoke(MovieRental movierental) {

        }

    },
    SORT_CARRIERS_BY_TITLE {
        String getDescription() {
            return "7 - sort by title";
        }

        void invoke(MovieRental movierental) {

        }

    },
    END_THE_PROGRAM {
        String getDescription() {
            return "0 - end the program";
        }

        void invoke(MovieRental movierental) {

        }

    },
    INCORRECT_INSCRIPTION {
        String getDescription() {
            return "Incorrect inscription";
        }

        void invoke(MovieRental movierental) {

        }

    },;


    abstract String getDescription();

    abstract void invoke(MovieRental movierental);
}
