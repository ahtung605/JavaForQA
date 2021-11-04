package Lesson05.Online;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 03.11.2021
 */

public class Player {

    public static int myField = 15;

    private int str;
    private int hp;
//    String name = "Qwerty";
    private String name;
    private int age;
    private String color;
    private float speed;
    private boolean isAlive;
    private Sword mySword = new Sword();
    private Point coordinates = new Point();
//    Sword mySword;
//    Point coordinates;

    public Player() {
        System.out.println("Hello");
        mySword = new Sword();
        coordinates = new Point();
    }
//
//    public Player(String value) {
//        System.out.println(value);
//    }

    public Player(String name, int age, String color, float speed) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.speed = speed;
        run();
    }

    private void run(){
        System.out.println(name + " run with speed " + speed);
    }

    private class Sword {
        int length;
        int weight;
        String name;

        void attack() {
            String name = "Hello";
            this.name = "Hello2";
            System.out.println(name + " has attack");
        }
    }

    //Getter
    public String getName() {
        return name;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }
}
