package com.kodilla.testing.weather.stub;


import java.lang.reflect.Array;
import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }



    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();


        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);

        }

        return resultMap;
    }

    public Double averageValue() {

        Map<String, Double> result = new HashMap<>();


        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            result.put(temperature.getKey(), temperature.getValue());
        }

        Double average = 0.0;
        Double sum = 0.0;
        for (Double e : result.values()) {
            sum += e;
            average = (sum / result.size());
        }
        return average;

    }

     public Double calculateMedian() {
        Map<String, Double> medianMaps = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            medianMaps.put(temperature.getKey(), temperature.getValue());
        }
        Double median = 0.0;
        int n = medianMaps.size();

           Object[] objectArray = medianMaps.values().toArray();
           Arrays.sort(objectArray);
            if(n%2==1) {
                median = (Double) objectArray[(n + 1) / 2];
            }else
            {
                median = ((Double)objectArray[n/2-1] + (Double)objectArray[n/2])/2;
            }

        return median;
    }







        }












