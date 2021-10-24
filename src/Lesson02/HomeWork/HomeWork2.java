package Lesson02.HomeWork;

/**
 * @author Konstantin Babenko
 * @version Homework 2
 * Date: 23.10.2021
 */

public class HomeWork2 {
    public static void main(String[] args) {

        System.out.println("Вопрос 1.");
        System.out.println("Лежит ли сумма заданных чисел в пределах от 10 до 20 (включительно)? Ответ - " + checkSumm(-10, 23));
        System.out.println("\n" + "Вопрос 2.");
        printSignNumber(10);
        System.out.println("\n" + "Вопрос 3.");
        System.out.println("Число отрицательное? Ответ - " + checkSignNumber(-5));
        System.out.println("\n" + "Вопрос 4.");
        printLine("Нет предела совершенству!", -1);
        System.out.println("\n" + "Вопрос 5.");
        System.out.println("Заданный год - високосный? Ответ - " + leapYear(4));
    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
     * от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    public static boolean checkSumm(int number1, int number2) {
//        boolean check;

        int summNumber = number1 + number2;

        /* я изначально написал такой код
        if (summNumber >= 10 && summNumber <= 20 ){
            check = true;
        } else {
            check = false;
        }
        return check;
        */
        //Но IDEA предложил упростить код - смысл понятен: переменной одним действием присвоить значение на этапе проверки
        // красиво. Но может надо было взять в скобки()???.
        // Вот так (summNumber >= 10 && summNumber <= 20)
//        check = summNumber >= 10 && summNumber <= 20;
//        return check;
        return summNumber >= 10 && summNumber <= 20;
    }

    /**
     * 2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
     * положительное ли число передали или отрицательное.
     * Замечание: ноль считаем положительным числом.
     */
    public static void printSignNumber(int number) {
        if (number < 0) {
            System.out.println("Заданное число - отрицательное.");
        } else {
            System.out.println("Заданное число - положительное.");
        }
    }

    /**
     * 3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если
     * число отрицательное, и вернуть false если положительное.
     */
    public static boolean checkSignNumber(int number) {
//        boolean checkSign;
//        checkSign = number < 0; // либо true либо false
//        return checkSign;
        return number < 0;
    }

    /**
     * 4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать
     * в консоль указанную строку, указанное количество раз;
     */
    public static void printLine(String line, int number) {
        /*
        Выполняем проверку на 0 и отрицательное значение - ведь надо печатать!
         */
        if (number < 0) {
            number = -number;
            System.out.println("Вы указали отрицательное число, оно будет преобразовано в положительное.");
        } else if (number == 0) {
            System.out.println("Вы указали - 0. Строка распечатана не будет.");
        }
        //вывод на печать
        for (int i = 0; i < number; i++) {
            System.out.println(line);
        }
    }

    /**
     * 5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
     * не високосный - false).
     * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */
    public static boolean leapYear(int year) {
//        boolean isLeap;

//        if ((year % 4) != 0) {
////            System.out.println("Остаток от деления на 4 - НЕ 0 - значит не високосный!");
//            isLeap = false;
//        } else //                System.out.println("Остаток от деления на 100 - 0 - значит не високосный!");
//            //            System.out.println("Остаток от деления на 4 - 0 - значит високосный!");
//            if ((year % 400) == 0) {
////                System.out.println("Остаток от деления на 400 - 0 - значит високосный!");
//            isLeap = true;
//        } else isLeap = (year % 100) != 0;
//        // другой вариант
//        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//            isLeap = true;
//        } else {
//            isLeap = false;
//        }
//        return isLeap;
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
