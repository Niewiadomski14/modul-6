package com.kodilla.exception.test;

public class FlightSearchingApp {

    public static void main(String[] args) {

        Flight flight = new Flight("Gdańsk", "Poznań");
        FlightSearching flightSearching = new FlightSearching();

        try{
            flightSearching.findFlight(flight);
        }catch(RouteNotFoundException e){
            System.out.println(e);
        }

    }
}