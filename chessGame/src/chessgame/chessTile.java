/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessgame;

import chessgame.chessPieces.chessPieces;
import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author Kalok Chan
 */
public class chessTile extends JButton{
    
    public chessTile(){
    super();
    setBackground(new Color(240,240,240));
    
            }
    private chessPieces chessPiece;
    
    private int x;
    
    private int y;
    
    private boolean hasPiece;
    
    public void setHasPiece(Boolean b){
        hasPiece = b;
    }
    
    public boolean getHasPiece(){
        return hasPiece;
    }
    
    public chessPieces getChessPiece(){
        return chessPiece;
    }
    
    public void setChessPiece(chessPieces chessPiece){
        
        this.chessPiece = chessPiece;
        setHasPiece(true);
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    
    
}
