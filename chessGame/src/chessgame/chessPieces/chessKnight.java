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
public class chessKnight extends chessPieces{
    
    public chessKnight(){
        name = "Knight";
        shortName = "K";
        moves = new ArrayList<String>();
        moves.add("F+2K");
        moves.add("B+2K");
        moves.add("L+2K");
        moves.add("R+2K");
  
    }
    
}
