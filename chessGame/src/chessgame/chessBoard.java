/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessgame;

import chessgame.chessPieces.chessBishop;
import chessgame.chessPieces.chessKing;
import chessgame.chessPieces.chessKnight;
import chessgame.chessPieces.chessPawn;
import chessgame.chessPieces.chessPieces;
import chessgame.chessPieces.chessQueen;
import chessgame.chessPieces.chessRook;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Kalok Chan
 */
public class chessBoard extends javax.swing.JFrame implements ActionListener {

    /**
     * ~
     *
     * Creates new form chessBoard
     */
    public chessBoard() {

        initComponents();
        jPanel = new JPanel();
        Layout = new GridLayout(8, 8);
        setLayout(Layout);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBoardUp();
        selected = false;
        allPossibleMoves = new ArrayList<chessTile>();
        setVisible(true);
    }

    chessTile[][] arrayBoard = new chessTile[8][8];
    GridLayout Layout;
    private boolean selected;
    private chessTile selectedTile;
    private ArrayList<String> selectedTileMoves;
    private ArrayList<chessTile> allPossibleMoves;
    JPanel jPanel;

    public void setBoardUp() {

        int x = 0;
        int y = 0;

        while (y < 8) {

            while (x < 8) {
                chessTile temp = new chessTile();
                temp.addActionListener(this);
                add(temp);
                //temp.setVisible(true);

                temp.setXValue(x);
                temp.setYValue(y);

                arrayBoard[y][x] = temp;

                x = x + 1;
            }
            x = 0;
            y = y + 1;
        }

        addPawns();
        addRooks();
        addKnights();
        addBishops();
        addQueen();
        addKing();

    }

    public void addPawns() {
        int counter = 0;
        while (counter < 8) {
            chessTile temp = arrayBoard[1][counter];
            temp.setChessPiece(new chessPawn("Black"));
            temp.setText(temp.getChessPiece().getShortName());
            counter = counter + 1;
        }
        
        counter = 0;
        while (counter < 8) {
            chessTile temp = arrayBoard[6][counter];
            temp.setChessPiece(new chessPawn("White"));
            temp.setText(temp.getChessPiece().getShortName());
            counter = counter + 1;
        }
        
        
    }

    public void addRooks() {
        chessTile temp = arrayBoard[0][0];
        temp.setChessPiece(new chessRook("Black"));
        temp.setText(temp.getChessPiece().getShortName());

        temp = arrayBoard[0][7];
        temp.setChessPiece(new chessRook("Black"));
        temp.setText(temp.getChessPiece().getShortName());
        
        temp = arrayBoard[7][7];
        temp.setChessPiece(new chessRook("White"));
        temp.setText(temp.getChessPiece().getShortName());
        
        temp = arrayBoard[7][0];
        temp.setChessPiece(new chessRook("White"));
        temp.setText(temp.getChessPiece().getShortName());
    }

    public void addKnights() {
        chessTile temp = arrayBoard[0][1];
        temp.setChessPiece(new chessKnight("Black"));
        temp.setText(temp.getChessPiece().getShortName());

        temp = arrayBoard[0][6];
        temp.setChessPiece(new chessKnight("Black"));
        temp.setText(temp.getChessPiece().getShortName());
        
        temp = arrayBoard[7][1];
        temp.setChessPiece(new chessKnight("White"));
        temp.setText(temp.getChessPiece().getShortName());
        
        temp = arrayBoard[7][6];
        temp.setChessPiece(new chessKnight("White"));
        temp.setText(temp.getChessPiece().getShortName());
    }

    public void addBishops() {
        chessTile temp = arrayBoard[0][2];
        temp.setChessPiece(new chessBishop("Black"));
        temp.setText(temp.getChessPiece().getShortName());

        temp = arrayBoard[0][5];
        temp.setChessPiece(new chessBishop("Black"));
        temp.setText(temp.getChessPiece().getShortName());
        
        temp = arrayBoard[7][2];
        temp.setChessPiece(new chessBishop("White"));
        temp.setText(temp.getChessPiece().getShortName());

        temp = arrayBoard[7][5];
        temp.setChessPiece(new chessBishop("White"));
        temp.setText(temp.getChessPiece().getShortName());
    }

    public void addQueen() {
        chessTile temp = arrayBoard[0][3];
        temp.setChessPiece(new chessQueen("Black"));
        temp.setText(temp.getChessPiece().getShortName());
        
        temp = arrayBoard[7][3];
        temp.setChessPiece(new chessQueen("White"));
        temp.setText(temp.getChessPiece().getShortName());
    }

