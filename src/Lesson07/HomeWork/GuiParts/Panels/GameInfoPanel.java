package Lesson07.HomeWork.GuiParts.Panels;

import Lesson07.HomeWork.GuiParts.Panels.AddPanels.AddPanelGameInfo;

import javax.swing.*;
import java.awt.*;

/**
 * @author Konstantin Babenko
 * @create 11.11.2021
 */

public class GameInfoPanel extends JPanel {

    private JLabel areaName;
    private AddPanelGameInfo addPanelGameInfo; // вспомогательная панель для выравнивания содержимого          по другому не получалось

    public GameInfoPanel() {

        setLayout(new GridLayout(2, 1)); // меняем компоновщика элементов
        setBackground(Color.lightGray);

        areaName = new JLabel("<HTML><u> Game Info <u></HTML>", SwingConstants.CENTER);
        addPanelGameInfo = new AddPanelGameInfo();

        // добавляем элементы на панель
        add(areaName);
        add(addPanelGameInfo);
    }

}
