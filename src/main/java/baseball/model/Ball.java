package baseball.model;

import baseball.BallStatus;
import baseball.ErrorMessage;

import java.util.*;

public class Ball {

    private final BallPosition ballPosition;
    private final BallNumber ballNumber;

    public Ball(int ballPosition, int ballNumber) {
        this.ballNumber = new BallNumber(ballNumber);
        this.ballPosition = new BallPosition(ballPosition);
    }



}
