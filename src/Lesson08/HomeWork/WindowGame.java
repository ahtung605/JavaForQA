package Lesson08.HomeWork;


import Lesson08.HomeWork.GuiParts.GameInfo;
import Lesson08.HomeWork.GuiParts.GameMap;

import javax.swing.*;
import java.awt.*;

/**
 * @author Konstantin Babenko
 * @create 11.11.2021
 * modified 17.11.2021
 */

public class WindowGame extends JFrame {

    private int windowWidth = 1024;
    private int windowHeight = 768;
    private int windowPosX = 300;
    private int windowPosY = 100;
    private String windowTitle = "First Game";

    private GameMap gameMap;
    private GameInfo gameInfo;

    WindowGame() {

        setupWindow(); // настройка главного окна

        // создаем основные панели (родительские)
        gameMap = new GameMap(this);
        gameInfo = new GameInfo(this);

        // добавляем основные панели на окно
        add(gameMap);
        add(gameInfo, BorderLayout.EAST);

        setVisible(true); // отобразить окно
    }

    private void setupWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // по закрытию на крестик - выход и завершение программы
        setSize(windowWidth, windowHeight); // размер окна
        setLocation(windowPosX, windowPosY); // левый верхний угол
        setTitle(windowTitle); // заголовок окна
        setResizable(true); // можно изменять размеры окна
    }

    public void startNewGame() {
        gameMap.launchNewGame();
    }

    public void recordLog(String msg) {
        gameInfo.recordLog(msg);
    }

    public void refreshInfo(GameMap map) {
        gameInfo.refreshGuiInfo(map);
    }

    public void changePositionPlayer(int key) {
        gameMap.updatePlayer(key);
    }

}
