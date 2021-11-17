package Lesson08.HomeWork.GuiParts;

import Lesson08.HomeWork.GuiParts.Panels.GameButtonPanel;
import Lesson08.HomeWork.GuiParts.Panels.GameInfoPanel;
import Lesson08.HomeWork.GuiParts.Panels.PlayerControlPanel;
import Lesson08.HomeWork.GuiParts.Panels.PlayerInfoPanel;
import Lesson08.HomeWork.WindowGame;

import javax.swing.*;
import java.awt.*;

/**
 * @author Konstantin Babenko
 * @create 11.11.2021
 * modified 17.11.2021
 */

public class GameInfo extends JPanel {
    private WindowGame windowGame;

    private GameButtonPanel gameButtonPanel;
    private GameInfoPanel gameInfoPanel;
    private PlayerInfoPanel playerInfoPanel;
    private PlayerControlPanel playerControlPanel;

    private JTextArea gameLog;
    private JScrollPane scrollLog;

    public GameInfo(WindowGame windowGame) {
        this.windowGame = windowGame;
        // готовим "почву"
        prepareBackGround();
        createPanels();
        prepareLogArea();

        // добавляем панели
        add(gameButtonPanel);
        add(gameInfoPanel);
        add(playerInfoPanel);
        add(playerControlPanel);
        add(scrollLog);
    }

    // задаем фон компоновщмка для оснновно ИНФО панели
    public void prepareBackGround() {
        setBackground(Color.RED);
        setLayout(new GridLayout(5, 1));
    }

    // создаем вспомогательные панели
    public void createPanels() {
        gameButtonPanel = new GameButtonPanel(this);
        gameInfoPanel = new GameInfoPanel();
        playerInfoPanel = new PlayerInfoPanel();
        playerControlPanel = new PlayerControlPanel(this);
    }

    // создаем ЛОГ панель
    public void prepareLogArea() {
        gameLog = new JTextArea("Game Log"); // текстовая область для лога
        gameLog.setEditable(false);
        gameLog.setLineWrap(true);
        scrollLog = new JScrollPane(gameLog); // скрол над тестоым логом (управляющий элемнт)
    }

    public void recordLog(String msg) {
        gameLog.append(msg + "\n");
    }

    public void launchNewGame() {
        windowGame.startNewGame();
    }

    public void refreshGuiInfo(GameMap map) {
        playerInfoPanel.refreshPlayerInfo(map.getPlayer());
        gameInfoPanel.refreshGameInfo(map.getCountEnemies(), map.getLevelCount(), map.getMapSize());
    }

    public void changePositionPlayer(int key) {
        windowGame.changePositionPlayer(key);
    }

}
