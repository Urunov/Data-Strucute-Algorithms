package com.example.ec.service;

/**
 * Tour Exception
 *
 * Created by Mary Ellen Bowman
 */
public class TourException  extends Exception{
    /**
     * Tour Exception with message.
     *
     * @param message text description
     */
    public TourException(String message) {
        super(message);
    }

    /**
     * Tour Exception with original cause and message
     *
     * @param message text description
     * @param cause originally caught exception
     */
    public TourException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
    * Tour Exception with original cause
    *
    * @param cause originally caught exception
    */
    public TourException(Throwable cause) {
        super(cause);
    }
}
