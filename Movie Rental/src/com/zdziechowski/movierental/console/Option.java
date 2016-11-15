package com.zdziechowski.movierental.console;

/**
 * Created by Asus on 2016-11-15.
 */
enum Option {

    ADD_VIDEOTAPE {
        @Override
        String getDescription() {
            return "1 - add videotape";
        }
    },
    ADD_DVD {
        @Override
        String getDescription() {
            return "2 - add dvd";
        }
    },
    RENT_VIDEOTAPE {
        @Override
        String getDescription() {
            return "3 - rent videotape";
        }
    },
    RENT_DVD {
        @Override
        String getDescription() {
            return "4 - rent dvd";
        }
    },
    SHOW_CARRIERS {
        @Override
        String getDescription() {
            return "5 - show carriers";
        }
    },
    SORT_CARRIERS_BY_CATEGORY {
        String getDescription() {
            return "6 - sort by category";
        }

    },
    SORT_CARRIERS_BY_TITLE {
        String getDescription() {
            return "7 - sort by title";
        }
    },
    END_THE_PROGRAM {
        String getDescription() {
            return "0 - end the program";
        }
    };


    abstract String getDescription();
}
