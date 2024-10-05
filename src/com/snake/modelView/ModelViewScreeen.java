package com.snake.modelView;

import com.snake.model.ModelScreen;
import com.snake.view.ScreenView;

public class ModelViewScreeen {
    private static ModelScreen modelScreen = new ModelScreen();
    private static ScreenView screenView = new ScreenView();

    public void startTheApp() {
        screenView.printTheArea();

        boolean flag = true;


        while (flag) {
            char c = screenView.takeTheInput();
            modelScreen.newMove(c);
        }



    }


    long fibRec(int n) {
        return (n<=1)?n: fibRec(n-1)+fibRec(n-2);
    }


    public void printArea() {
        screenView.printTheArea();
    }

}
