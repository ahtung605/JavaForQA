package Lesson06.HomeWork.animals;

/**
 * @author Konstantin Babenko
 * @version 1
 * @create 08.11.2021
 */

public class Animal {

    protected String name;
    protected int distance; // длина упражнения (препятствия) - бег-плавание
    protected boolean isSwim; // может ли животное плавать
    public static int countAnimals = 0;

    // конструктор
    public Animal(String name) {
        this.name = name;
        isSwim = true;
        countAnimals++;
        System.out.println("Создан объект класса " + getClass().getSimpleName() + " с именем " + name + ".");
    }

    // информация о животном
    public void info() {
        System.out.println(name + " может бегать" + ((isSwim) ? " и умеет плавать." : ", но плавать не умеет!"));
    }

    // бег
    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м.");
    }

    // плавание
    public void swim(int distance) {
        if (isSwim) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не умеет плавать.");
        }
    }

}
