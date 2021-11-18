package com.kodilla.stream;


import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.SaySomething;

public class SteamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();                                  // [6]
        processor.execute(() -> System.out.println("This is an example text."));  // [7]

    }
}