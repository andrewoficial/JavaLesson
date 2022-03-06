package Lesson2;
import java.util.Scanner; // импорт сканера
public class HomeWork2 {
    public static void main(String[] args) {
        /**
         * Задача на if
         *
         * Дана целочисленная переменная count - количество верных ответов.
         * В зависимости от значения этой переменной вывести в консоль оценку:
         *  100 - 90 правильных ответов - отлично
         *  89 - 60 правильных ответов - хорошо
         *  59 - 40 правильных ответов - удовлетворительно
         *  39 - 0 правильных ответов - попробуйте в следующий раз
         *
         **/

        int count = (int) (Math.random() * 99);
        System.out.println("Верных ответов: " + count);
        if(count > 100){
            System.out.println("Верных ответов слишком много...");
        }else if(100 > count && count> 90){
            System.out.println("Отлично");
        }else if(89 > count && count> 60){
            System.out.println("Хорошо");
        }else if(59 > count && count> 40){
            System.out.println("Удовлетворительно");
        }else if(39 > count && count> 0){
            System.out.println("Попробуйте в следующий раз");
        }else{
            System.out.println("Непредвиденное значение верных ответов...");
        }


        /**
         * Задача на switch
         *
         * Пользователь вводит 3 числа:
         *
         *     первый операнд
         *     второй операнд
         *     оператор
         *
         * В зависимости от третьего введенного числа нужно вывести в консоль: сумму, разность, умножение, деления чисел, которые ввел пользователь.
         *
         * Если третье введенное число:
         *
         *     3 - нужно найти сумму,
         *     5 - разность,
         *     7 - результат умножения,
         *     9 - результат деления.
         **/
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int number1 = scan.nextInt();
        System.out.print("Введите второе число: ");
        int number2 = scan.nextInt();
        System.out.print("Введите операцию \n 3 - сумма \n 5 - разность \n 7 - умножение \n 9 - деление \n для двух чисел: ");
        int command = scan.nextInt();
        System.out.println ("Вы ввели команду " + command);
        double answer = 0;
        switch (command){
            case 3:
                answer = number1 + number2;
                System.out.println ("Сумма: " + answer);
                break;
            case 5:
                answer = number1 - number2;
                System.out.println ("Разность: " + answer);
                break;
            case 7:
                answer = number1 * number1;
                System.out.println ("Произведение: " + answer);
                break;
            case 9:
                answer = number1 / number2;
                System.out.println ("Отношение: " + answer);
                break;
            default:
                answer = 0;
                System.out.println ("Неизвестная команда ");
                break;
        }


        /**
         *
         *Задача на Math.random() и if
         *
         * Написать код, который будет проверять попало ли случайно сгенерированное целое число из отрезка [10;500]
         * в интервал (25;200) и выводить результат в консоль.
         *
         * Примеры работы программы:
         *
         *     Число 345 не содержится в интервале (25;200)
         *     Число 110 содержится в интервале (25;200)
         *
         **/

        double randomNumber = 10 + (int) (Math.random() * 500);
        if( randomNumber > 25 && randomNumber < 200){
            System.out.println ("Число " + randomNumber + " содержится в интервале (25;200)");
        }else{
            System.out.println ("Число " + randomNumber + " не содержится в интервале (25;200)");
        }

        /**
         *
         * Задача на if
         *
         * Даны переменные age и exp.
         * Если значение переменной age больше 100, вывести в консоль "Мы Вам перезвоним".
         * В противном случае перейти к проверке exp.
         * Если значение exp меньше 5, вывести в консоль "Вы подходите на должность стажера".
         * Если значение exp больше или равно 5, вывести в консоль "Вы подходите на должность разработчика".
         *
         **/

        int age = (int) (Math.random() * 100);
        int exp = (int) (Math.random() * 10);

        if(age > 100){
            System.out.println ("Мы Вам перезвоним");
        }else if(exp < 5){
            System.out.println ("Вы подходите на должность стажера");
        }else{
            System.out.println ("Вы подходите на должность разработчика");
        }

    }
}
