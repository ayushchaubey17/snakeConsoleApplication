package com.snake.view;


import java.util.Scanner;
import  static com.snake.model.ModelScreen.board;

public class ScreenView {
    private static Scanner scanner = new Scanner(System.in);

    public char takeTheInput() {
        System.out.println("enter your move----L,R,U,D ");
        char c = scanner.next().charAt(0);
        return c;
    }


    public void printTheArea(){
        for(char [] el:board){
            for (char ele: el) System.out.print(ele+" ");
            System.out.println();
        }
    }

}
