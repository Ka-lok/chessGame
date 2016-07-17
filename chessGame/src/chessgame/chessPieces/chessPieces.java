/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessgame.chessPieces;

import java.util.ArrayList;

/**
 *
 * @author Kalok Chan
 */
public abstract class chessPieces {
    
    public chessPieces(){
       
    }
    
    protected String name;
    
    protected String shortName;
    
    protected ArrayList<String> moves;
    
    protected String colour;
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getColour(){
        return colour;
    }
    
    public String getShortName(){
        return shortName;
    }
    
    public ArrayList<String> getMoves(){
        return moves;
    }
}
