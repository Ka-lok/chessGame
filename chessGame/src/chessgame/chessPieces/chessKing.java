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
public class chessKing extends chessPieces{
    public chessKing(){
         name = "King";
        shortName = "King";
        moves = new ArrayList<String>();
        moves.add("F+1");
        moves.add("B+1");
        moves.add("L+1");
        moves.add("R+1");
        moves.add("DL+1");
        moves.add("DL-1");
        moves.add("DR+1");
        moves.add("DR-1");
  
    }
}
