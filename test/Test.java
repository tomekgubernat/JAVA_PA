import controller.Manager;
import controller.User;
import model.Book;
import model.Movie;
import org.junit.jupiter.api.BeforeEach;
import persistence.Mediatheque;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class Test {

    private User user;
    private Manager manager;
    private Mediatheque mediatheque;
    private Book book;
    private Movie movie;

    @BeforeEach
    void test(){
        book = new Book("example1", "example1", new Date(2005), 450);
        movie = new Movie("example2", "example2", new Date(1998), 120);

        mediatheque = new Mediatheque();
        mediatheque.addMediaItems(book);
        mediatheque.removeMediaItems(movie);

        user = new User(mediatheque);
        manager = new Manager(mediatheque);


        @org.junit.jupiter.api.Test
        void checkIfUserCanRentAnAveliableItem(){
            final int userRenatlListAfterRental = 0;
            user.rentItem(movie);
            assertFalse(movie.isAvailable());
            assertEquals(userRenatlListAfterRental, user.getRentedList().size());
        }

        @org.junit.jupiter.api.Test
        void checkIfUserCanRentAnUnaveliableItem(){
            final int userRentalListAfterRental = 0;
            user.rentItem(book);
            assertFalse(book.isAvailable());
            assertEquals(userRentalListAfterRental, user.getRentedList().size());
        }

        @org.junit.jupiter.api.Test
        void checkIfUserReturnItems(){
            final int userRentalListAfterRental = 0;
            user.rentItem(movie);
            user.rentItem(movie);

            assertTrue(movie.isAvailable());
            assertEquals(userRentalListAfterRental, user.getRentedList().size());
        }

        @org.junit.jupiter.api.Test
        void checkIfManagerCanRemoveItemsFromLibrary(){
            final int mediathequeListAfterRemoveItem = 1;
            manager.removeFromMediatheque(movie);
            assertEquals(mediathequeListAfterRemoveItem, mediatheque.getAllMediaItems().size());
        }

        @org.junit.jupiter.api.Test
        void checkIfManagerCanAddItemsFromMediatheque(){
            final int mediathequeListAfterRemoveItem = 3;
            manager.addToMediatheque(book);
            assertEquals(mediathequeListAfterRemoveItem, mediatheque.getAllMediaItems().size());
        }
    }
}