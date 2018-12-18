package model;

import java.util.Date;

public class Book extends MediaItems implements Readable {

    private int numberOfPages;

    public Book(String title, String author, Date releaseDate){
        super(title, author, releaseDate);
        this.numberOfPages = numberOfPages;
    }

    public void read(){

    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
