package model;

import java.util.Date;

public class MediaItems {
    private String title;
    private String author;
    private Date releaseDate;
    private boolean isAvailable = true;
    private boolean isReserved = false;

    MediaItems(String title, String author, Date releaseDate){
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
    }

    public void setAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }
    public void setReserved(boolean isReserved){
        this.isReserved = isReserved;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    public boolean isReserved() {
        return isReserved;
    }
}
