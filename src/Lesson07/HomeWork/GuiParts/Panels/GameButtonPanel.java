package Lesson07.HomeWork.GuiParts.Panels;

import javax.swing.*;
import java.awt.*;

/**
 * @author Konstantin Babenko
 * @create 11.11.2021
 */

public class GameButtonPanel extends JPanel {

    private JLabel areaName;
    private JButton btnStartGame;
    private JButton btnEndGame;

    public GameButtonPanel() {
        setLayout(new GridLayout(3, 1)); // меняем компоновщика элементов
        setBackground(Color.ORANGE);

        areaName = new JLabel("<HTML><u> Game Control </u></HTML>", SwingConstants.CENTER); // заголовок блока
        // кнопки
        btnStartGame = new JButton("Start Game");
        btnEndGame = new JButton("End Game");

        // добавляем элементы на панель
        add(areaName);
        add(btnStartGame);
        add(btnEndGame);
    }

}
