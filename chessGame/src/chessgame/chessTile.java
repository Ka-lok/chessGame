/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessgame;

import chessgame.chessPieces.chessPieces;
import javax.swing.JButton;

/**
 *
 * @author Kalok Chan
 */
public class chessTile {
    
    public chessTile(JButton j){
        tileJButton = j;
    }
    
    private JButton tileJButton;
    
    private chessPieces chessPiece;
    
    private int x;
    
    private int y;
    
    
    public void setJButton(JButton jButton){
        tileJButton = jButton;
    }
    
    public JButton getJButton(){
        return tileJButton;
    }
    
    public chessPieces getChessPiece(){
        return chessPiece;
    }
    
    public void setChessPiece(chessPieces chessPiece){
        this.chessPiece = chessPiece;
        
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
