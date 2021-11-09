package Lesson06.HomeWork.animals;

/**
 * @author Konstantin Babenko
 * @version 1
 * @create 08.11.2021
 */

public class Dog extends Animal {

    private int distRun = 500; // дистанция бега
    private int distSwim = 10; // дистанция плавания
    public static int countAnimals = 0; // счетчик объектов

    // конструктор
    public Dog(String name) {
        super(name); // вызов родительского конструктора
        super.isSwim = true; // умеет плавать
        countAnimals++; // счетчик создаваемых объектов увеличиваем на 1 каждый раз
    }

    // переопределение родительского метода
    @Override
    public void info() {
        super.info(); // вызов родительского метода
        System.out.println(name + " может пробежать " + distRun +
                " м. и проплыть " + distSwim + " м.");
    }

    // переопределение родительского метода бега (ввод ограничений)
    @Override
    public void run(int distance) {
        System.out.println((distance <= distRun) ? name + " пробежал " + distance + " м." : "Внимание! " + name +
                " может пробежать не больше " + distRun + " м. \nЧтобы пробежать " + distance +
                " м., дополнительно понадобятся вкусные косточки!!!");
    }

    // переопределение родительского метода плавания (ввод ограничений)
    @Override
    public void swim(int distance) {
        System.out.println((distance <= distSwim) ? name + " проплыл " + distance + " м." : "Важно! " + name +
                " может проплыть не больше " + distSwim + " м. \nЧтобы проплыть " + distance +
                " м., понадобится отдых!!!");
    }

}
