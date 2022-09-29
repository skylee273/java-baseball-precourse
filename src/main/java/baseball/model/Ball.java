package baseball.model;

import baseball.ErrorMessage;
import baseball.GameMessage;

public class Ball {
    private static final int MIN_BALL_NUMBER = 1;
    private static final int MAX_BALL_NUMBER = 9;
    private  int number;

    public Ball(int number){
        validateBallNumber(isBallNumber(number));
        this.number = number;
    }

    private static boolean isBallNumber(int number){
        return number >= MIN_BALL_NUMBER &&  number <= MAX_BALL_NUMBER;
    }

    private void validateBallNumber(boolean isRangeInNumber){
        if(!isRangeInNumber) throw new IllegalArgumentException(ErrorMessage.ERROR_NOT_NUMBER_IN_RANGE.getErrorMessage());
    }

}
