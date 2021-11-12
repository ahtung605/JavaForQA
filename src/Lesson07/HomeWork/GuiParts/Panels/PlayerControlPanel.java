package Lesson07.HomeWork.GuiParts.Panels;

import Lesson07.HomeWork.GuiParts.Panels.AddPanels.AddPanelPlayerControl;

import javax.swing.*;
import java.awt.*;

/**
 * @author Konstantin Babenko
 * @create 11.11.2021
 */

public class PlayerControlPanel extends JPanel {

    private JLabel areaName;
    private AddPanelPlayerControl addPanelPlayerControl; // вспомогательная панель для выравнивания содержимого          по другому не получалось

    public PlayerControlPanel() {
        setLayout(new GridLayout(2, 1)); // меняем компоновщика элементов
        setBackground(Color.LIGHT_GRAY);

        areaName = new JLabel("<HTML><u> Player Control </u></HTML>", SwingConstants.CENTER);
        addPanelPlayerControl = new AddPanelPlayerControl();

        // добавляем элементы на панель
        add(areaName);
        add(addPanelPlayerControl);
    }


}
