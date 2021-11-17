package com.kodilla.testing.collection;


import org.junit.jupiter.api.*;


import java.util.ArrayList;

@DisplayName("This is a CollectionTestSuite")
public class CollectionTestSuite {
    @BeforeAll
    public static void beforeAllTest(){
        System.out.println("start");
    }
    @AfterAll
    public static void after(){
        System.out.println("end");
    }
    @BeforeEach
    public void beforeEveryTest() {
        System.out.println("Test Suite: start");
    }
    @AfterEach
    public void afterEveryTest() {
        System.out.println("Test Suite: end");
    }
    @Test
    @DisplayName("test if the list is empty")
    public void testOddNumbersExterminatorEmptyListTest(){
        //Given
        ArrayList<Integer>list1 = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> results = (ArrayList<Integer>) exterminator.exterminate(list1);
        //Then
        System.out.println("Testing empty list: " + results);
        Assertions.assertEquals(0, results.size());
    }
    @Test
    @DisplayName("test to see if the program gives even numbers")
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumbersExterminatorFull = new OddNumbersExterminator();
        ArrayList<Integer> fullNumbers = new ArrayList<>();
        ArrayList<Integer> result;
        fullNumbers.add(0);
        fullNumbers.add(1);
        fullNumbers.add(2);
        fullNumbers.add(3);
        fullNumbers.add(4);
        fullNumbers.add(5);
        fullNumbers.add(6);
        //When
        result = (ArrayList<Integer>) oddNumbersExterminatorFull.exterminate(fullNumbers);
        //Then
        Assertions.assertEquals(4, result.size());
    }
}
