package baseball.model;

import baseball.BallStatus;
import baseball.ErrorMessage;
import baseball.controller.AutoBallGenerator;

import java.util.*;

public class Balls {
    private static final int BALL_SIZE = 3;
    private final List<Ball> balls;

    public Balls(List<Integer> balls) {
        validateBallSize(balls);
        validateDuplication(balls);
        this.balls = createBalls(balls);
    }

    public static List<Ball> createBalls(List<Integer> balls) {
        return generateAutoBalls(balls);
    }

    private static List<Ball> generateAutoBalls(List<Integer> balls) {
        return AutoBallGenerator.generate(balls);
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

    public BallStatus compareBallsAndBall(Ball otherBall) {
        for (Ball ball : balls) {
            BallStatus compareStatus = ball.compare(otherBall);
            if(compareStatus.isStrike()) return BallStatus.STRIKE;
            if(compareStatus.isBall()) return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }

    public BallScore compareBetweenBalls(Balls otherBalls) {
        BallScore ballScore = new BallScore();
        for (Ball otherBall : otherBalls.balls) {
            ballScore.setScore(this.compareBallsAndBall(otherBall));
        }
        return ballScore;
    }

}
