/**
 * @author Konstantin Babenko
 * @version 1
 * @create 30.10.2021
 */

import java.util.Random;
import java.util.Scanner;

public class UsefulMetods {

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {

//        int[] arraySample; //  обяъявляем переменную массива и на следующем шаге создаем и инициализируем его
//        arraySample = createArray(20, -10,10);
//        System.out.print("Массив: ");
//        printArray(arraySample);

//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        System.out.println("Результат а + b = " + (valueFromUser("Введите a") + valueFromUser("Введите b")));

        System.out.println("Новый пароль: [" + randomPassword(valueFromUser("Укажите длину пароля (Enter length your password)")) + "]");

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
     * Вспомогательный метод. Печать одномерного массива в консоль
     * с выводом сообщения перед печатью
     * @param inputArray
     */
    public static void printArray1(String msg, int[] inputArray) {
        System.out.print(msg + ": ");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
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
     * Создание двух диагоналей крест накрест (упощенный метод)
     *
     * @param arr
     */
    public static void crossFill(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - 1 - i] = 1;
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
        int minValue = inputArray[0];
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
        int maxValue = inputArray[0];
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
     * Проверка баланса массива (альтернативный метод)
     *
     * @param array
     * @return
     */
    private static boolean checkBalanceAlt(int[] array) {
        int right = 0, left = 0;
        for (int i = 0; i < array.length - 1; i++) {
            left += array[i];
            for (int j = i + 1; j < array.length; j++)
                right += array[j];
            if (left == right) return true;
            right = 0;
        }
        return false;
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

    /**
     * Приглашение пользователю на ввод данных
     *
     * @param greetingMessage сообщение для пользователя
     * @return возврат пользовательского ввода
     */
    public static int valueFromUser(String greetingMessage) {
        System.out.print(greetingMessage + " > ");
        return scanner.nextInt();
    }

    /**
     * Генерация пароля из печатных символов ASCII (от 33 до 126)
     *
     * @param lengthPass длина пароля
     * @return пароль
     */
    public static String randomPassword(int lengthPass) {
        String tmp = ""; //f654646465$%$#dkljlhldfskhgjs
        for (int i = 0; i < lengthPass; i++) {
            int valueForChar = randomValueWithBordersInt(33, 126);
            char tmpChar = (char) valueForChar;
            tmp += tmpChar;
        }
        return tmp;
    }

    /**
     * Метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
     * не високосный - false).
     * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     *
     * @param year год
     * @return true or false
     */
    public static boolean leapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    /**
     * Метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если
     * число отрицательное, и вернуть false если положительное.
     *
     * @param number проверяемое число
     * @return true or false
     */
    public static boolean checkSignNumber(int number) {
        return number < 0;
    }


}
