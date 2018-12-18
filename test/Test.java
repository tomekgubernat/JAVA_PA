import controller.Manager;
import controller.User;
import model.Book;
import model.MediaItems;
import model.Movie;
import model.MusicAlbum;
import org.junit.jupiter.api.BeforeEach;
import persistence.Mediatheque;

import java.util.Date;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test {

    private User user;
    private Manager manager;
    private MediaItems mediaItems;
    private Mediatheque mediatheque;
    private Book book;
    private Movie movie;
    private MusicAlbum musicAlbum;

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

    }
}