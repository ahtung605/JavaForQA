package Lesson08.HomeWork.GuiParts.Panels;

import Lesson08.HomeWork.GuiParts.GameInfo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author Konstantin Babenko
 * @create 11.11.2021
 * modified 17.11.2021
 */

public class GameButtonPanel extends JPanel {

    private GameInfo gameInfo;

    private JLabel areaName;
    private JButton btnStartGame;
    private JButton btnEndGame;

    public GameButtonPanel(GameInfo gameInfo) {
        this.gameInfo = gameInfo;

        setLayout(new GridLayout(3, 1)); // меняем компоновщика элементов
        setBackground(Color.ORANGE);

        areaName = new JLabel("<HTML><u> Game Control </u></HTML>", SwingConstants.CENTER); // заголовок блока
        // кнопки
        btnStartGame = new JButton("Start Game");
        btnStartGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameInfo.launchNewGame();
            }
        });

        btnEndGame = new JButton("End Game");
        btnEndGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // добавляем элементы на панель
        add(areaName);
        add(btnStartGame);
        add(btnEndGame);
    }

}
