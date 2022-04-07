package ru.itmo.lessons.lesson6.commodity;
import ru.itmo.lessons.lesson6.commodity.products;

public class Application {
    public static void main(String[] args) {
        products apple = new products("Apple", 5, 4, 100, 500);
        products water = new products("Water", 0, 4, 0, 1);
        products oranges = new products("Orange");
        oranges.setCalories(500);
        products egg = new products("Egg", 50, 4, 33, 400);
        products cookie = new products("Cookie", 30, 50, 500, 1000);


        System.out.println(apple.getCalories());

        myProducts dietNumberFive = new myProducts();
        dietNumberFive.addProducts(apple);
        dietNumberFive.addProducts(water);
        dietNumberFive.addProducts(egg);
        dietNumberFive.addProducts(oranges);
        //dietNumberFive.addProducts(cookie);
        System.out.println("");
        System.out.println("Проверка содержимого в корзине:");
        dietNumberFive.printProducts();




    }


}
