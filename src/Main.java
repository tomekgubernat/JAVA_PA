import controller.PreviewController;
import model.Book;
import model.Movie;
import model.MusicAlbum;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        PreviewController previewController = new PreviewController();
        Book book = new Book("example1", "example1", new Date(2005), 450);
        Movie movie = new Movie("example2", "example2", new Date(1998), 120);
        MusicAlbum musicAlbum = new MusicAlbum("example3", "example3", new Date(2018), 80);

        previewController.showDetailInformations(book);
    }
}
