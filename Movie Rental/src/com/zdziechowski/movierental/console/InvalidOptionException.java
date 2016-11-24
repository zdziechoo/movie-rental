package com.zdziechowski.movierental.console;

class InvalidOptionException extends RuntimeException {
    public String getMessage() {
        return "Invalid option";
    }

}
