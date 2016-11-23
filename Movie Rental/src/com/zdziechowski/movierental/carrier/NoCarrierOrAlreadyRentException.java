package com.zdziechowski.movierental.carrier;

/**
 * Created by Asus on 2016-11-17.
 */
public class NoCarrierOrAlreadyRentException extends RuntimeException {
    public String getMessage() {
        return "No carrier in the collection or already rent";
    }
}
