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
    
    protected String name;
    
    protected String shortName;
    
    protected ArrayList<String> moves;
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getShortName(){
        return shortName;
    }
    
    public ArrayList<String> getMoves(){
        return moves;
    }
}
