package com.zdziechowski.movierental.carrier;

public class CarrierAlreadyRentException extends RuntimeException {
    private static String CARRIERMESSAGE = "Carrier already rent";

    public static String getCarrierAlreadyRent() {
        return CARRIERMESSAGE;
    }


}
