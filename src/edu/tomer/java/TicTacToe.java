package edu.tomer.java;

/**
 * Created by Android2017 on 27/01/2017.
 */
public class TicTacToe {

    static int[] getPositionInBoard(String[][] board){
        int row;
        int column;

        do {
            row = IO.getInt("Choose row:", 0, 2);
            column = IO.getInt("Choose column:", 0, 2);
        }
        while ( board[row][column].length() > 0);

        int[] arr = {row, column};
        return arr;
    }
}
