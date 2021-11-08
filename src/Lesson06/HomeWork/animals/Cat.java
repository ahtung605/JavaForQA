package Lesson06.HomeWork.animals;

/**
 * @author Konstantin Babenko
 * @version 1
 * @create 08.11.2021
 */

public class Cat extends Animal {

    private int distRun = 200; // дистанция бега
    public static int countAnimals = 0; // счетчик объектов

    // конструктор
    public Cat(String name) {
        super(name); // вызов родительского конструктора
        super.isSwim = false; // плавать не умеет
        countAnimals++; // счетчик создаваемых объектов увеличиваем на 1 каждый раз
    }

    // переопределение родительского метода
    @Override
    public void info() {
        super.info(); // вызов родительского метода
        System.out.println(name + " может пробежать " + distRun + " м.");
    }

    // переопределение родительского метода (ввод ограничений)
    @Override
    public void run(int distance) {
        System.out.println((distance <= distRun) ? name + " пробежал " + distance + " м." : "Внимание! " + name +
                " может пробежать не больше " + distRun + " м. \nЧтобы пробежать " + distance +
                " м., дополнительно понадобится KITEKAT!!!");
    }

}
