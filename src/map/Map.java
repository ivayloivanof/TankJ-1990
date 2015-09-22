package map;

import javax.swing.*;

public class Map {
    private int width;
    private int hight;

    public Map(int width, int hight) {
        this.width = width;
        this.hight = hight;
        this.createMap();
    }

    private void createMap() {
        JFrame frame = new JFrame("TankJ-1990");
        frame.setVisible(true);
        frame.setFocusable(true);
        frame.setSize(this.width, this.hight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
