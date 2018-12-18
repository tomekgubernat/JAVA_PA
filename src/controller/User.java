package controller;

import model.MediaItems;
import persistence.Mediatheque;

import java.util.ArrayList;

public class User {

    Mediatheque mediatheque;
    ArrayList<MediaItems> rentedList = new ArrayList<>();

    public User(Mediatheque mediatheque){
        this.mediatheque = mediatheque;
    }

//    public void previewItem(){
//
//    }
//
//    public MediaItems search(){
//
//    }

    public void rentItem(MediaItems item){
        if(item.isAvailable() && !(item.isReserved())){
            item.setAvailable(false);
            rentedList.add(item);
        }
    }

    public void returnItem(MediaItems item){
        item.setAvailable(true);
        rentedList.remove(item);
    }

//    public boolean chceckAvailable(){
//
//    }
//    public boolean chceckReserved(){
//
//    }

    public ArrayList<MediaItems> getRentedList() {
        return rentedList;
    }


}
