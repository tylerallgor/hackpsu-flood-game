package FloodGame;

import FloodGame.GamePanel;

import javax.swing.*;
import java.awt.*;

public class GameWindow {
    private String title;
    protected int width;
    protected int height;
    public GameWindow(String title, int width, int height) {
        JFrame gameFrame = new JFrame(title);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.setSize(new Dimension(height, width));
        gameFrame.setLocationRelativeTo(null);
        gameFrame.setResizable(false);
        GamePanel gamePanel = new GamePanel();
        gameFrame.getContentPane().add(gamePanel);
        gameFrame.setVisible(true);
    }
    public String getTitle() {
        return title;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
}
