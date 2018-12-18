package controller;

import model.Book;
import model.*;
import view.ItemDetailsPreview;

public class PreviewController {

    public void showDetailInformations(Book book){
        ItemDetailsPreview.previewInfor("TITLE", String.valueOf(book.getTitle()));
        ItemDetailsPreview.previewInfor("AUTHOR", String.valueOf(book.getAuthor()));
        ItemDetailsPreview.previewInfor("DATE", String.valueOf(book.getReleaseDate()));
        ItemDetailsPreview.previewInfor("NUMBER OF PAGES", String.valueOf(book.getNumberOfPages()));

    }
    public void showDetailInformations(Movie movie){
        ItemDetailsPreview.previewInfor("TITLE", String.valueOf(movie.getTitle()));
        ItemDetailsPreview.previewInfor("AUTHOR", String.valueOf(movie.getAuthor()));
        ItemDetailsPreview.previewInfor("DATE", String.valueOf(movie.getReleaseDate()));
        ItemDetailsPreview.previewInfor("LENGHT", String.valueOf(movie.getLength()));

    }
    public void showDetailInformations(MusicAlbum musicAlbum){
        ItemDetailsPreview.previewInfor("TITLE", String.valueOf(musicAlbum.getTitle()));
        ItemDetailsPreview.previewInfor("AUTHOR", String.valueOf(musicAlbum.getAuthor()));
        ItemDetailsPreview.previewInfor("DATE", String.valueOf(musicAlbum.getReleaseDate()));
        ItemDetailsPreview.previewInfor("LENGHT", String.valueOf(musicAlbum.getLength()));

    }
}
