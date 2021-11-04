package Lesson05.Online;

import Lesson04.Online.ConsoleApp;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 03.11.2021
 */

public class Manager {

    public static void main(String[] args) {

//        Player player1 = new Player();
//        Player player2 = new Player("Privet");
//        Player player3 = new Player("Graf", 38, "Yellow", 19.5f);

//        System.out.println("Player3 name is " + player3.getName());

//        player3.setName("Qwerty");
//        System.out.println("Player3 name is " + player3.getName());
//
//        player1.mySword.length = 50;
//        player1.mySword.name = "Sword1";
//
//        player2.mySword.length = 70;
//        player2.mySword.name = "Sword2";
//
//        player1.mySword.attack();
//
//        player1.coordinates.x = 15;
//        player1.coordinates.y = 25;

//        player1.name = "Graf";
//        player1.age = 38;
//        player1.isAlive = true;
//        player1.color = "Yellow";
//        player1.speed = 10.5f;
//
//        System.out.println("Player1 name is " + player1.name);
//        player1.run();
////
//        player2.name = "Alex";
//        player2.speed = 25.4f;
//        player2.run();


//        player1.age = player1.age + 2;
//        System.out.println("My age is " + player1.age);
//        System.out.println("Player2 name is " + player2.name);

        System.out.println(Player.myField);
        System.out.println(ConsoleApp.isALivePlayer());
        int a = ConsoleApp.myRandomValueInt(15, 35);
        System.out.println(a);

    }
}
