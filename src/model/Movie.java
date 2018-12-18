package model;

import java.util.Date;

public class Movie extends MediaItems implements Watchable, Listenable {

    private int length;

    public Movie(String title, String author, Date releaseDate, int length){
        super(title, author, releaseDate);
        this.length = length;
    }

    public void listen(){

    }

    public void watch(){

    }




    public int getLength() {
        return length;
    }
}
