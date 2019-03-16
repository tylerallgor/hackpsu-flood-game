package FloodGame;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GamePanel extends JPanel {
    public GamePanel() {
        super();
    }
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Squares square = new Squares(getSquareColor(), getWidth()/10, getHeight()/10);
        for(int i = 0; i<=getWidth(); i++) {
            for(int j = 0; j<=getHeight(); j++) {
                square.setC(getSquareColor());
                g.setColor(square.getC());
                g.drawRect(i*square.getSquareWidth(), j*square.getSquareHeight(), square.getSquareWidth(), square.getSquareHeight());
                g.fillRect(i*square.getSquareWidth(), j*square.getSquareHeight(), square.getSquareWidth(), square.getSquareHeight());
            }
        }
    }
    public static Color getSquareColor() {
        ArrayList<Color> colorArr = new ArrayList<Color>();
        colorArr.add(Color.RED);
        colorArr.add(Color.ORANGE);
        colorArr.add(Color.YELLOW);
        colorArr.add(Color.GREEN);
        colorArr.add(Color.BLUE);
        colorArr.add(Color.MAGENTA);
        colorArr.add(Color.CYAN);
        int randomIndex = (int)(Math.random()*6);
        return colorArr.get(randomIndex);
    }
}
