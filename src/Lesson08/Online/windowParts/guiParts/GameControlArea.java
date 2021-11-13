package Lesson08.Online.windowParts.guiParts;

import Lesson08.Online.windowParts.GuiPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 10.11.2021
 */

public class GameControlArea extends JPanel {

    private GuiPanel guiPanel;
    private JButton btnStartGame;
    private JButton btnEndGame;

    public GameControlArea(GuiPanel guiPanel) {
        this.guiPanel = guiPanel;
        setLayout(new GridLayout(3,1));
        btnStartGame = new JButton("Launch Game");
        btnStartGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guiPanel.launchNewGame();
            }
        });

        btnEndGame = new JButton("End Game");
        btnEndGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        add(new JLabel("= Game Control =", SwingConstants.CENTER));
        add(btnStartGame);
        add(btnEndGame);
    }
}
