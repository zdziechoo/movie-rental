package com.zdziechowski.movierental.carrier;

public class CarrierAlreadyRentException extends RuntimeException {

    @SuppressWarnings("SameReturnValue")
    public String getMessage() {
        return "Carrier already rent";
    }
}
