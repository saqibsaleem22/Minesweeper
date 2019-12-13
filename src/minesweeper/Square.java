package minesweeper;

import javax.swing.*;
import java.awt.*;

/**
 * This class creates cells for Minesweeper.
 * @author saqib
 * @version 1.0
 * @since 10/04/2019
 */
public class Square extends JButton {
    
    /*
    Class properties
    state: a Square can have for different states 
           0 for unclicked, 1 for flagged, 2 for marked, 3 for opened.
    row,col: Saves the position on which this Square is present.
    mined: is true or false depending on if our Square is mined or not.
    */
    private int state;
    private int row, col;
    private boolean mined;
    
    /**
     * The class constructor gives initial values to its properties
     * @param row The row on which we want our Square to be.
     * @param col The column on which we want our Square to be.
     */
    public Square(int row, int col) {

        this.setBackground(Color.white);
        this.setFocusable(false);
        this.row = row;
        this.col = col;
        this.state = 0;
        this.mined = false;
        
    }
    
    /**
     * This method sets an icon for our Square depending on 
     * the state and size of our Square.
     * @param dir The icon directory
     * @param enabled This should be true or false depending on Square
     */
    public void setIcon(String dir, boolean enabled) {

        ImageIcon icon = new ImageIcon(getClass().getResource(dir));
        Image img = icon.getImage();
        //resizes the image.
        Image newImg = img.getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);
        if (!enabled) {
            this.setDisabledIcon(newImc);
        } else {
            this.setIcon(newImc);
        }

    }
    
    /**
     * Sets the font for Square depending on its 
     * current size.
     * @param tam the size you want to set for font.
     */
    public void setFont(int tam) {
        int size = (40 * 10) / tam;
        this.setFont(new Font("Arial Black", Font.BOLD, size));
    }
    
    /**
     * gets the state of Square
     * @return 0,1,2 or 3 depending on current state of Square
     */
    public int state() {
        return state;
    }
    
    /**
     * Sets the state of Square
     * @param state The state you want to give to your Square.
     */
    public void setState(int state) {
        this.state = state;
    }
    
    /**
     * Checks if Square is mined or not
     * @return 
     */
    public boolean mined() {
        return mined;
    }
    
    /**
     * Sets a mine in Square.
     * @param mined 
     */
    public void setMined(boolean mined) {
        this.mined = mined;
    }
    
    /**
     * gets row of Square
     * @return the row on which Square is present.
     */
    public int getRow() {
        return row;
    }
    
    /**
     * Sets row for our Square
     * @param row Row on which we want our Square.
     */
    public void setRow(int row) {
        this.row = row;
    }
    
    /**
     * Gets the column on which our Square is present.
     * @return The column on which our Square is present
     */
    public int getCol() {
        return col;
    }
    
    /**
     * Sets column on which we want our Square.
     * @param col The column on which we want our Square to be.
     */
    public void setCol(int col) {
        this.col = col;
    }

}
