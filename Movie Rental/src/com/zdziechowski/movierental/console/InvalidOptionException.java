package com.zdziechowski.movierental.console;

/**
 * Created by Asus on 2016-11-23.
 */
public class InvalidOptionException extends RuntimeException {
    public String getMessage() {
        return "Invalid option choosen";
    }

}
