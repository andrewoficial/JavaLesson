package Lesson4;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        /**
         *
         *Задача 1
         *
         * Заполните массив на N элементов случайным целыми числами и
         * выведете максимальное, минимальное и среднее значение
         *
         **/

        System.out.println("==== Задача 1 ====");
        int lenght = (int) (5 + Math.random() * 10);
        int[] arr1 = new int[lenght];

        double avg = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 10);
            avg += (double) arr1[i] / arr1.length;
        }
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println("MIN " + arr1[0]);
        System.out.println("MAX " + arr1[arr1.length - 1]);
        System.out.println("AVG " + avg);

        System.out.println("");
        /**
         *
         * Задача 2
         *
         * Создайте массив из чётных чисел [2;20] и
         * выведите элементы массива в консоль в обратном порядке (20 18 16 ... 4 2)
         *
         **/
        System.out.println("==== Задача 2 ====");
        int[] arr2 = new int[10];
        for (int i = 0, element = 2; i < arr2.length; i++, element += 2) {
            arr2[i] = element;
        }

        System.out.println(Arrays.toString(arr2));

        for (int i = arr2.length - 1; i >= 0; i -= 1) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        System.out.println("");

        /**
         *
         * Задача 3
         *
         * Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив в консоль.
         * Определите какой элемент встречается в массиве чаще всего и выведите информацию об этом в консоль.
         * Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.
         *
         **/
        System.out.println("==== Задача 3 ====");
        int[] arr3 = new int[10];
        for (int i = 0; i < arr2.length; i++) {
            int number = (int) (Math.random() * 10);
            if(number > 7){
                arr3[i] = -1;
            }else if (number > 4 && number < 7){
                arr3[i] = 0;
            }else{
                arr3[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr3));

        int[] counts = new int[3]; // [0] для -1, [1] для 0, [2] для 1
        int countPos = 0;
        int countZer = 0;
        int countNeg = 0;
        for (int element : arr3) {
            if (element == -1) counts[0] += 1;
            else if (element == 0) counts[1] += 1;
            else counts[2] += 1;
        }

        if (counts[2] > counts[0] && counts[2] > counts[1]) {
            System.out.println("1 встречается " + counts[2] + " раз(а)");
        } else if (counts[0] > counts[1] && counts[0] > counts[2]) {
            System.out.println("-1 встречается " + counts[0] + " раз(а)");
        } else if (counts[1] > counts[0] && counts[1] > counts[2]) {
            System.out.println("0 встречается " + counts[1] + " раз(а)");
        }
        System.out.println("");

        /**
         *
         * Задача 4
         *
         * Задан одномерный массив целых чисел. Образуйте из него два
         * отсортированных по возрастанию массива, содержащих четные и нечетные числа.
         *
         **/
        System.out.println("==== Задача 4 ====");
        int[] arr4 = new int[10];
        for (int i = 0; i < arr2.length; i++) {
            arr4[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr4));

        int evenCount = 0; // четные
        int oddCount = 0; // нечетные

        for (int element : arr4) {
            if (element % 2 == 0) evenCount += 1;
            else oddCount += 1;
        }

        int[] evenArr = new int[evenCount];
        int[] oddArr = new int[oddCount];

        int evenIndex = 0; // четные
        int oddIndex = 0; // нечетные

        for (int element : arr4) {
            if (element % 2 == 0) {
                evenArr[evenIndex] = element;
                evenIndex += 1;
            } else {
                oddArr[oddIndex] = element;
                oddIndex += 1;
            }
        }
        Arrays.sort(evenArr);
        Arrays.sort(oddArr);

        System.out.println(Arrays.toString(evenArr));
        System.out.println(Arrays.toString(oddArr));

        System.out.println("");


        /**
         *
         * Задача 5
         *
         * Задать массив. Отрицательные элементы массива
         * перенести в новый массив. Размер массива должен быть
         * равен количеству отрицательных элементов.
         *
         **/
        System.out.println("==== Задача 5 ====");
        int[] arr5 = new int[10];
        for (int i = 0; i < arr2.length; i++) {
            int sign = (int) (Math.random() * 10);
            int number = (int) (Math.random() * 100);
            if(sign > 6){
                arr5[i] = -1 * number;
            }else if (sign > 3 && sign < 6){
                arr5[i] = 0;
            }else{
                arr5[i] = number;
            }
        }
        System.out.println(Arrays.toString(arr5));
        int negCount = 0;
        for (int element : arr5) {
            if (element < 0) negCount += 1;
        }
        int[] negArr = new int[negCount];
        int negIndex = 0;
        for (int element : arr5) {
            if (element < 0) {
                negArr[negIndex] = element;
                negIndex += 1;
            }
        }
        System.out.println(Arrays.toString(negArr));
        System.out.println("");

        System.out.println("==== Задача 6.1 ====");
        /**
         *
         * Разобрать алгоритм быстрой сортировки, объяснить работу метода Arrays.sort
         *
         **/

        /*
        Обычный quicksort делит массив на два отрезка, выбрав случайный элемент P.
        Потом сортирует массив так, чтобы все элементы меньше P попали в первый отрезок,
        а остальные — во второй.
        Затем алгоритм рекурсивно повторяется на первом и на втором отрезках.

        Dual-pivot quicksort делит массив на три отрезка, вместо двух.
        В результате количество операций перемещения элементов массива существенно сокращается.

        Обычный quicksort работает медленно, когда во входных данных много повторяющихся величин.
        Этот алгоритм их просто убирает из дальнейшего рассмотрения.

        Ссылки по теме:
            https://coderlessons.com/articles/java/quicksorting-3-way-i-dual-pivot
            https://habr.com/ru/post/69424/
            https://www.geeksforgeeks.org/dual-pivot-quicksort/
         */

        // Java program to implement
        // dual pivot QuickSort
        class GFG{

            static void swap(int[] arr, int i, int j) //Функция перемены местами двух значений массива
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            static void dualPivotQuickSort(int[] arr, int low, int high) //Функция сортировки (на входе массив, от и до, разбивает на куски)
            {
                if (low < high)
                {
                    // piv[] stores left pivot and right pivot.
                    // piv[0] means left pivot and
                    // piv[1] means right pivot
                    int[] piv;
                    piv = partition(arr, low, high);

                    dualPivotQuickSort(arr, low, piv[0] - 1); //Рекурсия.........
                    dualPivotQuickSort(arr, piv[0] + 1, piv[1] - 1); //Рекурсия.........
                    dualPivotQuickSort(arr, piv[1] + 1, high); //Рекурсия.........
                    //Итого разбили на три части
                }
            }

            static int[] partition(int[] arr, int low, int high)
            {
                if (arr[low] > arr[high])
                    swap(arr, low, high);

                // p is the left pivot, and q
                // is the right pivot.
                int j = low + 1;
                int g = high - 1, k = low + 1,
                        p = arr[low], q = arr[high];

                while (k <= g)
                {

                    // If elements are less than the left pivot
                    if (arr[k] < p)
                    {
                        swap(arr, k, j);
                        j++;
                    }

                    // If elements are greater than or equal
                    // to the right pivot
                    else if (arr[k] >= q)
                    {
                        while (arr[g] > q && k < g)
                            g--;

                        swap(arr, k, g);
                        g--;

                        if (arr[k] < p)
                        {
                            swap(arr, k, j);
                            j++;
                        }
                    }
                    k++;
                }
                j--;
                g++;

                // Bring pivots to their appropriate positions.
                swap(arr, low, j);
                swap(arr, high, g);

                // Returning the indices of the pivots
                // because we cannot return two elements
                // from a function, we do that using an array.
                return new int[] { j, g };
            }

            // Driver code
            public static void main(String[] args)
            {
                int[] arr = { 24, 8, 42, 75, 29, 77, 38, 57 };

                dualPivotQuickSort(arr, 0, 7); //Задает параметры сортировки  С и ПО индексы будут отсортированы

                System.out.print("Sorted array: ");
                for (int i = 0; i < 8; i++)
                    System.out.print(arr[i] + " ");

                System.out.println();
            }
        }

        // This code is contributed by Gourish Sadhu
        GFG.main(args);
        System.out.println("");

        /**
         * Разобрать методы класса Arrays:
         * compare
         *
         **/

        System.out.println("==== Задача 6.2 ====");

        //defining arrays to be compare
        int[] a1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        int[] a2 = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        //comparing references using == operator
        //works the same as a1.equals(a2)
        if (a1 == a2)
            System.out.println("Arrays are equal.");
        else
            System.out.println("Arrays are not equal.");
        /*
        In the above example, a1 and a2 are the two references of two different objects.
        When we compare two reference variables, we get the output Arrays are not equal,
        while both the arrays are of equal length, and having the same elements.
        We are not getting the desired output because the equals (==) operator compare them as an object.
        */
        System.out.println("");


        System.out.println("==== Задача 6.3 ====");
        /*
        Метод copyOfRange (int [] original, int from, int to) в Java класса java.util.Arrays
        копирует указанный диапазон указанного массива в новый массив.
        Окончательный индекс диапазона (до), который должен быть больше или равен от, может быть больше исходного.
        Длина, в этом случае 0 помещается во все элементы копии, индекс которой больше или равен оригиналу.
        Длина – от. Длина возвращаемого массива будет до – от предыдущего.
         */

        int[] arr10 = new int[] {5, 62, 15};
        System.out.println("Printing 1st array:");
        for (int i = 0; i < arr10.length; i++) {
            System.out.println(arr10[i]);
        }
        int[] arr20 = Arrays.copyOfRange(arr10, 2, 6);
        System.out.println("Printing new array:");
        for (int i = 0; i < arr20.length; i++) {
            System.out.println(arr20[i]);
        }
        System.out.println("");


        System.out.println("==== Задача 6.4 ====");
        /*
        Java Arrays class provides the equals() method to compare two arrays.
        It iterates over each value of an array and compares the elements using the equals() method.
         */
        //defining array to compare
        int[] array1 = new int[] {'a', 'b', 'c', 'd', 'e'};
        int[] array2 = new int[] {'a', 'b', 'c', 'd', 'e'};
        //comparing two arrays using equals() method
        if (Arrays.equals(array1, array2))
            System.out.println("Arrays are equal.");
        else
            System.out.println("Arrays are not equal.");


        //defining array to compare
        String[] toinarray3 = new String[] {"mango", "grapes", "plum", "watermelon", "apple"};
        String[] toinarray4 = new String[] {"mango", "grapes", "plum", "watermelon", "apple"};
        Object[] array3 = {toinarray3};  // array3 have only one element
        Object[] array4 = {toinarray4};  // array4 also have only one element
        //comparing two arrays using equals() method
        if (Arrays.equals(array3, array4))
            System.out.println("Arrays are equal.");
        else
            System.out.println("Arrays are not equal.");
        /*
        In the above example, we see that the equals() method is not able to perform a deep comparison.
        To resolve this problem, the Java Arrays class provides another method deepEquals() that deeply compares the two arrays.
         */
        System.out.println("");


        System.out.println("==== Задача 6.5 ====");
        /*
        Java Arrays class provides another method deepEquals() to deeply compare the array.
        Here, deeply compare means it can compare two nested arrays of arbitrary depth.
        Two arrays object reference e1 and e2 are deeply equal if they hold any of the following condition:
            e1=e2
            equals(e2) returns true.
            If e1 and e2 are both the same primitive type the overloading of the method Arrays.equals(e1, e2) returns true.
            If e1 and e2 are both arrays of object reference types, the method Arrays.deepEquals(e1, e2) returns true.
         */
        if (Arrays.deepEquals(array3, array4))
            System.out.println("Arrays are equal.");
        else
            System.out.println("Arrays are not equal.");

        System.out.println("");
        System.out.println("==== Задача 6.6 ====");
        /*
        Эти новые методы используются для поиска первого индекса несоответствия между двумя массивами.
        Например, следующий код обнаруживает первое несоответствие между двумя целочисленными массивами.
        Если несоответствия нет, этот метод вернет -1.
        */

        int[] ints1 = {1, 3, 5, 7, 9};
        int[] ints2 = {1, 3, 5, 6, 7};
        int i = Arrays.mismatch(ints1, ints2);
        System.out.println(i); //3






















}

}
