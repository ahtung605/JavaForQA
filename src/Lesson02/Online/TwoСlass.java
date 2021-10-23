package Lection02.online;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 23.10.2021
 */

public class TwoСlass {
//    public static int valueFromClass = 15;

    public static void main(String[] args) {
//        int valueFromMethod = 30;
//        System.out.println(valueFromMethod);
//        System.out.println(valueFromClass);
//
//        studySwitch();

//        System.out.println("Value = 10");
//        System.out.println("Value = 11");
//        System.out.println("Value = 12");
//        System.out.println("Value = 13");
//        System.out.println("Value = 14");
//        System.out.println("Value = 15");
//        System.out.println("Value = 16");
//        System.out.println("Value = 17");
//        System.out.println("Value = 18");
//        System.out.println("Value = 19");
//        System.out.println("Value = 20");

//        for (int i = 10; i <= 20; i++) {
//            System.out.println(i);
//        }

//        for (int i = 1; i < 10; i++) {
//            System.out.print(i + " > ");
//        }
//        System.out.println("Result = " + myMath(2,3));

//        for (int i = 1; i < 10; i++) {
//            for (int j = 1; j < 10; j++) {
//                for (int k = 1; k < 10; k++) {
//
//                }
//            }
//        }

//        int a = 0;
//        while (a < 10) {
//            a++;
//            if (a == 6) continue;
//            if (a == 8) break;
//            System.out.print(a + " > ");
//        }

//        int b = 10;
//        do {
//            b++;
//            System.out.print(b + " > ");
//        } while (b < 10);
//        tablePifagor(10,10);

        System.out.println("Count: " + countDog(5,10,15,100));
    }

    public static float countDog(float speedHuman1, float speedHuman2, float speedDog, float distance) {
        float count = 0;
        float time;
        int numberHuman = 1;
        int dogLength = 5;

        while (distance > dogLength) {
            if (numberHuman == 2) {
                time = distance / (speedHuman2 + speedDog);
                numberHuman = 1;
            } else {
                time = distance / (speedHuman1 + speedDog);
                numberHuman = 2;
            }
            distance = distance - (speedHuman1 + speedHuman2) * time;
            count = count + 1;
        }
        return count / 2;
    }

    public static int myMath(int base, int signature) {
        if (signature < 0) {
            signature = -signature;
        }

        int result = base;

            for (int i = 1; i < signature; i++) {
                result = result * base;
            }

        return result;
    }

    public static void tablePifagor(int width, int height) {

        for (int y = 1; y <= height; y++) {
            for (int x = 1; x <= width; x++) {
                System.out.print(y * x + "\t");
            }
            System.out.println();
        }
    }

    public static void studySwitch() {
        String nameLetter = "Qwerty";

        if (nameLetter == "Alex") {
            int valueFromIf = 40;
            System.out.println(valueFromIf);
            System.out.println("Give letter to Alex");
        } else if (nameLetter == "Boris") {
            System.out.println("Give letter to Boris");
        } else if (nameLetter == "Olga") {
            System.out.println("Give letter to Olga");
        } else {
            int valueFromIf = 50;
            System.out.println("Go out office");
           }

        System.out.println("********");

        switch (nameLetter) {
            case "Alex":
                System.out.println("Give letter to Alex");
                break;
            case "Boris":
                System.out.println("Give letter to Boris");
                break;
            case "Olga":
                System.out.println("Give letter to Olga");
                break;
            default:
                System.out.println("Go out office");
                break;
        }
    }
}
