package Lesson05.HomeWork;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Konstantin Babenko
 * @version 1
 * @create 04.11.2021
 */

public class HomeWork5 {

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static int sizeArr; // размер массива сотрудников
    public static int limitAge; // возраст сотрудников
    public static int count = 0; // вспомогательный счетчик

    public static void main(String[] args) {

        // 4. создаем массив типа Employee
        System.out.print("Введите размер массива сотрудников > ");
        sizeArr = scanner.nextInt();

        Employee[] emplArray = new Employee[sizeArr];

        // 4. наполняем массив значениями (прямым методом) на 5 сотрудников
        // ШАБЛОН: ФИО, должность, email, телефон, зарплата, возраст.

//        emplArray[0] = new Employee("Ivan Ivanov", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 20);
//        emplArray[1] = new Employee("Илья Муромец", "менеджер", "ivivan@mailbox.com", "+77778080546", 40000, 30);
//        emplArray[2] = new Employee("Попов", "телефонист", "ivivan@mailbox.com", "892312312", 50000, 40);
//        emplArray[3] = new Employee("Абрахам", "диретор", "1@mailbox.com", "+11005583", 1000000, 50);
//        emplArray[4] = new Employee("Михалыч", "вахтер", "ivivan@mailbox.com", "88009998877", 3000, 60);
//        emplArray[0].info();

        // вариант заполнения данных от "балды" под любой размер
        for (int i = 0; i < emplArray.length; i++) {
//            emplArray[i] = new Employee("Ivan Ivanov", "Engineer", "ivivan@mailbox.com", "892312312", 30000*i, 30+i*5);
            emplArray[i] = new Employee(randomWord(10) + " " + randomWord(5), randomWord(7), "ivivan-" + i * 2 + "@mailbox.com", String.valueOf(randomValueWithBordersInt(110000000, 999999999)), randomValueWithBordersInt(10000, 50000), randomValueWithBordersInt(30, 60));
        }

        // 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

        // для вариативности запрашиваем ограничивающий возраст
        System.out.print("Введите возраст сотрудников (от 30 до 60) > ");
        limitAge = scanner.nextInt();

        // печатаю список в соответствии с заданным возрастом
        for (int i = 0; i < emplArray.length; i++) {
            if (emplArray[i].getAge() > limitAge) {
                count += 1;
                if (count == 1) { // печатаем заголовок списка (выборка есть!)
                    System.out.println("Список сотрудников старше " + limitAge + " лет.");
                } else {
                    if (count > 1) { // чтобы заголовок списка напечатать только один раз
                        System.out.print("");
                    }
                }
                System.out.print(count + ". ");
                emplArray[i].info();
            } else {
                System.out.print("");
            }
        }
        if (count == 0) { // выборка пуста!
            System.out.println("Сотрудников старше " + limitAge + " лет нет!");
        }

        // просто вывод списка сотрудников для контроля
        System.out.println();
        System.out.println("----- Список ВСЕХ сотрудников -----");
        for (int i = 0; i < emplArray.length; i++) {
            System.out.print(i + 1 + ". ");
            emplArray[i].info();
        }
        System.out.println("----- Конец списка сотрудников -----");

    }

    //------------------ вспомогательные методы --------------------------------------

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
     * Генерация слова из печатных символов ASCII (от 33 до 126)
     *
     * @param lengthWord длина слова
     * @return слово
     */
    public static String randomWord(int lengthWord) {
        String tmp = ""; //f654646465$%$#dkljlhldfskhgjs
        for (int i = 0; i < lengthWord; i++) {
            int valueForChar = randomValueWithBordersInt(65, 90);
            char tmpChar = (char) valueForChar;
            tmp += tmpChar;
        }
        return tmp;
    }

}
