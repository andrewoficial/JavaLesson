package Lesson1;
public class Homework1 {
    public static void main(String[] args) {
        /**
         * Задача на тернарный оператор:
         * Дана переменная sum - сумма покупки. Если сумма покупки больше 100000, то вывести в консоль
         * сумму к оплате с учетом скидки в 10%, в противном случае вывести в консоль
         * сумму к оплате без скидки.
         **/
        int sum = (int) ( Math.random() * 100000 ) + (int) ( Math.random() * 40000 ) + (int) ( Math.random() * 10000 );
        System.out.println("Сумма покупки: " + sum);
        if(sum > 100000){
            int discount = (sum * 10) / 100;
            sum = sum - discount;
            System.out.println("Скидка была применена. Итоговая сумма к оплате: " + sum);
        }else{
            System.out.println("Скидка не была применена. Итоговая сумма к оплате: " + sum);
        }

        /**
         * Задача на арифметические! операторы
         *
         * Найти сумму цифр 2х значного числа
         *
         * Например,
         *     для числа 45 сумма цифр равна 9
         *     для числа 11 сумма цифр равна 2
         **/

        int randomNumber = (int) ( Math.random() * 1000 );
        int firstNumber = randomNumber / 10;
        int secondNumber = randomNumber % 10;
        int summaRandomNumber = firstNumber + secondNumber;
        System.out.println("Сумма двух цифр двухзначного числа: " + randomNumber + " равна " + summaRandomNumber);

        /**
         * Задача на арифметические операторы
         *
         * Даны длина, ширина и высота прямоугольного параллелепипеда. Найти и вывести в консоль его площадь.
         *
         **/

        double  a = 5;
        double b = 6;
        double c = 7;
        double p = 0;
        double S = 0;
        p = (a + b + c) / 2;
        S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Площадь треугольника: " + S);

        /*
            Сверено с сайтом https://studwork.org/spravochnik/matematika/ploshchad/ploshchad-treugolnika
            Нет проверки на существование треугольника
         */



    }
}
