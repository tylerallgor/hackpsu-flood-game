package FloodGame;

import FloodGame.GamePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GameWindow implements ActionListener {
    private String title;
    protected int width;
    protected int height;
    protected static int moveCount = 0;
    protected JButton button1 = new JButton("Red");
    protected JButton button2 = new JButton("Orange");
    protected JButton button3 = new JButton("Yellow");
    protected JButton button4 = new JButton("Green");
    protected JButton button5 = new JButton("Blue");
    protected JButton button6 = new JButton("Magenta");
    protected JButton button7 = new JButton("Cyan");
    protected boolean redPressed = false;
    protected boolean orangePressed = false;
    protected boolean yellowPressed = false;
    protected boolean greenPressed = false;
    protected boolean bluePressed = false;
    protected boolean magentaPressed = false;
    protected boolean cyanPressed = false;
    public GameWindow(String title, int width, int height) {
        JFrame gameFrame = new JFrame(title);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.setSize(new Dimension(height, width));
        gameFrame.setLocationRelativeTo(null);
        gameFrame.setResizable(false);
        int buttonY = 370;
        int buttonWidth = 71;
        int buttonHeight = 110;
        button1.setBounds(0,buttonY,buttonWidth,buttonHeight);
        gameFrame.add(button1);
        button1.addActionListener(this);
        button2.setBounds(buttonWidth,buttonY,buttonWidth,buttonHeight);
        gameFrame.add(button2);
        button2.addActionListener(this);
        button3.setBounds(buttonWidth*2,buttonY,buttonWidth,buttonHeight);
        gameFrame.add(button3);
        button3.addActionListener(this);
        button4.setBounds(buttonWidth*3,buttonY,buttonWidth,buttonHeight);
        gameFrame.add(button4);
        button4.addActionListener(this);
        button5.setBounds(buttonWidth*4,buttonY,buttonWidth,buttonHeight);
        gameFrame.add(button5);
        button5.addActionListener(this);
        button6.setBounds(buttonWidth*5,buttonY,buttonWidth,buttonHeight);
        gameFrame.add(button6);
        button6.addActionListener(this);
        button7.setBounds(buttonWidth*6,buttonY,buttonWidth,buttonHeight);
        gameFrame.add(button7);
        button7.addActionListener(this);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        moveCount++;
        if(e.getActionCommand() == "Red") {
            redPressed = true;
        }
        else if(e.getActionCommand() == "Orange") {
            orangePressed = true;
        }
        else if(e.getActionCommand() == "Yellow") {
            yellowPressed = true;
        }
        else if(e.getActionCommand() == "Green") {
            greenPressed = true;
        }
        else if(e.getActionCommand() == "Blue") {
            bluePressed = true;
        }
        else if(e.getActionCommand() == "Magenta") {
            magentaPressed = true;
        }
        else if(e.getActionCommand() == "Cyan") {
            cyanPressed = true;
        }
    }
}
