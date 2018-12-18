package persistence;

import model.MediaItems;

import java.util.ArrayList;

public class Mediatheque {

    private ArrayList<MediaItems> allMediaItems = new ArrayList<>();

    public void addMediaItems(MediaItems item){
        allMediaItems.add(item);
    }
    public void removeMediaItems(MediaItems item){
        allMediaItems.remove(item);
    }
    public void editDateInMediaItems(MediaItems item){

    }

    public ArrayList<MediaItems> getAllMediaItems() {
        return allMediaItems;
    }
}
