package controller;

import model.MediaItems;
import persistence.Mediatheque;

public class Manager extends User {

    public Manager(Mediatheque mediatheque){
        super(mediatheque);
    }

    public void addToMediatheque(MediaItems item){
        if (item == null){
            return;
        }
        mediatheque.addMediaItems(item);
    }

    public void removeFromMediatheque(MediaItems item){
        if (item == null){
            return;
        }
        mediatheque.removeMediaItems(item);

    }
}
