package controller;

import model.Book;
import model.*;
import view.ItemDetailsPreview;

public class PreviewController {

    public void showDetailInformations(Book book){
        ItemDetailsPreview.previewInfor("TITLE", String.valueOf(book.getTitle()));
        ItemDetailsPreview.previewInfor("AUTHOR", String.valueOf(book.getAuthor()));
        ItemDetailsPreview.previewInfor("DATE", String.valueOf(book.getReleaseDate()));

    }
}
