package baseball.view;


import baseball.GameMessage;

import static baseball.GameMessage.*;

public class OutputView {

    public static void printQuitMessage() {
        printMessage(BASEBALL_GAME_QUIT_MESSAGE);
    }
    public static void printLossMessage(String lossMessage) {
        printMessage(lossMessage);
    }

    public static void printWinningMessage(String winningMessage) {
        printMessage(winningMessage);
    }

    private static void printMessage(String message) {
        System.out.println(message + "");
    }


}
