package Sockets.Part9;

import javax.swing.JPanel;

public interface ICardControls {
    void next();
    void previous();
    void show(String cardName);
    void addPanel(String name, JPanel panel);
    void connect();
}