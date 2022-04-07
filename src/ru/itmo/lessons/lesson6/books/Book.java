package ru.itmo.lessons.lesson6.books;

import java.util.Objects;

public class Book {
    private String title;
    private int pageCount;
    private Author author;

    public Book(){}

    public Book(Author author) {
        this.author = Objects.requireNonNull(author, "author не мб null");
    }

    public Book(String title, Author author){
        this(author); // вызов конструктора
        setTitle(title); // вызов метода
    }

    public void setTitle(String titleValue) {
        if (titleValue == null || titleValue.length() <3){
            throw new IllegalArgumentException("Значение title от 3 символов");
        }
        title = titleValue;
    }

    public String getTitle(){
        return title;
    }

    public void setPageCount(int pageCount) {
        if (pageCount < 5){
            throw new IllegalArgumentException("Страниц не менее пяти");
        }
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }
}
