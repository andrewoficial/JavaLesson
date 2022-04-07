package ru.itmo.lessons.lesson6.books;

public class Shelf {
    private String color = "white";
    private Book[] books = new Book[10];

    public void addBook(Book book){
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null){
                books [i] = book;
                return; //что бы выйти из метода, а не только цикла
            }
        }
        System.out.println("Нет места для книги");
    }

    public void addBook(Book... book){

    }
}
