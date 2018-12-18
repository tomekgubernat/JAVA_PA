package model;

import java.util.Date;

public class MusicAlbum extends MediaItems implements Listenable {

    private int length;

    public MusicAlbum(String title, String author, Date releaseDate, int length){
        super(title, author, releaseDate);
        this.length = length;
    }

    public void listen(){

    }

    public int getLength() {
        return length;
    }
}
