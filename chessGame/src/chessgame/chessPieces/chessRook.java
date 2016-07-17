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
public class chessRook extends chessPieces {
    
    public chessRook(String colour){
        name = "Rook";
        shortName = "R";
        moves = new ArrayList<String>();
        moves.add("F++");
        moves.add("B++");
        moves.add("L++");
        moves.add("R++");
        this.colour = colour;
    }
    
}
