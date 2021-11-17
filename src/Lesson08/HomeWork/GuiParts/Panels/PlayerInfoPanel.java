package Lesson08.HomeWork.GuiParts.Panels;

import Lesson08.Online.models.Player;

import javax.swing.*;
import java.awt.*;

/**
 * @author Konstantin Babenko
 * @create 11.11.2021
 * modified 17.11.2021
 */

public class PlayerInfoPanel extends JPanel {

    private String prefixHP = "Health: ";
    private String prefixStr = "Str: ";
    private String prefixPosition = "Position: ";

    private JLabel playerHP;
    private JLabel playerStr;
    private JLabel playerPosition;

    public PlayerInfoPanel() {

        setLayout(new GridLayout(4, 1)); // меняем компоновщика элементов
        setBackground(Color.cyan);

        playerHP = new JLabel(prefixHP + "-");
        playerStr = new JLabel(prefixStr + "-");
        playerPosition = new JLabel(prefixPosition + "-:-");

       // добавляем элементы на панель
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
