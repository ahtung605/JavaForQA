package Lesson01.Online;

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
        System.out.println("Hello Java");
//--------------------------------------
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
//--------------------------------------
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


}
