package com.zdziechowski.movierental.carrier;

public class CarrierAlreadyRentException extends RuntimeException {

    @SuppressWarnings("SameReturnValue")
    private static String getCarrierAlreadyRent() {
        return "Carrier already rent";
    }
}
