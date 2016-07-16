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
public class chessQueen extends chessPieces{
    
    public chessQueen(){
        name = "Queen";
        shortName = "Q";
        moves = new ArrayList<String>();
        moves.add("DL++");
        moves.add("DL--");
        moves.add("DR++");
        moves.add("DR--");
        moves.add("F++");
        moves.add("B++");
        moves.add("L++");
        moves.add("R++");
  
    }
    
}
