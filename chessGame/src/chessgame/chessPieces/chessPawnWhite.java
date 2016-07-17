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
public class chessPawnWhite extends chessPieces {
    
    public chessPawnWhite(String colour){
        super();
        name = "Pawn";
        shortName = "P";
        moves = new ArrayList<String>();
        moves.add("B+1");
        this.colour = colour;
     
    }
    
    
}
