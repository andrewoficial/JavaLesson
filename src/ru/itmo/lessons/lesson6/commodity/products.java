package ru.itmo.lessons.lesson6.commodity;
import java.util.Objects;


public class products {
    private String name;
    private int proteins, fats, carbohydrates, calories;

    //Constructors
    public products(){
    }

    public products(String name){
        if (name == null || name.length() <3){
            throw new IllegalArgumentException("name у продукта не м.б. null или меньше трех");
        }
        this.name = name;
    }

    public products(String name, int proteins){
        this(name);
        setProteins(proteins);
    }

    public products(String name, int proteins, int fats){
        this(name, proteins);
        setFats(fats);
    }

    public products(String name, int proteins, int fats, int carbohydrates){
        this(name, proteins, fats);
        setCarbohydrates(carbohydrates);
    }

    public products(String name, int proteins, int fats, int carbohydrates, int calories){
        this(name, proteins, fats, carbohydrates);
        setCalories(calories);
    }

    //Getters and Setters
    public void setName(String nameValue, int proteins) {
        if (nameValue == null || nameValue.length() <3){
            throw new IllegalArgumentException("name у продукта не м.б. null или короче трех");
        }
        name = nameValue;
    }

    public String getName(){
        return name;
    }

    public void setProteins(int value) {
        if (value < 0){
            throw new IllegalArgumentException("Proteins у продукта не м.б. меньше 0");
        }
        this.proteins = value;
    }

    public int getProteins(){
        return proteins;
    }

    public int getFats() {
        return fats;
    }

    public void setFats(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Fats у продукта не м.б. меньше 0");
        }
        this.fats = value;
    }

    public int getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("carbohydrates у продукта не м.б. меньше 0");
        }
        this.carbohydrates = value;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("calories у продукта не м.б. меньше 0");
        }
        this.calories = value;
    }
}
