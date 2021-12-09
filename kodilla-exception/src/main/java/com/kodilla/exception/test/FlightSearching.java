package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightSearching {
    public void findFlight(Flight flight) throws RouteNotFoundException{
        HashMap<String,Boolean> map = new HashMap<>();
        map.put("Gdańsk", true);
        map.put("Kraków", true);
        map.put("Warszawa", true);
        map.put("Londyn", true);
        map.put("Paryż", true);

       if(map.containsKey(flight.getArrivalAirport())) {
           System.out.println("Arrival airport is possible: " + flight.arrivalAirport);
       }else{
           throw new RouteNotFoundException("Not possible to land here!");
       }

    }

}
