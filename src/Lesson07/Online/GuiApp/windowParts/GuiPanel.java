package Lesson07.Online.GuiApp.windowParts;

import Lesson07.Online.GuiApp.windowParts.guiParts.GameControlArea;
import Lesson07.Online.GuiApp.windowParts.guiParts.GameInfoArea;
import Lesson07.Online.GuiApp.windowParts.guiParts.PlayerControlArea;
import Lesson07.Online.GuiApp.windowParts.guiParts.PlayerInfoArea;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 10.11.2021
 */

public class GuiPanel extends JPanel {

    private GameControlArea gameControlArea;
    private PlayerInfoArea playerInfoArea;
    private GameInfoArea gameInfoArea;
    private PlayerControlArea playerControlArea;

    private JTextArea gameLog;
    private JScrollPane scrollLog;


    public GuiPanel() {
        prepare();
        createParts();
        prepareLogArea();

        add(gameControlArea);
        add(playerInfoArea);
        add(gameInfoArea);
        add(playerControlArea);
        add(scrollLog);
    }

    public void prepare() {
        setBackground(Color.RED);
        setLayout(new GridLayout(5, 1));
    }

    public void prepareLogArea() {
        gameLog = new JTextArea("Game Log");
        scrollLog = new JScrollPane(gameLog);
    }

    public void createParts() {
        gameControlArea = new GameControlArea();
        playerInfoArea = new PlayerInfoArea();
        gameInfoArea = new GameInfoArea();
        playerControlArea = new PlayerControlArea();
    }
}
