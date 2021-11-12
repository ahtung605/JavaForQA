package Lesson07.HomeWork.GuiParts.Panels.AddPanels;

import javax.swing.*;
import java.awt.*;

/**
 * @author Konstantin Babenko
 * @create 11.11.2021
 */

public class AddPanelGameInfo extends JPanel {

    private JLabel sizeMap;
    private JLabel enemyAll;
    private JLabel enemykilled;
    private JLabel medkitAll;
    private JLabel medkitRemained;
    private JLabel levelGame;

    public AddPanelGameInfo() {

        setLayout(new GridLayout(3, 2)); // меняем компоновщика элементов
        setBackground(Color.lightGray);

        sizeMap = new JLabel("  Map size - " + "3x3", SwingConstants.LEFT); // я думаю, что вместо "3х3" будут переменные из бэка
        levelGame = new JLabel("  Level Game - ", SwingConstants.LEFT);
        enemyAll = new JLabel("  Enemy All - ", SwingConstants.LEFT);
        enemykilled = new JLabel("  Enemy killed - ", SwingConstants.LEFT);
        medkitAll = new JLabel("  Medkit All - ", SwingConstants.LEFT);
        medkitRemained = new JLabel("  Medkit Remained - ", SwingConstants.LEFT);

        add(sizeMap);
        add(levelGame);
        add(enemyAll);
        add(enemykilled);
        add(medkitAll);
        add(medkitRemained);
    }

}
