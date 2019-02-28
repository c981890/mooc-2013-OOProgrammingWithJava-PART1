
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aikitrumm
 */
public class Library {

    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        this.books.add(newBook);
    }

    public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();
        // iterate the list of books and add all the matching books to the list found

        for (Book book : this.books) {
//            System.out.println("browsed book " + book.title());
//            System.out.println(StringUtils.included(book.title(), title));
            if (StringUtils.included(book.title(), title)) {
                // Book found!
//                System.out.println("book title" + book.title());
                found.add(book);
//                System.out.println("added book" + book);
            }
        }
//        System.out.println("found books" + found);
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        // iterate the list of books and add all the matching books to the list found

        for (Book book : this.books) {
            if (StringUtils.included(book.publisher(), publisher)) {
                // Book found!
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        // iterate the list of books and add all the matching books to the list found

        for (Book book : this.books) {
            if (book.year() == year) {
                found.add(book);
            }
        }
        return found;
    }

}
