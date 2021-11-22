package com.kodilla.testing.library;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BookDirectoryTestSuite {
    @Mock
    private LibraryDatabase libraryDatabaseMock;


    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }
    @Test
    void testListBooksWithConditionsReturnList() {
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);                  // [3]
        List<Book> resultListOfBooks = new ArrayList<>();                                // [4]
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);                   // [5]
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);    // [6]
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);    // [7]
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);                 // [8]
        resultListOfBooks.add(book1);                                                    // [9]
        resultListOfBooks.add(book2);                                                    // [10]
        resultListOfBooks.add(book3);                                                    // [11]
        resultListOfBooks.add(book4);                                                    // [12]
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);// [13]

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");        // [14]

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    void testListBooksWithConditionMoreThan20() {

        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);                  // [1]
        List<Book> resultListOf0Books = new ArrayList<Book>();                           // [2]
        List<Book> resultListOf15Books = generateListOfNBooks(15);                       // [3]
        List<Book> resultListOf40Books = generateListOfNBooks(40);                       // [4]
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))                    // [5]
                .thenReturn(resultListOf15Books);                                             // [6]
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))                    // [7]
                .thenReturn(resultListOf0Books);                                              // [8]
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))                   // [9]
                .thenReturn(resultListOf40Books);                                             // [10]
        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");    // [11]
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");   // [12]
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");  // [13]
        // Then
        assertEquals(0, theListOfBooks0.size());                                         // [14]
        assertEquals(15, theListOfBooks15.size());                                       // [15]
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);            // [2]
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);               // [3]
        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");       // [4]
        // Then
        assertEquals(0, theListOfBooks10.size());                                     // [5]
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    void testListBooksInHandsOf() {
        LibraryDatabase libraryDatabasemock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabasemock);
        List<Book> resultListOfBooks = generateListOfNBooks(10);
        LibraryUser user1 = new LibraryUser("Name", "Surname", "Pesel");
        when(libraryDatabasemock.listBooksWithCondition(anyString())).thenReturn(resultListOfBooks);
        //When
        Book book1 = new Book("title","author",2002);
        //Then
        Assert.assertFalse(bookLibrary.rentABook(user1,book1));
        Assert.assertEquals(0,bookLibrary.listBooksInHandsOf(user1).size());
    }
    @Test
    public void testListBooksInHandsOf5Books(){
        //Given
        LibraryDatabase libraryDatabasemock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabasemock);
        List<Book> resultListOfBooks = generateListOfNBooks(5);
        LibraryUser user1 = new LibraryUser("Name", "Surname", "Pesel");
        when(libraryDatabasemock.listBooksWithCondition(anyString())).thenReturn(resultListOfBooks);

        List<Book> bookToRent2 = new ArrayList<Book>(); // List of books to order
        Book book1 = new Book("Title 1","Author 1",1971);
        Book book2 = new Book("Title 2","Author 2",1972);
        Book book3 = new Book("Title 3","Author 3",1973);
        Book book4 = new Book("Title 4","Author 4",1974);
        Book book5 = new Book("Title 5","Author 5",1975);
        //When
        bookToRent2.add(book1);
        bookToRent2.add(book2);
        bookToRent2.add(book3);
        bookToRent2.add(book4);
        bookToRent2.add(book5);
        bookLibrary.rentABook(user1,bookToRent2.get(0));
        bookLibrary.rentABook(user1,bookToRent2.get(1));
        bookLibrary.rentABook(user1,bookToRent2.get(2));
        bookLibrary.rentABook(user1,bookToRent2.get(3));
        bookLibrary.rentABook(user1,bookToRent2.get(4));

        //Then
        Assertions.assertTrue(bookLibrary.rentABook(user1,bookToRent2.get(0)));
        Assertions.assertTrue(bookLibrary.rentABook(user1,bookToRent2.get(1)));
        Assertions.assertTrue(bookLibrary.rentABook(user1,bookToRent2.get(2)));
        Assertions.assertTrue(bookLibrary.rentABook(user1,bookToRent2.get(3)));
        Assertions.assertTrue(bookLibrary.rentABook(user1,bookToRent2.get(4)));

        Assert.assertEquals(5,bookLibrary.listBooksInHandsOf(user1).size());
    }

    @Test
    public void testListBooksInHandsOf1Books(){
        //Given
        LibraryDatabase libraryDatabasemock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabasemock);
        List<Book> resultListOfBooks = generateListOfNBooks(10);
        LibraryUser user1 = new LibraryUser("Name","surname","Pesel");
        when(libraryDatabasemock.listBooksWithCondition(anyString())).thenReturn(resultListOfBooks);
        //When
        Book book1 = new Book("Title 1","Author 1",1971);

        //Then
        Assert.assertTrue(bookLibrary.rentABook(user1,book1));
        Assert.assertEquals(1,bookLibrary.listBooksInHandsOf(user1).size());
    }

}



