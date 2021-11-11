package Lesson07.HomeWork.GuiParts;

import Lesson07.HomeWork.GuiParts.Panels.GameButtonPanel;
import Lesson07.HomeWork.GuiParts.Panels.GameInfoPanel;
import Lesson07.HomeWork.GuiParts.Panels.PlayerControlPanel;
import Lesson07.HomeWork.GuiParts.Panels.PlayerInfoPanel;

import javax.swing.*;
import java.awt.*;

/**
 * @author Konstantin Babenko
 * @create 11.11.2021
 */

public class GameInfo extends JPanel {

    private GameButtonPanel gameButtonPanel;
    private GameInfoPanel gameInfoPanel;
    private PlayerInfoPanel playerInfoPanel;
    private PlayerControlPanel playerControlPanel;

    private JTextArea gameLog;
    private JScrollPane scrollLog;

    public GameInfo() {
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
        gameButtonPanel = new GameButtonPanel();
        gameInfoPanel = new GameInfoPanel();
        playerInfoPanel = new PlayerInfoPanel();
        playerControlPanel = new PlayerControlPanel();
    }

    // создаем ЛОГ панель
    public void prepareLogArea() {
        gameLog = new JTextArea("Game Log"); // текстовая область для лога
        scrollLog = new JScrollPane(gameLog); // скрол над тестоым логом (управляющий элемнт)
    }

}
