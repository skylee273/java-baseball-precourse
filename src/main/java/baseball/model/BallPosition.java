package baseball.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BallPosition {

    private int ballPosition;

    public BallPosition(int ballPosition) {
        this.ballPosition = ballPosition;
    }

    public int getBallPosition() {
        return ballPosition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BallPosition that = (BallPosition) o;
        return ballPosition == that.ballPosition;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ballPosition);
    }

    @Override
    public String toString() {
        return String.valueOf(ballPosition);
    }

}
