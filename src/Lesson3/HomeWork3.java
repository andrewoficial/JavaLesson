package Lesson3;
import java.util.Scanner; // импорт сканера

public class HomeWork3 {
    public static void main(String[] args) {
        /**
         Задача на for
         Создайте программу, выводящую на экран первые 55 элементов
         последовательности 1 3 5 7 9 11 13 15 17 ….
         **/
        for(int i = 0, j = -1; i < 56; i++){
            //System.out.println(j = j + 2);
        }


        /**
         Задача на while
         Для введённого пользователем с клавиатуры целого положительного числа посчитайте сумму всех его цифр

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scan.nextInt();
        int answer = 0;
        while(number  > 0) {
            answer = answer + number % 10;
            number = number / 10;
        }
        System.out.print("Сумма цифр в числе: ");
        System.out.println(answer);
         **/
    }
}
