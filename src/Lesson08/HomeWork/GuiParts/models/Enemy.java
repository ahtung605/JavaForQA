package Lesson08.HomeWork.GuiParts.models;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 13.11.2021
 * modified 17.11.2021 Konstantin Babenko
 */

public class Enemy {

    private int health;
    private int attackPoint;
    private int x;
    private int y;

    private int enemyValueMin = 20;
    private int enemyValueMax = 30;

    private int countEnemies;

    public Enemy(int countEnemies) {
        this.attackPoint = Tools.randomValue(enemyValueMin, enemyValueMax);
        this.health = Tools.randomValue(enemyValueMin, enemyValueMax);
        this.countEnemies = countEnemies;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void decreaseHP(int value) {
        this.health -= value;
    }

    public int getCountEnemies() {
        return countEnemies;
    }

    public void killEnemy() {
        --countEnemies;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPoint() {
        return attackPoint;
    }
}
