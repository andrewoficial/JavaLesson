package ru.itmo.lessons.lesson6.commodity;

import java.util.Arrays;

public class myProducts {
    private int maxProteins =400;
    private int maxFats = 400;
    private int maxCarbohydrates = 400;
    private int maxCalories = 850;
    private  products[] myProducts = new products[10];
    //private int[] numerics2 = new int[5];   // массив из 5 чисел

    public void addProducts(products productForAdd){
        for (int i = 0; i < myProducts.length; i++) {
            if (myProducts[i] == null){
                if (productForAdd.getCalories() > maxCalories){
                    throw new IllegalArgumentException("Превышен параметр maxCalories");
                }
                if (productForAdd.getCarbohydrates() > maxCarbohydrates){
                    throw new IllegalArgumentException("Превышен параметр maxCarbohydrates");
                }
                if (productForAdd.getFats() > maxFats){
                    throw new IllegalArgumentException("Превышен параметр maxFats");
                }
                if (productForAdd.getProteins() > maxProteins){
                    throw new IllegalArgumentException("Превышен параметр maxProteins");
                }
                myProducts [i] = productForAdd;
                return; //что бы выйти из метода, а не только цикла
            }
        }
        System.out.println("Нет места для продукта");
    }

    public void printProducts(){
        for ( products i: myProducts) {
            if (i == null){

            }else {
                System.out.println(i.getName());
            }
        }
    }

}
