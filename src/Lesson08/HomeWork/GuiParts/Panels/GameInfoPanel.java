package Lesson08.HomeWork.GuiParts.Panels;

import javax.swing.*;
import java.awt.*;

/**
 * @author Konstantin Babenko
 * @create 11.11.2021
 * modified 17.11.2021
 */

public class GameInfoPanel extends JPanel {

    private String prefixEnemyCount = "Enemies: ";
    private String prefixLevel = "Level: ";
    private String prefixSizeMap = "Size map: ";

    private JLabel enemyCount;
    private JLabel levelGame;
    private JLabel sizeMap;

    public GameInfoPanel() {

        setLayout(new GridLayout(4, 1)); // меняем компоновщика элементов
        setBackground(Color.lightGray);

        enemyCount = new JLabel(prefixEnemyCount + "-");
        levelGame = new JLabel(prefixLevel + "-");
        sizeMap = new JLabel(prefixSizeMap + "-:-");

        // добавляем элементы на панель
        add(new JLabel("= Game Info =", SwingConstants.CENTER));
        add(enemyCount);
        add(levelGame);
        add(sizeMap);
    }

    public void refreshGameInfo(int countInfo, int level, String sizeMapInfo) {
        enemyCount.setText(prefixEnemyCount + countInfo);
        levelGame.setText(prefixLevel + level);
        sizeMap.setText(prefixSizeMap + sizeMapInfo);
    }

}
