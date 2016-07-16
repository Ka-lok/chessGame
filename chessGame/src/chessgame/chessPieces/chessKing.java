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
        shortName = "K";
        moves = new ArrayList<String>();
        moves.add("F+1");
  
    }
}
