package ru.itmo.lessons.lesson6;

import ru.itmo.lessons.lesson6.books.Author;
import ru.itmo.lessons.lesson6.books.Book;
import ru.itmo.lessons.lesson6.books.Shelf;

public class Aplication {
    public static void main(String[] args) {
        Author author1  = new Author();
        Author author2  = new Author();
        author1.name = "Jorjo";
        author1.surname = "Orvany";
        author1.printFullName();

        System.out.println(author1.getFullName());

        Book book1 = new Book();
        book1.setTitle("Book One");
        System.out.println(book1.getTitle());

        Shelf shelf = new Shelf();
        shelf.addBook(book1);
        shelf.addBook(book1, book1, book1);
    }
}
