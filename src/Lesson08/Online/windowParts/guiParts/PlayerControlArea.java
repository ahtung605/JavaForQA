package Lesson08.Online.windowParts.guiParts;

import Lesson08.Online.windowParts.GameMap;
import Lesson08.Online.windowParts.GuiPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 10.11.2021
 */

public class PlayerControlArea extends JPanel {

    private GuiPanel guiPanel;

    private JButton btnMoveUp;
    private JButton btnMoveLeft;
    private JButton btnMoveRight;
    private JButton btnMoveDown;

    public PlayerControlArea(GuiPanel guiPanel) {
        this.guiPanel = guiPanel;

        setLayout(new GridLayout(2,3));

        btnMoveUp = new JButton("⮝"); //\uD83E\uDC45
        btnMoveUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guiPanel.changePositionPlayer(GameMap.DIRECTION_MOVE_UP);
            }
        });

        btnMoveLeft = new JButton("⮜"); //\uD83E\uDC44
        btnMoveLeft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guiPanel.changePositionPlayer(GameMap.DIRECTION_MOVE_LEFT);
            }
        });

        btnMoveRight = new JButton("⮞"); //\uD83E\uDC46
        btnMoveRight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guiPanel.changePositionPlayer(GameMap.DIRECTION_MOVE_RIGHT);
            }
        });

        btnMoveDown = new JButton("⮟"); //\uD83E\uDC47
        btnMoveDown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guiPanel.changePositionPlayer(GameMap.DIRECTION_MOVE_DOWN);
            }
        });

        add(new JPanel());
        add(btnMoveUp);
        add(new JPanel());
        add(btnMoveLeft);
        add(btnMoveDown);
        add(btnMoveRight);
    }
}
