import controller.Manager;
import controller.PreviewController;
import controller.User;
import model.Book;
import model.Movie;
import model.MusicAlbum;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        User user = new User(null);
        Manager manager = new Manager(null);

        Book book = new Book("example1", "example1", new Date(2005), 450);
        Movie movie = new Movie("example2", "example2", new Date(1998), 120);
        MusicAlbum musicAlbum = new MusicAlbum("example3", "example3", new Date(2018), 80);

        PreviewController previewController = new PreviewController();


        previewController.showDetailInformations(book);
        previewController.showDetailInformations(movie);
        previewController.showDetailInformations(musicAlbum);

    }
}
