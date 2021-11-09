package Lesson06.HomeWork;

import Lesson06.HomeWork.animals.Animal;
import Lesson06.HomeWork.animals.Cat;
import Lesson06.HomeWork.animals.Dog;

/**
 * @author Konstantin Babenko
 * @version 1
 * @create 08.11.2021
 */

public class HomeWorkAnimals {

    public static void main(String[] args) {

        System.out.println("Мир животных в разрезе ДЗ-6");
        System.out.println();

        System.out.println("======== Класс Animals ===========");
        Animal animal = new Animal("Зверь");
        animal.info();
        animal.run(250);
        animal.swim(200);
        System.out.println();

        System.out.println("======== Класс Dog ===========");
        Dog dog = new Dog("Мухтар");
        dog.info();
        System.out.println("-------------------");
        dog.run(555);
        dog.swim(100);
        System.out.println();

        System.out.println("======== Класс Cat ===========");
        Cat cat = new Cat("Васька");
        cat.info();
        System.out.println("-------------------");
        cat.run(222);
        cat.swim(100);
        System.out.println();

        // объекты создаются для демонстрации подсчета
        System.out.println("===================");
        Dog dog2 = new Dog("Собакен");
        Dog dog3 = new Dog("Tuzik");
        Cat cat1 = new Cat("Мурлыка");
        System.out.println();

        // считаем созданных животин
        System.out.println("+++++++++ Подсчет созданных животин ++++++++++");
        System.out.println("Всего животных - " + Animal.countAnimals + ",");
        System.out.println("в том числе:");
        System.out.println("\t - неизвестных животных - " + (Animal.countAnimals - Dog.countAnimals - Cat.countAnimals) + ";");
        System.out.println("\t - собак - " + Dog.countAnimals + ";");
        System.out.println("\t - кошачьих - " + Cat.countAnimals + ".");
        System.out.println("+++++++++++++++++++");
    }

}
