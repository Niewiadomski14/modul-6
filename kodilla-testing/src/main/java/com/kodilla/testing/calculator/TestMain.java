package com.kodilla.testing.calculator;

public class TestMain {
    public static void main(String[] args){

        Calculator calculator = new Calculator(4,5);

        Integer result = calculator.add();
        Integer results = calculator.substract();

        if (result.equals(9)) {
            System.out.println("add fine");
        } else {
            System.out.println("add fail");
        }

        if (results.equals(-1)) {
            System.out.println("subtract fine");
        } else {
            System.out.println("subtract fail");
        }

    }

}
