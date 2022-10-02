package baseball.controller;

import baseball.model.BallScore;
import baseball.model.Balls;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseBallGame {

    public static Balls ready() {
        return new Balls(new RandomNumberGenerator().generateRandomNumberList());
    }
    public static void start(Balls computer) {
        Balls user = new Balls(InputView.getManualBalls());
        BallScore ballScore = user.compareBetweenBalls(computer);
        if(!getIsWinning(ballScore)) {
            OutputView.printLossMessage(ballScore.toString());
            start(computer);
            return;
        }
        OutputView.printWinningMessage(ballScore.toString());

    }

    private static boolean getIsWinning(BallScore ballScore) {
        return ballScore.getStrikeScore() == 3;
    }



}
