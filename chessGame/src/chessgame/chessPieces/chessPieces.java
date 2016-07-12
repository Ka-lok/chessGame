/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessgame.chessPieces;

/**
 *
 * @author Kalok Chan
 */
public abstract class chessPieces {
    
    protected String name;
    
    protected String shortName;
    
    private String getName(){
        return name;
    }
    
    private void setName(String name){
        this.name = name;
    }
    
    private String getShortName(){
        return shortName;
    }
}
