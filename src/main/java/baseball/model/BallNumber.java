package baseball.model;

import baseball.ErrorMessage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BallNumber {
    private static final int MIN_BALL_NUMBER = 1;
    private static final int MAX_BALL_NUMBER = 9;

    private static final List<Integer> ballStore = new ArrayList<>();

    static {
        for (int i = MIN_BALL_NUMBER; i <= MAX_BALL_NUMBER; ++i) {
            ballStore.add(i);
        }
    }

    private int ballNumber;

    public BallNumber(int ballNumber) {
        validateBallNumber(ballNumber);
        this.ballNumber = ballNumber;
    }

    private void validateBallNumber(int ballNumber) {
        if (!ballStore.contains(ballNumber)) {
            throw new IllegalArgumentException(ErrorMessage.ERROR_NOT_NUMBER_IN_RANGE.getErrorMessage());
        }
    }

    public int getBallNumber() {
        return ballNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BallNumber that = (BallNumber) o;
        return ballNumber == that.ballNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ballNumber);
    }

    @Override
    public String toString() {
        return String.valueOf(ballNumber);
    }
}
