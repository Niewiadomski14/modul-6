package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.Random;

class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String a = poemBeautifier.beautify("bartek", beautify -> (beautify.toUpperCase()));
        System.out.println(a);
        String b = poemBeautifier.beautify("pierogi", decorate -> ("ABC" + decorate + "ABC"));
        System.out.println(b);
        String c = poemBeautifier.beautify("ZIMA", anotherBeautify -> (anotherBeautify.toLowerCase()));
        System.out.println(c);
        String d = poemBeautifier.beautify("Lato", anotherDecorate -> (anotherDecorate.replace("o", " świetlnych")));
        System.out.println(d);
    }
}