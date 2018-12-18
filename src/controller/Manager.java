package controller;

import model.MediaItems;
import persistence.Mediatheque;

public class Manager extends User {

    public Manager(Mediatheque mediatheque){
        super(mediatheque);
    }

    public void addToMediatheque(MediaItems item){
        mediatheque.addMediaItems(item);
    }

    public void removeFromMediatheque(MediaItems item){
        mediatheque.removeMediaItems(item);

    }
}
