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
public class chessBishop extends chessPieces{
    
      public chessBishop(String colour){
        name = "Bishop";
        shortName = "B";
        moves = new ArrayList<String>();
        moves.add("DL++");
        moves.add("DL--");
        moves.add("DR++");
        moves.add("DR--");
        this.colour = colour;
  
    }
}