    public void addKing() {
        chessTile temp = arrayBoard[0][4];
        temp.setChessPiece(new chessKing("Black"));
        temp.setText(temp.getChessPiece().getShortName());
        
         temp = arrayBoard[7][4];
        temp.setChessPiece(new chessKing("White"));
        temp.setText(temp.getChessPiece().getShortName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 765, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(chessBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(chessBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(chessBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chessBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chessBoard().setVisible(true);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        chessTile temp = (chessTile) e.getSource();
        
        if(allPossibleMoves.contains(temp)){
            chessPieces movingPiece = selectedTile.getChessPiece();
            selectedTile.setChessPiece(null);
            selectedTile.setHasPiece(false);
            selectedTile.setBackground(new Color(240,240,240));
            selectedTile.setText("");
            
            temp.setChessPiece(movingPiece);
            temp.setText(movingPiece.getShortName());
            temp.setBackground(new Color(240,240,240));
            clearAllOtherMoves();
            allPossibleMoves.clear();
        } else {

        if (temp.getHasPiece()) {
            if (selected) {
                selectedTile.setBackground(new Color(240, 240, 240));

                int numberOfPossibleMoves = allPossibleMoves.size();
                int counter = 0;
                while (numberOfPossibleMoves > counter) {
                    allPossibleMoves.get(counter).setBackground(new Color(240, 240, 240));
                    counter = counter + 1;
                }

                allPossibleMoves.clear();
            }

            selected = true;
            selectedTile = temp;
            selectedTile.setBackground(Color.blue);

            checkMoves(selectedTile);
            
            
        }
        }

    }
    
    public void clearAllOtherMoves(){
        int possibleMovesSize = allPossibleMoves.size();
        int counter  = 0;
        while(counter < possibleMovesSize){
            chessTile temp = allPossibleMoves.get(counter);
            temp.setBackground(new Color (240,240,240));
            counter = counter + 1;
        }
    }

    public void checkMoves(chessTile tile) {
        int numberOfMoves = tile.getChessPiece().getMoves().size();
        selectedTileMoves = tile.getChessPiece().getMoves();

        int counter = 0;
        while (numberOfMoves > counter) {

            chessTile possibleMove;

            if (selectedTileMoves.get(counter).equals("F+1")) {
                if (tile.getYValue() + 1 < 8) {
                    possibleMove = arrayBoard[tile.getYValue() + 1][tile.getXValue()];
                    if (!possibleMove.getHasPiece()) {
                        allPossibleMoves.add(possibleMove);
                        possibleMove.setBackground(Color.green);
                    }
                }
            }

            if (selectedTileMoves.get(counter).equals("B+1")) {
                if (tile.getYValue() - 1 > (-1)) {
                    possibleMove = arrayBoard[tile.getYValue() - 1][tile.getXValue()];
                    if (!possibleMove.getHasPiece()) {
                        allPossibleMoves.add(possibleMove);
                        possibleMove.setBackground(Color.green);
                    }
                }
            }

            if (selectedTileMoves.get(counter).equals("R+1")) {
                if (tile.getXValue() + 1 < 8) {
                    possibleMove = arrayBoard[tile.getYValue()][tile.getXValue() + 1];
                    if (!possibleMove.getHasPiece()) {
                        allPossibleMoves.add(possibleMove);
                        possibleMove.setBackground(Color.green);
                    }
                }
            }

            if (selectedTileMoves.get(counter).equals("L+1")) {
                if (tile.getXValue() - 1 > (-1)) {
                    possibleMove = arrayBoard[tile.getYValue()][tile.getXValue() - 1];
                    if (!possibleMove.getHasPiece()) {
                        allPossibleMoves.add(possibleMove);
                        possibleMove.setBackground(Color.green);
                    }
                }
            }

            if (selectedTileMoves.get(counter).equals("DL+1")) {
                if(tile.getYValue() + 1 < 8 && tile.getXValue() - 1 > (-1)){
                possibleMove = arrayBoard[tile.getYValue() + 1][tile.getXValue() - 1];
                if (!possibleMove.getHasPiece()) {
                    allPossibleMoves.add(possibleMove);
                    possibleMove.setBackground(Color.green);
                }
                }
            }

            if (selectedTileMoves.get(counter).equals("DL-1")) {
                if (tile.getXValue() + 1 < 8 && tile.getYValue() - 1 > (-1)) {
                    possibleMove = arrayBoard[tile.getYValue() - 1][tile.getXValue() + 1];
                    if (!possibleMove.getHasPiece()) {
                        allPossibleMoves.add(possibleMove);
                        possibleMove.setBackground(Color.green);
                    }
                }
            }

            if (selectedTileMoves.get(counter).equals("DR+1")) {
                if (tile.getYValue() + 1 < 8 && tile.getXValue() < 8) {
                    possibleMove = arrayBoard[tile.getYValue() + 1][tile.getXValue() + 1];
                    if (!possibleMove.getHasPiece()) {
                        allPossibleMoves.add(possibleMove);
                        possibleMove.setBackground(Color.green);
                    }
                }
            }

            if (selectedTileMoves.get(counter).equals("DR-1")) {
                if (tile.getYValue() - 1 > (-1) && tile.getXValue() - 1 > (-1)) {
                    possibleMove = arrayBoard[tile.getYValue() - 1][tile.getXValue() - 1];
                    if (!possibleMove.getHasPiece()) {
                        allPossibleMoves.add(possibleMove);
                        possibleMove.setBackground(Color.green);
                    }
                }
            }

            if (selectedTileMoves.get(counter).equals("F++")) {
                int possibleMovesYPosition = tile.getYValue() + 1;

                while (possibleMovesYPosition < 8 && possibleMovesYPosition > -1) {

                    possibleMove = arrayBoard[possibleMovesYPosition][tile.getXValue()];
                    if (possibleMove.getHasPiece()) {
                        break;
                    }

                    allPossibleMoves.add(possibleMove);
                    possibleMove.setBackground(Color.green);

                    possibleMovesYPosition = possibleMovesYPosition + 1;
                }
            }

            if (selectedTileMoves.get(counter).equals("B++")) {
                int possibleMovesYPosition = tile.getYValue() - 1;

                while (possibleMovesYPosition < 8 && possibleMovesYPosition > -1) {
                    possibleMove = arrayBoard[possibleMovesYPosition][tile.getXValue()];

                    if (possibleMove.getHasPiece()) {
                        break;
                    }

                    allPossibleMoves.add(possibleMove);
                    possibleMove.setBackground(Color.green);

                    possibleMovesYPosition = possibleMovesYPosition - 1;
                }
            }

            if (selectedTileMoves.get(counter).equals("R++")) {
                int possibleMovesXPosition = tile.getXValue() + 1;

                while (possibleMovesXPosition < 8 && possibleMovesXPosition > -1) {
                    possibleMove = arrayBoard[tile.getYValue()][possibleMovesXPosition];

                    if (possibleMove.getHasPiece()) {
                        break;
                    }

                    allPossibleMoves.add(possibleMove);
                    possibleMove.setBackground(Color.green);

                    possibleMovesXPosition = possibleMovesXPosition + 1;
                }
            }

            if (selectedTileMoves.get(counter).equals("L++")) {
                int possibleMovesXPosition = tile.getXValue() - 1;

                while (possibleMovesXPosition < 8 && possibleMovesXPosition > -1) {

                    possibleMove = arrayBoard[tile.getYValue()][possibleMovesXPosition];

                    if (possibleMove.getHasPiece()) {
                        break;
                    }

                    allPossibleMoves.add(possibleMove);
                    possibleMove.setBackground(Color.green);

                    possibleMovesXPosition = possibleMovesXPosition - 1;
                }

            }

            if (selectedTileMoves.get(counter).equals("F+2K")) {

                if ((tile.getYValue() + 2) < 8) {

                    if (tile.getXValue() + 1 < 8) {
                        possibleMove = arrayBoard[tile.getYValue() + 2][tile.getXValue() + 1];

                        if (!possibleMove.getHasPiece()) {
                            allPossibleMoves.add(possibleMove);
                            possibleMove.setBackground(Color.green);
                        }
                    }
                    if (tile.getXValue() - 1 > (-1)) {
                        possibleMove = arrayBoard[tile.getYValue() + 2][tile.getXValue() - 1];

                        if (!possibleMove.getHasPiece()) {
                            allPossibleMoves.add(possibleMove);
                            possibleMove.setBackground(Color.green);
                        }
                    }

                }
            }

            if (selectedTileMoves.get(counter).equals("B+2K")) {

                if ((tile.getYValue() - 2) > (-1)) {

                    if (tile.getXValue() + 1 < 8) {
                        possibleMove = arrayBoard[tile.getYValue() - 2][tile.getXValue() + 1];

                        if (!possibleMove.getHasPiece()) {
                            allPossibleMoves.add(possibleMove);
                            possibleMove.setBackground(Color.green);
                        }
                    }
                    if (tile.getXValue() - 1 > (-1)) {
                        possibleMove = arrayBoard[tile.getYValue() - 2][tile.getXValue() - 1];

                        if (!possibleMove.getHasPiece()) {
                            allPossibleMoves.add(possibleMove);
                            possibleMove.setBackground(Color.green);
                        }
                    }

                }
            }

            if (selectedTileMoves.get(counter).equals("L+2K")) {

                if ((tile.getXValue() - 2) > (-1)) {

                    if (tile.getYValue() + 1 < 8) {
                        possibleMove = arrayBoard[tile.getYValue() + 1][tile.getXValue() - 2];

                        if (!possibleMove.getHasPiece()) {
                            allPossibleMoves.add(possibleMove);
                            possibleMove.setBackground(Color.green);
                        }
                    }
                    if (tile.getYValue() - 1 > (-1)) {
                        possibleMove = arrayBoard[tile.getYValue() - 1][tile.getXValue() - 2];

                        if (!possibleMove.getHasPiece()) {
                            allPossibleMoves.add(possibleMove);
                            possibleMove.setBackground(Color.green);
                        }
                    }

                }
            }

            if (selectedTileMoves.get(counter).equals("R+2K")) {

                if ((tile.getXValue() + 2) < 8) {

                    if (tile.getYValue() + 1 < 8) {
                        possibleMove = arrayBoard[tile.getYValue() + 1][tile.getXValue() + 2];

                        if (!possibleMove.getHasPiece()) {
                            allPossibleMoves.add(possibleMove);
                            possibleMove.setBackground(Color.green);
                        }
                    }
                    if (tile.getYValue() - 1 > (-1)) {
                        possibleMove = arrayBoard[tile.getYValue() - 1][tile.getXValue() + 2];

                        if (!possibleMove.getHasPiece()) {
                            allPossibleMoves.add(possibleMove);
                            possibleMove.setBackground(Color.green);
                        }
                    }

                }
            }

            if (selectedTileMoves.get(counter).equals("DL++")) {
                int possibleMovesXPosition = tile.getXValue() + 1;
                int possibleMovesYPosition = tile.getYValue() + 1;

                while (possibleMovesXPosition < 8 && possibleMovesYPosition < 8) {

                    possibleMove = arrayBoard[possibleMovesYPosition][possibleMovesXPosition];

                    if (possibleMove.getHasPiece()) {
                        break;
                    }

                    allPossibleMoves.add(possibleMove);
                    possibleMove.setBackground(Color.green);

                    possibleMovesXPosition = possibleMovesXPosition + 1;
                    possibleMovesYPosition = possibleMovesYPosition + 1;
                }

            }

            if (selectedTileMoves.get(counter).equals("DL--")) {
                int possibleMovesXPosition = tile.getXValue() - 1;
                int possibleMovesYPosition = tile.getYValue() - 1;

                while (possibleMovesXPosition > (-1) && possibleMovesYPosition > (-1)) {

                    possibleMove = arrayBoard[possibleMovesYPosition][possibleMovesXPosition];

                    if (possibleMove.getHasPiece()) {
                        break;
                    }

                    allPossibleMoves.add(possibleMove);
                    possibleMove.setBackground(Color.green);

                    possibleMovesXPosition = possibleMovesXPosition - 1;
                    possibleMovesYPosition = possibleMovesYPosition - 1;
                }
            }

            if (selectedTileMoves.get(counter).equals("DR--")) {
                int possibleMovesXPosition = tile.getXValue() + 1;
                int possibleMovesYPosition = tile.getYValue() - 1;

                while (possibleMovesXPosition < 8 && possibleMovesYPosition > (-1)) {

                    possibleMove = arrayBoard[possibleMovesYPosition][possibleMovesXPosition];

                    if (possibleMove.getHasPiece()) {
                        break;
                    }

                    allPossibleMoves.add(possibleMove);
                    possibleMove.setBackground(Color.green);

                    possibleMovesXPosition = possibleMovesXPosition + 1;
                    possibleMovesYPosition = possibleMovesYPosition - 1;
                }
            }

            if (selectedTileMoves.get(counter).equals("DR++")) {
                int possibleMovesXPosition = tile.getXValue() - 1;
                int possibleMovesYPosition = tile.getYValue() + 1;

                while (possibleMovesYPosition < 8 && possibleMovesXPosition > (-1)) {

                    possibleMove = arrayBoard[possibleMovesYPosition][possibleMovesXPosition];

                    if (possibleMove.getHasPiece()) {
                        break;
                    }

                    allPossibleMoves.add(possibleMove);
                    possibleMove.setBackground(Color.green);

                    possibleMovesXPosition = possibleMovesXPosition - 1;
                    possibleMovesYPosition = possibleMovesYPosition + 1;
                }
            }

            counter = counter + 1;

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
