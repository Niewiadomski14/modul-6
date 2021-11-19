package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {


    @Mock
    private Temperatures temperaturesMock;


   
    @Test
    void testCalculateForecastWithMock() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();


        //Then
        Assertions.assertEquals(5, quantityOfSensors);

    }


    @Test
    void testCalculateAverage() {
        //Given
        Map<String, Double> temperatureMap = new HashMap<>();
        temperatureMap.put("Rzeszow", 25.5);
        temperatureMap.put("Krakow", 26.2);
        temperatureMap.put("Wroclaw", 24.8);
        temperatureMap.put("Warszawa", 25.2);
        temperatureMap.put("Gdansk", 26.1);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        when(temperaturesMock.getTemperatures()).thenReturn(temperatureMap);
        //When
        Double a = weatherForecast.averageValue();
        //Then
        Assertions.assertEquals(25.56, a);

    }

        @Test
    void testCalculateMedian(){
        //Given
        Map<String, Double> medianMap = new HashMap<>();
        medianMap.put("Rzeszow", 25.5);
        medianMap.put("Krakow", 26.2);
        medianMap.put("Wroclaw", 24.8);
        medianMap.put("Warszawa", 25.2);
        medianMap.put("Gdansk", 26.1);
        medianMap.put("Warszawa", 25.2);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        when(temperaturesMock.getTemperatures()).thenReturn(medianMap);
        //When
        Double b = weatherForecast.calculateMedian();
        //Then
        Assertions.assertEquals(25.8,b);
    }








    }

