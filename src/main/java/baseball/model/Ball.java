package baseball.model;

import baseball.ErrorMessage;

import java.util.Collections;
import java.util.List;

public class Ball {

    private static final int BALL_SIZE = 3;

    private List<BallNumber> ballNumbers;

    public Ball(List<BallNumber> ball) {
        validateBallSize(ball);
        this.ballNumbers = Collections.unmodifiableList(ball);
    }


    private void validateBallSize(List<BallNumber> ball){
        if(ball.size() != BALL_SIZE) {
            throw new IllegalArgumentException(ErrorMessage.ERROR_BALL_SIZE.getErrorMessage());
        }
    }

}
