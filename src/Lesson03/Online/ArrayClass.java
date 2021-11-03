package Lection03.online;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 27.10.2021
 */

public class ArrayClass {

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.print(random.nextInt() + " > "); // [-int;+int]
//            System.out.print(random.nextFloat() + " > "); // [0;1)
//            System.out.print(random.nextDouble() + " > "); // [0;1)
//            System.out.print(random.nextInt(100) + " > "); // [0;bound)
//            System.out.print((random.nextInt(1) * 10) + " > ");
//        }

//        for (int i = 0; i < 10; i++) {
//            System.out.print(myRandomValueInt(-30, -29) + " > ");
//        }
//        System.out.println("My Pass is [" + randomPassword(valueFromUser("Enter length your password")) + "]");

//        String tmp = scanner.next();
//        System.out.println("Hello " + tmp + "!");

//        System.out.println("Hello " + welcomeUser("Enter your name"));
//        System.out.println("Your number is " + welcomeUser("Enter your phone"));

//        int a = scanner.nextInt();
//        int b = scanner.nextInt();

//        System.out.println("Result " + (valueFromUser("Enter a") + valueFromUser("Enter b")));

//        int[] arrayInt = new int[4]; //[0.0.0.0]
//
//        arrayInt[0] = 127;
//        arrayInt[1] = -15;
//        arrayInt[2] = 35;
//        arrayInt[3] = 2;
//
//        System.out.println("ArrayInt Value " + arrayInt[0]);
//
//        String[] arrayStr = {"Qwert", "Asdfg", "Zxcv"};
//
//        System.out.println(arrayStr);

//        int[] testIntRandom = new int[30];
//        for (int i = 0; i < testIntRandom.length; i++) {
//            testIntRandom[i] = random.nextInt(50);
//        }
//
//        for (int i = 0; i < testIntRandom.length; i++) {
//            System.out.print(testIntRandom[i] + " > ");
//        }

//        createArray(5, true);
//        printArray(createArray(15, true));
//
//        System.out.println("Hello");
//
//        int[] test1 = new int[5];
//        byte[] test2 = new byte[5];
//        String[] test3 = new String[5];
//
//        printArray(test2);

//        int[][] myArray2 = new int[4][9];

        printArray2(2,10);

        int[][][][][][][][] myArray3 = new int[5][][][][][][][];

        for (int i = 0; i < myArray3.length; i++) {
            for (int j = 0; j < myArray3[i].length; j++) {
                for (int k = 0; k < myArray3[i][j].length; k++) {
                    for (int l = 0; l < myArray3[i][j][k].length; l++) {
                        //......
                    }
                }
            }
        }

    }

    public static void printArray2(int length1SizeArray, int length2SizeArray) {
        String[][] array = new String[length1SizeArray][length2SizeArray];

        for (int y = 0; y < array.length; y++) {
            for (int x = 0; x < array[y].length; x++) {
                array[y][x] = "[" + y + ";" + x + "]";
            }
            System.out.println();
        }

        for (int y = 0; y < array.length; y++) {
            for (int x = 0; x < array[y].length; x++) {
                System.out.print(array[y][x] + "\t");
            }
            System.out.println();
        }
    }

    public static int[] createArray(int length, boolean isFill) {
        int[] tmp = new int[length];
        if (isFill) {
            for (int i = 0; i < tmp.length ; i++) {
                tmp[i] = random.nextInt(10);
            }
        }
        return tmp;
    }

    public static void printArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " > ");
        }
        System.out.println();
    }

    public static void printArray(String[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " > ");
        }
    }

    public static void printArray(byte[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " > ");
        }
    }

    public static String randomPassword(int lengthPass) {

        String tmp = ""; //f654646465$%$#dkljlhldfskhgjs

        for (int i = 0; i < lengthPass; i++) {
            int valueForChar = myRandomValueInt(50, 125);
            char tmpChar = (char) valueForChar;
            tmp += tmpChar;
        }
        return tmp;
    }

    public static int myRandomValueInt(int min, int max) {
        return min + random.nextInt(max - min + 1);
    }

    //    public static String welcomeUser(String greetingMessage) {
//        System.out.print(greetingMessage + " > ");
//        return scanner.next();
//    }
//
    public static int valueFromUser(String greetingMessage) {
        System.out.print(greetingMessage + " > ");
        return scanner.nextInt();
    }
}
