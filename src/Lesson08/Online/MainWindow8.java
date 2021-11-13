package Lesson08.Online;

import Lesson08.Online.windowParts.GameMap;
import Lesson08.Online.windowParts.GuiPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 10.11.2021
 */

public class MainWindow8 extends JFrame {

    private int windowWidth = 1024;
    private int windowHeight = 768;
    private int windowPosX = 300;
    private int windowPosY = 100;
    private String windowTitle = "Title";

    private GuiPanel guiPanel;
    private GameMap gameMap;

    MainWindow8() {
        setupWindow();

        guiPanel = new GuiPanel(this);
        gameMap = new GameMap(this);

        add(gameMap);
        add(guiPanel, BorderLayout.EAST);

        setVisible(true);
    }

    private void setupWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(windowWidth, windowHeight);
        setLocation(windowPosX, windowPosY);
        setTitle(windowTitle);
        setResizable(true);
    }

    public void startNewGame() {
        gameMap.launchNewGame();
    }

    public void recordLog(String msg) {
        guiPanel.recordLog(msg);
    }

    public void refreshInfo(GameMap map) {
        guiPanel.refreshGuiInfo(map);
    }

    public void changePositionPlayer(int key) {
        gameMap.updatePlayer(key);
    }

}
