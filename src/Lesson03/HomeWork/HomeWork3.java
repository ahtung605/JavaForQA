package Lesson03.HomeWork;

import java.util.Random;

/**
 * @author Konstantin Babenko
 * @version 1
 * @create 28.10.2021
 */

public class HomeWork3 {

    public static Random random = new Random();

    public static void main(String[] args) {

        /**
         *1. Задать целочисленный массив, состоящий из элементов 0 и 1.
         * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
         * С помощью цикла и условия заменить 0 на 1, 1 на 0;
         */
        System.out.println("-----------");
        System.out.println("Задание 1.");
        byte[] array01 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        printArray(array01);
        printArray(replaceArray01(array01, false));
        System.out.println("-----------");

        /**
         * 2. Задать пустой целочисленный массив длиной 100.
         * С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
         */
        System.out.println("Задание 2 (В ТЗ не ясно - упорядоченными числами заполнять или нет).");
        System.out.println("Заполнено УПОРЯДОЧЕННО уникальными числами от 1 до 100. ");
        printArray(createArray(100, true, false));
        System.out.println("Заполнено НЕ упорядоченно (перемешано) уникальными числами от 1 до 100.");
        printArray(createArray(100, true, true));
        System.out.println("-----------");

        /**
         * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
         * и числа меньшие 6 умножить на 2;
         */
        System.out.println("Задание 3.");
        int[] arrInt = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printArray(arrInt);
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] < 6) {
                //arrInt[i] = arrInt[i] * 2;
                arrInt[i] *= 2;
            }
        }
        printArray(arrInt);
        System.out.println("-----------");

        /**
         * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
         * и с помощью цикла(-ов) заполнить его диагональные элементы единицами
         * (можно только одну из диагоналей, если обе сложно).
         * Определить элементы одной из диагоналей можно по следующему принципу:
         * индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
         */
        System.out.println("Задание 4.");
        printArray2Diagonal1(createArray2D(5, 5));
        System.out.println();
        printArray2Diagonal2(createArray2D(6, 6));
        System.out.println();
        printArray2DiagonalX(createArray2D(7, 7));
        System.out.println("-----------");

        /**
         * 5. Написать метод, принимающий на вход два аргумента: len и initialValue,
         * и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
         */
        System.out.println("Задание 5.");
        System.out.println("отдельным методом");
        printArray(createArrayValue(7, 3));
        System.out.println("перегруженным методом");
        printArray(createArray(7, 3));
        System.out.println("-----------");

        /**
         * 6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы;
         */
        System.out.println("Задание 6.");
        int[] arrayNew; //= new int[10];  обяъявляем переменную массива и на следующем шаге создаем и инициализируем его
        arrayNew = createArray(20, -10,10);
        System.out.print("Массив: ");
        printArray(arrayNew);
        System.out.println("Минимальный элемент = " + minArray(arrayNew));
        System.out.println("Минимальный элемент = " + maxArray(arrayNew));
        System.out.println("-----------");

        /**
         * 7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
         * метод должен вернуть true, если в массиве есть место,
         * в котором сумма левой и правой части массива равны.
         * **Примеры:
         * checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
         * checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
         * checkBalance([1, 2, 4]) → false
         * граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.
         */
        System.out.println("Задание 7.");
        // генерируем произвольный массив
        int[] arrayTest; //= new int[10];  обяъявляем переменную массива и на следующем шаге создаем и инициализируем его
        arrayTest = createArray(5, 1, 2);
        System.out.println("Массив \"arrayTest\": ");
        printArray(arrayTest);
        printBalance(arrayTest);
        System.out.println();
        // предустановленный набор массивов для проверки
