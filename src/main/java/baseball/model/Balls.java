package baseball.model;

import baseball.BallStatus;
import baseball.ErrorMessage;
import baseball.controller.AutoBallGenerator;

import java.util.*;

public class Balls {
    private static final int BALL_SIZE = 3;
    private List<Ball> balls;

    public Balls(List<Integer> balls) {
        validateBallSize(balls);
        validateDuplication(balls);
    }

    private void validateBallSize(List<Integer> ball){
        if(ball.size() != BALL_SIZE) {
            throw new IllegalArgumentException(ErrorMessage.ERROR_BALL_SIZE.getErrorMessage());
        }
    }

    private void validateDuplication(List<Integer> ball) {
        Set<Integer> originBall = new HashSet<>(ball);

        if(originBall.size() != BALL_SIZE) {
            throw new IllegalArgumentException(ErrorMessage.ERROR_BALL_NON_DUPLICATION.getErrorMessage());
        }
    }



}
