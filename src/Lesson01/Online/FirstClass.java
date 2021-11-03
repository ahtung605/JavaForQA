package Lection01.online;

//one-line comment

/*
multi-
line
comment
 */

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 20.10.2021
 */

public class FirstClass {

    public static void main(String[] args) {
//        System.out.println("Hello Java");

//        //целые
//        byte myByte = 15; // -128..+127 -> 1byte
//        short myShort = 300;// -32768..+32767 -> 2byte
//        int myInteger = 150000; // -2.1mlrd..+2.1mlrd -> 4byte DEFAULT
//        long myLong = 30000000000L; //-2^63 .. +2^63 -> 8byte
//
//        //числа с точкой
//        float myFloat = 645.12f; // 4byte - <>.0000000
//        double myDouble = 645.12; // 8byte - <>.00000000000000 DEFAULT
//
//        //символ
//        char myChar = 'Q'; // 2byte
//        String myString = "Hello Java"; // - !не примитив, ссылочный тип данных
//
//        //логический тип
//        boolean myBooleanTrue = true; //1 byte
//        boolean myBooleanFalse = false;
//
//        //Math.operation
//        //+,-,*,/,^
//
//        int firstValue = 3;
//        int secondValue = 4;
//        int thirdValue = 5;
//        int result = firstValue + secondValue * firstValue / thirdValue;
//        System.out.println(result);
//
//        int f1 = 15;
//        int f2 = 3;
//        System.out.println(f1 % f2);
//
//        //конкатенация
//        String string1 = "Hello";
//        String string2 = "World";
//        System.out.println(string1 + string2 + " word " + result);
//
//        char a1 = 'Q';
//        System.out.println((int) a1);
//        System.out.println(a1 + '1');

//        int a = 20;
//        if (a > 30) {
//            System.out.println("a > 30");
//        } else {
//            System.out.println("a < 30");
//        }
//
//        if (a > 30) {
//            System.out.println("a > 30");
//        }
//
//        int b = 350;
//        if (b > 200) {
//            System.out.println("b > 200");
//        } else if (b > 340) {
//            System.out.println("b > 340");
//        } else if (b > 345) {
//            System.out.println("b > 345");
//        } else {
//            System.out.println("b < 200");
//        }
//        //<,>,>=,<=,==
//        int cash = 1000;
//        String buyer = "Alex";
//        goToShop(1000);
//        goToShop(cash);
//        goToShop(cash, buyer);

//        int globalCashBack = goToShop(1000);
//        System.out.println(globalCashBack);

//        String tmp = welcome("Alex");
//        System.out.println(tmp);
        System.out.println("Result: " + welcome("Petr"));

    }

    public static String welcome(String name) {
        return "Welcome " + name;
    }

    public static int goToShop(int value) {
        int cost = 460;
        System.out.println("Go out home");
        System.out.println("Go to shop");
        System.out.println("Buy something");
        System.out.println("Take cashback " + (value - cost));
        return value - cost;
    }

//    public static void goToShop() {
//        System.out.println("Go out home");
//        System.out.println("Go to shop");
//        System.out.println("Buy something");
//        System.out.println("Take cashback");
//        System.out.println("Return to Home");
//        System.out.println("********");
//    }

//    public static void goToShop(int value) {
//        int cost = 460;
//        System.out.println("Go out home");
//        System.out.println("Go to shop");
//        System.out.println("Buy something");
//        System.out.println("Take cashback " + (value - cost));
//    }

//    public static void goToShop(int value, String name) {
//        int cost = 460;
//        System.out.println(name + " Go out home");
//        System.out.println("Go to shop");
//        System.out.println("Buy something");
//        System.out.println("Take cashback " + (value - cost));
//    }


    /**
     * @author Konstantin Babenko
     * @version Homework 2
     * Date: 23.10.2021
     */

    public static class HomeWork2 {
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
}
