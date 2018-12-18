package model;

import java.util.Date;

public class MediaItems {
    private String title;
    private String author;
    private Date releaseDate;
    private boolean availability;

    MediaItems(String title, String author, Date releaseDate){
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
    }

    public void setAvailability(boolean availability){
        this.availability = availability;
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

    public boolean isAvailability() {
        return availability;
    }
}
