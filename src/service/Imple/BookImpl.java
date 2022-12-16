package service.Imple;

import enums.Genre;
import model.Book;
import service.BookService;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BookImpl implements BookService {
    Scanner scanner= new Scanner(System.in);

    @Override
    public List<Book> createBooks(List<Book> books) {
        this.createBooks(books);
        return  books;
    }

    @Override
    public List<Book> getAllBooks(List<Book> books) {
        return books;
    }

    @Override
    public List<Book> getBooksByGenre(List<Book> books,String genre) {
        for (Book book : books) {
           if(Genre.valueOf(genre)){
             return books;
           }

        }
        return null;
    }

    public String removeBookById(List<Book> books, Long id) {
        boolean isRemoved = false;
        for (Book book : this.id){
            if(book.getId().equals(id))
                isRemoved = this.books.remove(books);
        }
        return isRemoved ? "Book REMOVED successfully!" : "Books REMOVE FAILED!";
    }

    @Override
    public List<Book> books sortBooksByPriceInDescendingOrder() {
        books.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if(reversed()) return o2.getPrice() - o1.getPrice();
                return o1.getPrice() - o2.getPrice();
    }

    @Override
    public List<Book> filterBooksByPublishedYear() {
        return null;
    }

    @Override
    public List<Book> getBookByInitialLetter() {
        for (Book book: books) {
            if(book.getAuthor().equals(scanner))
                return books;
    }

    @Override
    public Book maxPriceBook() {

    }
}
