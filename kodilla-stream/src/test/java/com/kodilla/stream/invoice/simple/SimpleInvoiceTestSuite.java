package com.kodilla.stream.invoice.simple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleInvoiceTestSuite {

    @Test
    void testGetValueToPay(){
        //Given
        SimpleInvoice invoice = new SimpleInvoice();

        //When
        invoice.addItem(new SimpleItem(new SimpleProduct("Product1", 17.28), 2));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product2", 11.99), 3.5));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product3", 6.49), 5));

        //Then
        assertEquals(108.975, invoice.getValueToPay(), 0.001);
    }
}
