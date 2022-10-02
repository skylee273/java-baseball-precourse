package baseball.controller;

import baseball.model.BallScore;
import baseball.model.Balls;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseBallGame {

    private static final int NEW_GAME = 1;
    private static final int QUIT = 2;
    private static final int STRIKE_OUT = 3;

    public static Balls ready() {
        return new Balls(new RandomNumberGenerator().generateRandomNumberList());
    }

    public static void start(Balls computer) {
        Balls user = new Balls(InputView.getManualBalls());
        BallScore ballScore = user.compareBetweenBalls(computer);
        if (!getIsWinning(ballScore)) {
            OutputView.printLossMessage(ballScore.toString());
            start(computer);
            return;
        }
        OutputView.printWinningMessage(ballScore.toString());

    }

    private static boolean getIsWinning(BallScore ballScore) {
        return ballScore.getStrikeScore() == STRIKE_OUT;
    }

    public static boolean isNewGame() {
        int reStartManualBalls = InputView.getReStartManualBalls();
        if (reStartManualBalls != NEW_GAME && reStartManualBalls != QUIT) {
            throw new IllegalArgumentException();
        }
        if (reStartManualBalls == QUIT) OutputView.printQuitMessage();
        return reStartManualBalls == NEW_GAME;

    }


}
