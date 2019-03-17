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
        Squares[][] squareArr = new Squares[21][16];
        for(int i = 0; i<=20; i++) {
            for(int j = 0; j<=15; j++) {
                squareArr[i][j] = new Squares(getSquareColor(), (getWidth()/2)/10, (getHeight()/2)/10);
                squareArr[i][j].setC(getSquareColor());
                g.setColor(squareArr[i][j].getC());
                g.drawRect(i*squareArr[i][j].getSquareWidth(), j*squareArr[i][j].getSquareHeight(), squareArr[i][j].getSquareWidth(), squareArr[i][j].getSquareHeight());
                g.fillRect(i*squareArr[i][j].getSquareWidth(), j*squareArr[i][j].getSquareHeight(), squareArr[i][j].getSquareWidth(), squareArr[i][j].getSquareHeight());
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
