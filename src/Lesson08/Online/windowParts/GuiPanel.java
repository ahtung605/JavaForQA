package Lesson08.Online.windowParts;

import Lesson08.Online.MainWindow8;
import Lesson08.Online.windowParts.guiParts.GameControlArea;
import Lesson08.Online.windowParts.guiParts.GameInfoArea;
import Lesson08.Online.windowParts.guiParts.PlayerControlArea;
import Lesson08.Online.windowParts.guiParts.PlayerInfoArea;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 10.11.2021
 */

public class GuiPanel extends JPanel {
    private MainWindow8 mainWindow;

    private GameControlArea gameControlArea;
    private PlayerInfoArea playerInfoArea;
    private GameInfoArea gameInfoArea;
    private PlayerControlArea playerControlArea;

    private JTextArea gameLog;
    private JScrollPane scrollLog;

    public GuiPanel(MainWindow8 mainWindow) {
        this.mainWindow = mainWindow;
        prepare();
        createParts();
        prepareLogArea();

        add(gameControlArea);
        add(playerInfoArea);
        add(gameInfoArea);
        add(playerControlArea);
        add(scrollLog);
    }

    private void prepare() {
        setBackground(Color.RED);
        setLayout(new GridLayout(5, 1));
    }

    private void prepareLogArea() {
        gameLog = new JTextArea();
        gameLog.setEditable(false);
        gameLog.setLineWrap(true);
        scrollLog = new JScrollPane(gameLog);
    }

    private void createParts() {
        gameControlArea = new GameControlArea(this);
        playerInfoArea = new PlayerInfoArea();
        gameInfoArea = new GameInfoArea();
        playerControlArea = new PlayerControlArea(this);
    }

    public void recordLog(String msg) {
        gameLog.append(msg + "\n");
    }

    public void launchNewGame() {
        mainWindow.startNewGame();
    }

    public void refreshGuiInfo(GameMap map) {
        playerInfoArea.refreshPlayerInfo(map.getPlayer());
        gameInfoArea.refreshGameInfo(map.getCountEnemies(), map.getLevelCount(), map.getMapSize());
    }

    public void changePositionPlayer(int key) {
        mainWindow.changePositionPlayer(key);
    }
}
