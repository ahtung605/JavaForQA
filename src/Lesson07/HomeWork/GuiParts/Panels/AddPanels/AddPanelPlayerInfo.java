package Lesson07.HomeWork.GuiParts.Panels.AddPanels;

import javax.swing.*;
import java.awt.*;

/**
 * @author Konstantin Babenko
 * @create 11.11.2021
 */

public class AddPanelPlayerInfo extends JPanel {

    private JLabel playerName;
    private JLabel playerHp;
    private JLabel playerStrength;

    public AddPanelPlayerInfo() {

        setLayout(new GridLayout(4, 1)); // меняем компоновщика элементов
        setBackground(Color.cyan);

        playerName = new JLabel("  Player Name - ", SwingConstants.LEFT);
        playerHp = new JLabel("  Player HP - ", SwingConstants.LEFT);
        playerStrength = new JLabel("  Player Strength - ", SwingConstants.LEFT);

        playerName.setForeground(Color.BLUE);
        playerHp.setForeground(Color.BLUE);
        playerStrength.setForeground(Color.BLUE);

        add(playerName);
        add(playerHp);
        add(playerStrength);
    }

}
