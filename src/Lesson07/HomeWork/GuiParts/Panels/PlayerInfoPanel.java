package Lesson07.HomeWork.GuiParts.Panels;

import Lesson07.HomeWork.GuiParts.Panels.AddPanels.AddPanelPlayerInfo;

import javax.swing.*;
import java.awt.*;

/**
 * @author Konstantin Babenko
 * @create 11.11.2021
 */

public class PlayerInfoPanel extends JPanel {

    private JLabel areaName;
    private AddPanelPlayerInfo addPanelPlayerInfo; // вспомогательная панель для выравнивания содержимого          по другому не получалось

    public PlayerInfoPanel() {

        setLayout(new GridLayout(2, 1)); // меняем компоновщика элементов
        setBackground(Color.cyan);

        areaName = new JLabel("<HTML><u> Player Info </u></HTML>", SwingConstants.CENTER);
        addPanelPlayerInfo = new AddPanelPlayerInfo();

        areaName.setForeground(Color.BLUE);

        // добавляем элементы на панель
        add(areaName);
        add(addPanelPlayerInfo);
    }

}
