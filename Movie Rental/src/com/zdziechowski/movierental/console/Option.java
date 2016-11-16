package com.zdziechowski.movierental.console;

enum Option {

    ADD_VIDEOTAPE {
        @Override
        String getDescription() {
            return "1 - add videotape";
        }

        void invoke() {

        }

    },
    ADD_DVD {
        @Override
        String getDescription() {
            return "2 - add dvd";
        }

        @Override
        void invoke() {

        }

    },
    RENT_VIDEOTAPE {
        @Override
        String getDescription() {
            return "3 - rent videotape";
        }

        void invoke() {

        }
    },
    RENT_DVD {
        @Override
        String getDescription() {
            return "4 - rent dvd";
        }

        void invoke() {

        }

    },
    SHOW_CARRIERS {
        @Override
        String getDescription() {
            return "5 - show carriers";
        }

        void invoke() {

        }

    },
    SORT_CARRIERS_BY_CATEGORY {
        String getDescription() {
            return "6 - sort by category";
        }

        void invoke() {

        }

    },
    SORT_CARRIERS_BY_TITLE {
        String getDescription() {
            return "7 - sort by title";
        }

        void invoke() {

        }

    },
    END_THE_PROGRAM {
        String getDescription() {
            return "0 - end the program";
        }

        void invoke() {

        }

    },
    INCORRECT_INSCRIPTION {
        String getDescription() {
            return "Incorrect inscription";
        }

        void invoke() {

        }

    },;


    abstract String getDescription();

    abstract void invoke();
}
