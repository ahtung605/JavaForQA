package Lesson07.Online.GuiApp.windowParts.guiParts;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 10.11.2021
 */

public class GameControlArea extends JPanel {

    private JLabel areaName;
    private JButton btnStartGame;
    private JButton btnEndGame;

    public GameControlArea() {
        setLayout(new GridLayout(3,1));
        areaName = new JLabel("= Game Control =", SwingConstants.CENTER);
        btnStartGame = new JButton("Launcher Game");
        btnEndGame = new JButton("End Game");

        add(areaName);
        add(btnStartGame);
        add(btnEndGame);
    }
}
