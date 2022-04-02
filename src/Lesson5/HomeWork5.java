package Lesson5;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        System.out.println("==== Задача 1 ====");
        /**
         *
         *Задача 1
         *
         * Задать массив на N слов. В цикле считывать с консоли слова (scanner.nextLine()), и добавлять их в массив
         * (добавлять новое слово в массив можно только, если в нем его еще нет).
         * В итоге в массиве будут только уникальные слова.
         *
         * Выход их программы по слову exit (слово 'exit' в массив не добавлять) или если массив заполнен
         * Перед завершением программы, вывести получившийся массив в консоль
         *
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int arrSize = sc.nextInt();
        sc.nextLine();

        String[] words = new String[arrSize];
        for (int i = 0; i < words.length; i += 1) {
            System.out.println("Введите слово");
            String word = sc.nextLine();
            if ("exit".equals(word)) break;

            for (String fromArr : words) {
                if (word.equalsIgnoreCase(fromArr)) {
                    System.out.println("Такое слово уже есть");
                    i -= 1;
                    break;
                }
                if (fromArr == null) words[i] = word;
            }

        }
        System.out.println(Arrays.toString(words));
        System.out.println("");

        /**
         * Задача 2
         *
         * Заменить все буквы в слове на строчные, а первую букву на заглавную. Например, дано hello, получаем Hello / дано HeLLO, получаем Hello.
         *
         */
        System.out.println("==== Задача 2 ====");
        String word = "Lorem ipsum dolor sit amet... ";
        String result = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
        System.out.println(result);
        System.out.println("");

        /**
         * Задача 3
         *
         *
         * Найдите самое длинное слово в предложении, при условии, что в предложении все слова разной длины.
         * Предложение для посика длинного слова: "в предложении все слова разной длины".
         *
         */
        System.out.println("==== Задача 3 ====");

        String sentence = "в предложении все слова разной длины";
        String longestWord = "";
        String[] wordsArr = sentence.split(" ");

        for (String sentenceWords : wordsArr) {
            if (sentenceWords.length() > longestWord.length())
                longestWord = sentenceWords;
        }
        System.out.println("самое длинное слово в предложении " + longestWord);
        System.out.println("");

        /**
         * Задача 4
         *
         *
         * Определить, является ли срока полиндромом.
         *
         * Палиндром — это число, буквосочетание, слово или текст, которые одинаково читаются по буквам или по словам как слева направо,
         * так и справа налево. Например, 202 - палиндром / fafaf - палиндром / а роза упала на лапу Азора - палиндром
         *
         */
        System.out.println("==== Задача 4 ====");
        String string1 = "А роза упала на лапу Азора";
        string1 = string1.replaceAll(" ", "");
        StringBuilder reverseString = new StringBuilder(string1).reverse();
        System.out.println("reverseString " + reverseString);
        if (string1.equalsIgnoreCase(reverseString.toString())) {
            System.out.println(string1 + " - полиндром");
        } else {
            System.out.println(string1 + " - не полиндром");
        }
        System.out.println("");

        /**
         *
         * Задача 5
         *
         * Разобрать методы класса String:
         * 1) charAt
         * 2) compareTo / compareToIgnoreCase
         * 3) indexOf
         * 4) isBlank / isEmpty
         * 5) repeat
         * 6) substring
         * 7) toLowerCase / toUpperCase
         * 8) trim
         *
         */
        System.out.println("==== Задача 5.1 ====");
        /*
        Метод charAt() — возвращает символ, расположенный по указанному индексу строки. Индексы строк в Java начинаются с нуля.
         */

        String s = "Я буду хорошим программистом!";
        char result1 = s.charAt(8);
        char result2 = s.charAt(11);
        System.out.println("Восьмой символ строки - " + result1);
        System.out.println("Одиннадцатый символ строки - " + result2);


        System.out.println("");
        System.out.println("==== Задача 5.2 ====");
        /*
        Метод compareTo() в Java структурирован двумя вариантами. Первый: метод сравнивает строку с другим объектом, а второй: метод лексически сравнивает две строки.
        Как работает compareTo() с числовым объектом мы рассмотрели в прошлом уроке. Рассмотрим второй вариант: сравнение двух строк.
         */

        String str1 = "Я буду хорошим программистом!";
        String str2 = "Я буду хорошим программистом!";
        String str3 = "Я буду хорошим программистом?";

        int resultCompare = str1.compareTo(str2);
        System.out.println(resultCompare);

        resultCompare = str2.compareTo(str3);
        System.out.println(resultCompare);

        resultCompare = str3.compareTo(str2);
        System.out.println(resultCompare);

        System.out.println("");

        /*
        Метод compareToIgnoreCase() — в Java сравнивает лексически две строки, игнорируя регистр букв.
        */

        String str4 = "Я буду хорошим программистом!";
        String str5 = "Я Буду Хорошим Программистом!";
        String str6 = "Я буду хорошим Програм";

        int resultCompare2 = str4.compareToIgnoreCase(str5);
        System.out.println(resultCompare2);

        resultCompare2 = str5.compareToIgnoreCase(str6);
        System.out.println(resultCompare2);

        resultCompare2 = str6.compareToIgnoreCase(str4);
        System.out.println(resultCompare2);

        System.out.println("");
        System.out.println("==== Задача 5.3 ====");
        /*
        public int indexOf(int ch) — возвращает индекс в данной строке первого вхождения указанного символа или -1, если символ не встречается.
        public int indexOf(int ch, int fromIndex) — возвращает индекс в данной строке первого вхождения указанного символа, начиная поиск по указанному индексу, или значение -1, если символ не встречается.
        int indexOf(String str) — возвращает индекс в данной строке первого вхождения указанной подстроки. Если эта подстрока не встречается, возвращается -1.
        int indexOf(String str, int fromIndex) — возвращает индекс в данной строке первого вхождения указанной подстроки, начиная с указанного индекса. Если не встречается, возвращается -1.
         */
        String Str = new String("Добро пожаловать на ProgLang.su");
        String SubStr1 = new String("Prog");
        String SubStr2 = new String("Srog");

        System.out.print("Найденный индекс: ");
        System.out.println(Str.indexOf('о'));
        System.out.print("Найденный индекс: ");
        System.out.println(Str.indexOf('о', 5));
        System.out.print("Найденный индекс: ");
        System.out.println( Str.indexOf(SubStr1));
        System.out.print("Найденный индекс: ");
        System.out.println( Str.indexOf(SubStr1, 21));
        System.out.print("Найденный индекс: ");
        System.out.println(Str.indexOf(SubStr2));

        System.out.println("");
        System.out.println("==== Задача 5.4 ====");

        /*
        isBlank(String str) checks if a String is whitespace, empty ("") or null.
         */

        System.out.println("".isBlank());
        System.out.println(" ".isBlank());
        System.out.println("bob".isBlank());
        System.out.println("  bob  ".isBlank());
        System.out.println();
        System.out.println("".isEmpty ());
        System.out.println(" ".isEmpty ());
        System.out.println("bob".isEmpty ());
        System.out.println("  bob  ".isEmpty ());

        System.out.println("");
        System.out.println("==== Задача 5.5 ====");

        /*
        Repeat повторяет строку N раз
         */
        var s55 = "Qwe".repeat(3); // "QweQweQwe"
        System.out.println(s55);

        System.out.println("");
        System.out.println("==== Задача 5.6 ====");

        /*
        Метод substring() в Java имеет два варианта и возвращает новую строку, которая является подстрокой данной строки.
        Подстрока начинается с символа, заданного индексом, и продолжается до конца данной строки или до endIndex-1, если введен второй аргумент.
         */

        String Str56 = new String("Добро пожаловать на ProgLang.su");

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str56.substring(5));

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str56.substring(5, 15));

        System.out.println("");
        System.out.println("==== Задача 5.7 ====");

        String txt = "Hello World";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());

        System.out.println("");
        System.out.println("==== Задача 5.8 ====");

        /*
        Метод trim() — возвращает копию строки с пропущенными начальными и конечными пробелами,
        другими словами метод позволяет в Java удалить пробелы в начале и конце строки.
         */

        String Str58 = new String("   Добро пожаловать на ProgLang.su   ");

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str58.trim());

        System.out.println("");
    }
}
