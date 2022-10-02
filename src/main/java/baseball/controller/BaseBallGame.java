package baseball.controller;

import baseball.model.BallScore;
import baseball.model.Balls;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseBallGame {

    public static Balls ready() {
        return new Balls(new RandomNumberGenerator().generateRandomNumberList());
    }

}
