package Lesson07.HomeWork.GuiParts.Panels.AddPanels;

import javax.swing.*;
import java.awt.*;

/**
 * @author Konstantin Babenko
 * @create 11.11.2021
 */

public class AddPanelPlayerControl extends JPanel {

    private JButton btnNull1;
    private JButton btnNull2;
    private JButton btnUp;
    private JButton btnLeft;
    private JButton btnRight;
    private JButton btnDowm;

    public AddPanelPlayerControl() {
        setLayout(new GridLayout(2, 3)); // меняем компоновщика элементов

        btnNull1 = new JButton("");
        btnNull2 = new JButton("");
        btnUp = new JButton("<html><h1>^</h1></html>");
        btnLeft = new JButton("<html><h2>&lt;</h2></html>"); // <
        btnRight = new JButton("<html><h2>&gt;</h2></html>"); // >
        btnDowm = new JButton("<html><h2>v</h2></html>");

        // отключаю не нужные кнопки 1 и 3
        btnNull1.setEnabled(false);
        btnNull1.setBackground(Color.LIGHT_GRAY);
        btnNull2.setEnabled(false);
        btnNull2.setBackground(Color.LIGHT_GRAY);

        // добавляем элементы на панель
        add(btnNull1);
        add(btnUp);
        add(btnNull2);
        add(btnLeft);
        add(btnDowm);
        add(btnRight);
    }

}
