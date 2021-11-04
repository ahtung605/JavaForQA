package Lesson04.HomeWork;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 30.10.2021
 *
 * Modified Konstantin Babenko
 * @version 1.1
 * @create 03.11.2021
 */

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {

    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    //---Description Player
    public static char player = 'P';
    public static String namePlayer = "King Artur";
    public static int healthPlayer = 100;
    public static int strPlayer = 30;
    public static int xPosPlayer;
    public static int yPosPlayer;

    // управление игроком
    public static final int moveUp = 8;
    public static final int moveLeft = 4;
    public static final int moveRight = 6;
    public static final int moveDown = 2;

    //---Description Location
    public static char[][] location;
    //    public static char[][] invisibleLocation; // на будущее развитие - сечас в случае победы реализован переход на вновь генерируемую локацию
    public static int locWidth;
    public static int locHeight;
    public static int locMin = 3;
    public static int locMax = 6;
    public static char emptyRoom = '_';
    public static char readyRoom = '+';
    public static boolean isRandomStartPointPlayer = false;

    public static boolean isHide = false;         // скрывать врагов и вещи

    //---Description Enemy
    public static char enemy = 'E';
    public static int healthEnemy;
    public static int strEnemy;
    public static int enemyValueMin = 20;
    public static int enemyValueMax = 40;
    public static int countEnemies;

    //---Description Items (medkit)
    public static char items = 'M';
    public static int valueItems;
    public static int itemsValueMin = 20;
    public static int itemsValueMax = 40;
    public static int countItems;

    public static void main(String[] args) {

        System.out.println();
        System.out.println("   Игра - бродика");
        System.out.println();
        System.out.println("=====> Правила <=====");
        System.out.println("1. Цель игры - обойти все комнаты и убить всех врагов.");
        System.out.println("2. Враги наносят урон игроку.");
        System.out.println("3. Если враг сильный - битва может затянуться... :-))");
        System.out.println("4. Восстановить здоровье можно при помощи аптечек.");
        System.out.println("5. В случае победы будет предложена бонусная игра!");
        System.out.println("6. Управление: ВВЕРХ - 8, ВНИЗ - 2, ВЛЕВО - 4, ВПРАВО - 6.");
        System.out.println("* Условные обозначения: Р - игрок, Е - враг, М - аптечка");
        System.out.println("** Посещенные комнаты обозначаются знаком +");
        System.out.println("*** Ходить сквозь стены нельзя!");
        System.out.println();
        System.out.println("=====> Уровни сложности игры <=====");
        System.out.println("0 - игрок начинает игру с комнаты [0:0], врагов видно.");
        System.out.println("1 - игрок начинает игру в случайно выбранной комнате, врагов не видно.");
        System.out.println("=====> Вперед! <=====");
        System.out.println();
        System.out.print("Если Вы уверены в своих силах нажимайте 1, если нет - любую цифру. >>> ");
        int ans = scanner.nextInt();
        if (ans == 1) {
            isRandomStartPointPlayer = true;
            isHide = true;
            System.out.println("=====> Удачи! <=====");
        }

        startGame();

        while (true) {
            directionPlayer();
            printLocation();

            if (!isALivePlayer()) {
                System.out.println(namePlayer + " is dead!");
                break;
            }

            if (isReadyLocation()) {
                System.out.println(namePlayer + " win!");

                // в случае пообеды предлагаем продолжить
                System.out.println();
                System.out.print("For the bonus game, press '1'. To exit, press any number.) >>> ");
                int answer = scanner.nextInt();
                if (answer != 1) {
                    break;
                }

                // для новой игры игроку повышаем текущий уровень здоровья и силу - бонус как-никак
                System.out.println();
                System.out.println(namePlayer + " get ready -  Bonus Game starts!");
                healthPlayer *= 1.5;
                strPlayer *= 1.5;
                isRandomStartPointPlayer = true;
                isHide = true; // для усложнения в юонусной игре скрываем врагов
                startGame();
            }
        }

        System.out.println("GoodBye! Game over!");

    }

    /**
     * отдельный метод сделан для повторного входа в игру (продолжения)
     */
    public static void startGame() {
        System.out.println();
        System.out.println("Please wait.  Is being created a map, player and enemies....");
        System.out.println();
        createLocation();
        createPlayer(isRandomStartPointPlayer);
        createEnemy();
        createItems();
        printLocation();
    }

    public static void createLocation() {
        locWidth = myRandomValueInt(locMin, locMax);
        locHeight = myRandomValueInt(locMin, locMax);
        location = new char[locHeight][locWidth];
        for (int y = 0; y < locHeight; y++) {
            for (int x = 0; x < locWidth; x++) {
                location[y][x] = emptyRoom;
            }
        }
        System.out.println("New location created. Size " + locWidth + "x" + locHeight);
    }

    public static void createPlayer(boolean isRandom) {
        if (isRandom) {
            xPosPlayer = myRandomValueInt(0, locWidth - 1);
            yPosPlayer = myRandomValueInt(0, locHeight - 1);
        } else {
            xPosPlayer = 0;
            yPosPlayer = 0;
        }
        location[yPosPlayer][xPosPlayer] = player;
        System.out.println(namePlayer + " has spawn in room [" + xPosPlayer + ":" + yPosPlayer + "], HP=" + healthPlayer + ", STR=" + strPlayer + ".");

    }

    public static void createEnemy() {
        countEnemies = (locWidth + locHeight) / 2;
        healthEnemy = myRandomValueInt(enemyValueMin, enemyValueMax);
        strEnemy = myRandomValueInt(enemyValueMin, enemyValueMax);

        int xPosEnemy;
        int yPosEnemy;

        for (int i = 0; i < countEnemies; i++) {

            do {
                xPosEnemy = random.nextInt(locWidth); //[0; locWidth)
                yPosEnemy = random.nextInt(locHeight); //[0; locHeight)
            } while (!isEmptyRoom(xPosEnemy, yPosEnemy));

            location[yPosEnemy][xPosEnemy] = enemy;
        }
        System.out.println("Enemies has spawn. Count is " + countEnemies + ", HP=" + healthEnemy + ", STR=" + strEnemy);
    }

    // создание вещей
    public static void createItems() {
        countItems = (locWidth + locHeight) / 3;
        valueItems = myRandomValueInt(itemsValueMin, itemsValueMax);
        int xPosItems;
        int yPosItems;

        for (int i = 0; i < countItems; i++) {
            do {
                xPosItems = random.nextInt(locWidth);
                yPosItems = random.nextInt(locHeight);
            } while (!isEmptyRoom(xPosItems, yPosItems));

            location[yPosItems][xPosItems] = items;
        }
        System.out.println("Medkit in Location has spawn. Count is " + countItems + ", HP=" + valueItems);
    }

    public static void directionPlayer() {

        int currentX = xPosPlayer;
        int currentY = yPosPlayer;

        int playerMoveValue;

        do {
            System.out.print("Enter destination: (UP=" + moveUp + " | DOWN=" + moveDown +
                    " | LEFT=" + moveLeft + " | RIGHT=" + moveRight + ") >>> ");
            playerMoveValue = scanner.nextInt();

            switch (playerMoveValue) {
                case moveUp:
                    yPosPlayer -= 1;
                    break;
                case moveDown:
                    yPosPlayer += 1;
                    break;
                case moveLeft:
                    xPosPlayer -= 1;
                    break;
                case moveRight:
                    xPosPlayer += 1;
                    break;
            }

        } while (!isValidMovePlayer(currentX, currentY, xPosPlayer, yPosPlayer));

        playerNextMoveAction(currentX, currentY, xPosPlayer, yPosPlayer);

    }

    public static void playerNextMoveAction(int lastX, int lastY, int nextX, int nextY) {
        if (location[nextY][nextX] == enemy) {

            // игрок и враг одновременно наносят удары друг другу, если враг с первого удара не повержен - повторяем процесс
            System.out.println();
            System.out.println("=====> Begin BATTLE <=====");
            do {
                // обмен ударами
                healthEnemy -= strPlayer; //  атакует игрок
                System.out.println("Player give damage to enemy is " + strPlayer + ". " + "enemy health is " + healthEnemy);
                healthPlayer -= strEnemy; // атакует враг
                System.out.println("Enemy give damage to " + namePlayer + " is " + strEnemy + ". " + namePlayer + " health is " + healthPlayer);
            } while (healthEnemy > 0);
            countEnemies--;
            System.out.println("=====> Enemy is dead. The battle's over. <=====");
            System.out.println();
            System.out.println("Result of battle: " + namePlayer + " - HP=" + healthPlayer + ", count enemy is " + countEnemies + ", count Medkit is " + countItems + ".");

            location[lastY][lastX] = readyRoom;
            location[nextY][nextX] = player;

        } else if (location[nextY][nextX] == items) {
            healthPlayer += valueItems;
            countItems--;
            System.out.println();
            System.out.println("Medkit found! " + namePlayer + " health has improved to " + healthPlayer);
            System.out.println("Count enemy is " + countEnemies + ", count Medkit is " + countItems + ".");
        }
        location[lastY][lastX] = readyRoom;
        location[nextY][nextX] = player;
    }

    public static boolean isValidMovePlayer(int currentX, int currentY, int nextX, int nextY) {
        if (nextX >= 0 && nextX < locWidth && nextY >= 0 && nextY < locHeight) {
            System.out.println(namePlayer + " move to [" + nextX + ":" + nextY + "]. HP=" + healthPlayer);
            System.out.println("Count enemies is " + countEnemies + ". Count Medkit is " + countItems + ".");
            return true;
        } else {
            System.out.println("Invalid move! Try again!");
            xPosPlayer = currentX;
            yPosPlayer = currentY;
            return false;
        }
    }

    public static boolean isEmptyRoom(int x, int y) {
        return location[y][x] == emptyRoom;
    }

    public static void printLocation() {
        System.out.println("=====> LOCATION <=====");
        for (int y = 0; y < locHeight; y++) {
            for (int x = 0; x < locWidth; x++) {
                //скрываем врагов и аптечки
                if (isHide && (location[y][x] == enemy/* || location[y][x] == items*/)) { // аптечки пока не скрываем - не найден баланс (игроку часто не хватает НР)
                    System.out.print(emptyRoom + "|");
                } else {
                    System.out.print(location[y][x] + "|");
                }
            }
            System.out.println();
        }
        System.out.println("======================");
    }

    public static int myRandomValueInt(int min, int max) {
        return min + random.nextInt(max - min + 1);
    }

    public static boolean isALivePlayer() {
        return healthPlayer > 0;
    }

    public static boolean isReadyLocation() {
        for (int y = 0; y < locHeight; y++) {
            for (int x = 0; x < locWidth; x++) {
                if (location[y][x] == emptyRoom || location[y][x] == enemy) {
                    return false;
                }
            }
        }
        return true;
    }

}
