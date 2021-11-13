package Lesson08.Online.windowParts.guiParts;

import Lesson08.Online.models.Player;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 10.11.2021
 */

public class PlayerInfoArea extends JPanel {

    private String prefixHP = "Health: ";
    private String prefixStr = "Str: ";
    private String prefixPosition = "Position: ";

    private JLabel playerHP;
    private JLabel playerStr;
    private JLabel playerPosition;

    public PlayerInfoArea() {
        setLayout(new GridLayout(4,1));

        playerHP = new JLabel(prefixHP + "-");
        playerStr = new JLabel(prefixStr + "-");
        playerPosition = new JLabel(prefixPosition + "-:-");

        add(new JLabel("= Player Info =", SwingConstants.CENTER));
        add(playerHP);
        add(playerStr);
        add(playerPosition);
    }

    public void refreshPlayerInfo(Player player) {
        playerHP.setText(prefixHP + player.getHealth());
        playerPosition.setText(prefixPosition + player.getPosition());
    }

}
