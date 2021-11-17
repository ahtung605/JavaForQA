package Lesson08.HomeWork.GuiParts.Panels;

import Lesson08.HomeWork.GuiParts.GameInfo;
import Lesson08.Online.windowParts.GameMap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author Konstantin Babenko
 * @create 11.11.2021
 * modified 17.11.2021
 */

public class PlayerControlPanel extends JPanel {

    private GameInfo gameInfo;

    private JButton btnMoveUp;
    private JButton btnMoveLeft;
    private JButton btnMoveRight;
    private JButton btnMoveDown;

    public PlayerControlPanel(GameInfo gameInfo) {
        this.gameInfo = gameInfo;

        setLayout(new GridLayout(2, 3)); // меняем компоновщика элементов
        setBackground(Color.LIGHT_GRAY);

        btnMoveUp = new JButton("⮝"); //\uD83E\uDC45
        btnMoveUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameInfo.changePositionPlayer(GameMap.DIRECTION_MOVE_UP);
            }
        });

        btnMoveLeft = new JButton("⮜"); //\uD83E\uDC44
        btnMoveLeft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameInfo.changePositionPlayer(GameMap.DIRECTION_MOVE_LEFT);
            }
        });

        btnMoveRight = new JButton("⮞"); //\uD83E\uDC46
        btnMoveRight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameInfo.changePositionPlayer(GameMap.DIRECTION_MOVE_RIGHT);
            }
        });

        btnMoveDown = new JButton("⮟"); //\uD83E\uDC47
        btnMoveDown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameInfo.changePositionPlayer(GameMap.DIRECTION_MOVE_DOWN);
            }
        });

        // добавляем элементы на панель
        add(new JPanel());
        add(btnMoveUp);
        add(new JPanel());
        add(btnMoveLeft);
        add(btnMoveDown);
        add(btnMoveRight);
    }


}
