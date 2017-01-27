package edu.tomer.java;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String[][] board = {{"", "", ""}, {"", "", ""}, {"", "", ""}};
        IO.printBoard(board);

        String turn = "X";//IO.getString("Pick turn: O or X");

        int[] pos = TicTacToe.getPositionInBoard(board);
        int row = pos[0];
        int column = pos[1];



    }




}
