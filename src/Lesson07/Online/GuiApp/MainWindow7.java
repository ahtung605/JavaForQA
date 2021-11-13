package Lesson07.Online.GuiApp;

import Lesson07.Online.GuiApp.windowParts.GameMap;
import Lesson07.Online.GuiApp.windowParts.GuiPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 10.11.2021
 */

public class MainWindow7 extends JFrame {

    private int windowWidth = 1024;
    private int windowHeight = 768;
    private int windowPosX = 300;
    private int windowPosY = 100;
    private String windowTitle = "Title";

    private GuiPanel guiPanel;
    private GameMap gameMap;

    MainWindow7() {
        setupWindow();

        guiPanel = new GuiPanel();
        gameMap = new GameMap();

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

}