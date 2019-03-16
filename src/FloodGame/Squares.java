package FloodGame;

import java.awt.*;

public class Squares {
    protected int squareWidth;
    protected int squareHeight;
    protected Color c;
    protected boolean taken;
    public Squares(Color c, int squareWidth, int squareHeight){
        taken = false;
        this.c = c;
        this.squareWidth = squareWidth;
        this.squareHeight = squareHeight;
    }
    public boolean getTaken(){
        return taken;
    }
    public int getSquareHeight() {
        return squareHeight;
    }
    public int getSquareWidth() {
        return squareWidth;
    }
    public Color getC() {
        return c;
    }
    public boolean isTaken() {
        return taken;
    }
    public void setTaken(boolean changeTaken){
        this.taken = changeTaken;
    }
    public void setSquareWidth(int squareWidth) {
        this.squareWidth = squareWidth;
    }
    public void setSquareHeight(int squareHeight) {
        this.squareHeight = squareHeight;
    }
    public void setC(Color c) {
        this.c = c;
    }
}
