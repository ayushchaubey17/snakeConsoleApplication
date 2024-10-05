package com.snake.model;

import com.snake.dto.Position;
import com.snake.modelView.ModelViewScreeen;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ModelScreen {

    private static ModelViewScreeen modelViewScreeen = new ModelViewScreeen();
    public static char[][] board = new char[5][5];
    static  int row =0;
    static  int col =0;
    Queue<Position> snake = new LinkedList<>();

    public ModelScreen() {
        for (char [] el:board ) {
            Arrays.fill(el,'0');
        }
        board[0][0] = '.';

        snake.offer(new Position(0, 0));
        initializeTheFoods();
    }

    private void initializeTheFoods() {
        board[3][0] = 'X';
        board[2][4] = 'X';
        board[4][1] = 'X';

    }




    public void newMove(char c) {
        if(c=='R')col++;
        else if(c=='L')col--;
        else if(c=='U')row--;
        else if(c=='D')row++;

        checkForThis();

    }

    private void checkForThis() {
        if (row >= 0 && row < 5 && col >= 0 && col < 5) {
            if (board[row][col]=='.'){
                System.out.println("game over");
                System.exit(0);
            }
            else if (board[row][col] != 'X') {

              Position position = snake.poll();
              int r = position.getRow();
              int c = position.getCol();
              board[r][c]='0';
            }
            snake.add(new Position(row, col));
            board[row][col] = '.';
                modelViewScreeen.printArea();
        }
        else {
            System.out.println("game over");
            System.exit(0);
        }
    }
}