//        int[] test = {2, 2, 2, 1, 2, 2, 10, 1}; // 8 элементов - true
//        int[] test = {1, 1, 1, 2, 1}; // 5 элементов - true
//        int[] test = {1, 2, 4}; // 3 элементов - false
        int[] test = {1, -2, 3}; // 3 элементов - true
        System.out.println("Массив \"test\": ");
        printArray(test);
        printBalance(test);
        System.out.println("-----------");

    }

    /**
     * печать байтового массива
     *
     * @param inputArray byte Array
     */
    public static void printArray(byte[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }

    /**
     * Печать целочисленного массива.
     *
     * @param inputArray int Array
     */
    public static void printArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }

    /**
     * Замена в массиве 0 на 1, 1 на 0.
     *
     * @param inputArray byte Array
     * @param isSave     сохранять исходный массив - true or false
     * @return byte array
     */
    public static byte[] replaceArray01(byte[] inputArray, boolean isSave) {
        if (isSave) {
            byte[] tmpArr = new byte[inputArray.length];    // временный массив для сохранения исходного
            for (int i = 0; i < inputArray.length; i++) {
                if (inputArray[i] == 0) {
                    tmpArr[i] = 1;
                } else {
                    tmpArr[i] = 0;
                }
            }
            return tmpArr;
        } else {                                            // сохранять исходный массив не надо
            for (int i = 0; i < inputArray.length; i++) {
                if (inputArray[i] == 0) {
                    inputArray[i] = 1;
                } else {
                    inputArray[i] = 0;
                }
            }
            return inputArray;
        }
    }

    /**
     * Создание целочисленного одномерного массива (упорядоченного или нет)
     * из чисел от 1 до длины массива
     *
     * @param length длина (размер) массива
     * @param isFill надо ли наполнять - true or false
     * @param isMix  наполнять случайно или упорядоченно - true or false
     * @return int array
     */
    public static int[] createArray(int length, boolean isFill, boolean isMix) {
        int[] tmp = new int[length];
        if (isFill) {
            for (int i = 0; i < tmp.length; i++) {
                tmp[i] = i + 1;           // 0 исключаем - он не нужен по ТЗ
            }
            if (isMix) {
                mixArray(tmp);
            }
        }
        return tmp;
    }

    /**
     * - перегруженный метод -
     * Создание целочисленного одномерного массива
     * из случайных чисел от min до max
     *
     * @param length длина массива
     * @param min    нижняя граница диапазона чисел
     * @param max    верхняя граница диапазона чисел
     * @return int array
     */
    public static int[] createArray(int length, int min, int max) {
        int[] tmp = new int[length];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = randomValueWithBordersInt(min, max);
        }
        return tmp;
    }

    /**
     * - перегруженный метод -
     * Создание целочисленного одномерного массива длиной len, заполненного значением initialValue
     *
     * @param len          длина массива
     * @param initialValue значение инициации
     * @return int array
     */
    public static int[] createArray(int len, int initialValue) {
        int[] tmp = new int[len];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = initialValue;
        }
        return tmp;
    }

    /**
     * Создание целочисленного одномерного массива длиной len, заполненного значением initialValue
     *
     * @param len          длинна массива
     * @param initialValue значение инициации
     * @return int array
     */
    // В принципе этот метод лишний - перегруженный метод тоже работает
    public static int[] createArrayValue(int len, int initialValue) {
        int[] tmp = new int[len];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = initialValue;
        }
        return tmp;
    }

    /**
     * Создание целочисленного двумерного массива
     *
     * @param row количество строк
     * @param col количество столбцов
     * @return int 2D array
     */
    public static int[][] createArray2D(int row, int col) {
        int[][] tmp = new int[row][col];
        return tmp;
    }

    /**
     * Печать двумерного массива
     *
     * @param inputArray2D int 2D array
     */
    public static void printArray2D(int[][] inputArray2D) {
        for (int i = 0; i < inputArray2D.length; i++) {
            for (int j = 0; j < inputArray2D[i].length; j++) {
                System.out.print(inputArray2D[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Создание одной диагонали слева-вниз-направо
     *
     * @param inputArray2D int array
     */
    public static void printArray2Diagonal1(int[][] inputArray2D) {
        for (int i = 0; i < inputArray2D.length; i++) {
            for (int j = 0; j < inputArray2D[i].length; j++) {
                if (i == j) {
                    inputArray2D[i][j] = 1;
                }
                System.out.print(inputArray2D[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * Создание одной диагонали снизу-вверх-направо
     *
     * @param inputArray2D int array
     */
    public static void printArray2Diagonal2(int[][] inputArray2D) {
        for (int i = 0; i < inputArray2D.length; i++) {
            for (int j = 0; j < inputArray2D[i].length; j++) {
                if ((i + j) == inputArray2D[i].length - 1) {
                    inputArray2D[i][j] = 1;
                }
                System.out.print(inputArray2D[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * Создание двух диагоналей крест накрест
     *
     * @param inputArray2D int Array
     */
    public static void printArray2DiagonalX(int[][] inputArray2D) {
        for (int i = 0; i < inputArray2D.length; i++) {
            for (int j = 0; j < inputArray2D[i].length; j++) {
                if ((i == j) || ((i + j) == inputArray2D[i].length - 1)) {
                    inputArray2D[i][j] = 1;
                }
                System.out.print(inputArray2D[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * Перемешивание значений массива
     *
     * @param inputArray int Array
     * @return int Array
     */
    public static int[] mixArray(int[] inputArray) {
        int randomIndex, randomValue;
        for (int i = 0; i < inputArray.length; i++) {
            randomIndex = random.nextInt(inputArray.length);
            randomValue = inputArray[randomIndex];
            inputArray[randomIndex] = inputArray[i];
            inputArray[i] = randomValue;
        }
        return inputArray;
    }

    /**
     * Генерация случайного целого числа в заданном диапазоне
     *
     * @param min нижняя граница диапазона чисел
     * @param max верхняя граница диапазона чисел
     * @return random int number
     */
    public static int randomValueWithBordersInt(int min, int max) {
        return min + random.nextInt(max - min + 1);
    }

    /**
     * Нахождение минимального значенния в массиве
     *
     * @param inputArray int array
     * @return minValue
     */
    public static int minArray(int[] inputArray) {
        int minValue;
        minValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (minValue > inputArray[i]) {
                minValue = inputArray[i];
            }
        }
        return minValue;
    }

    /**
     * Нахождение максимального значенния в массиве
     *
     * @param inputArray int array
     * @return maxValue
     */
    public static int maxArray(int[] inputArray) {
        int maxValue;
        maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (maxValue < inputArray[i]) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    /**
     * Суммировоние элементов целочисленного массива
     *
     * @param inputArray int array
     * @return Summ
     */
    public static int sumArr(int[] inputArray) {
        int sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            sum += inputArray[i];
        }
        return sum;
    }

    /**
     * Проверка баланса массива
     *
     * @param inputArray int array
     * @return true or false
     */
    public static boolean checkBalance(int[] inputArray) {
        boolean check = false;
        int leftSum = 0;
        // разницей на каждом шаге проверяем набираемую сумму с общей до равновесия
        for (int i = 0; i < inputArray.length; i++) {
            leftSum += inputArray[i];
            if (leftSum == sumArr(inputArray) - leftSum) {
                check = true;
            }
        }
        return check;
    }

    /**
     * Распечатка результатов проверки массива на баланс
     *
     * @param inputArray int array
     */
    public static void printBalance(int[] inputArray) {
        if (checkBalance(inputArray)) {
            System.out.println("Массив сбалансирован (" + checkBalance(inputArray) + "):");
            int leftSum = 0;
            for (int i = 0; i < inputArray.length; i++) {
                System.out.print(inputArray[i] + " ");
                leftSum += inputArray[i];
                if (leftSum == sumArr(inputArray) - leftSum) {
                    System.out.print(" |||  ");
                }
            }
            System.out.println();
            System.out.printf("Общая сумма значений массива = %d, в т.ч.: левая и правая части = %d каждая.", sumArr(inputArray), leftSum / 2);
            System.out.println();
        } else {
            System.out.println("Массив не сбалансирован (" + checkBalance(inputArray) + "):");
        }
    }

}
