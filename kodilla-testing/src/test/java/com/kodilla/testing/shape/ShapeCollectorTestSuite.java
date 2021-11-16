package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests(){
        System.out.println("Begin");
    }
    @AfterAll
    public static void afterAllTests(){
        System.out.println("End");
    }
    @BeforeEach
    public void beforeEveryTest(){
        testCounter++;
        System.out.println(" test number #" + testCounter);
    }
    @AfterEach
    public void afterEveryTest(){
        System.out.println("Test done");
    }
    @Nested
    @DisplayName("Test about adding")
    class AddingTest{
        @Test
        public void testAddFigure(){
            //given
            ShapeCollector o = new ShapeCollector();
            //when
            Shape circle = new Circle(5.0);
            boolean result = o.addFigure(circle);
            //then
            Assertions.assertTrue(result);
        }
    }
    @Nested
    @DisplayName("Test about removing")
    class RemovingTest{
        @Test
        public void testRemovingFigure(){
            //given
            ShapeCollector o = new ShapeCollector();
            Shape circle = new Circle(2.0);
            o.addFigure(circle);
            //when
            boolean result = o.removeFigure(circle);
            //then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, o.shapesListSize());
        }
    }
    @Nested
    @DisplayName("Test about getting")
    class GettingTest{
        @Test
        public void testGettingFigure(){
            //given
            ShapeCollector o = new ShapeCollector();
            Shape circle = new Circle(5.0);
            o.addFigure(circle);
            //when
            Shape figure = o.getFigure(15313);
            //then
            Assertions.assertEquals(null, figure);
        }
    }
    @Nested
    @DisplayName("Test about showing")
    class ShowingTest{
        @Test
        public void showFigure(){
            //given
            ShapeCollector o = new ShapeCollector();
            Shape circle = new Circle(5.0);
            o.addFigure(circle);
            //then
            Assertions.assertEquals(1,o.shapesListSize());
        }

    }





}
