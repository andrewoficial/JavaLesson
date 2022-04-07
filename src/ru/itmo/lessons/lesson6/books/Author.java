package ru.itmo.lessons.lesson6.books;

public class Author {
    //Св-ва (характеристики поля атрибуты)
    public String name;
    public String surname;
    public void printFullName(){
        //'return;' - for break
        System.out.println(name + ' ' + surname);
    }

    public String getFullName(){
        return name + ' ' + surname;
    }
}
