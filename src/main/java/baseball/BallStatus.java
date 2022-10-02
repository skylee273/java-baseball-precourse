package baseball;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public enum BallStatus {
    BALL, NOTHING, STRIKE;

    public static Map<BallStatus, Integer> createBallStatusMap() {
        Map<BallStatus, Integer> ballStatusIntegerMap =  new HashMap<>();
        ballStatusIntegerMap.put(BALL, 0);
        ballStatusIntegerMap.put(NOTHING, 0);
        ballStatusIntegerMap.put(STRIKE, 0);
        return ballStatusIntegerMap;
    }

    public boolean isStrike() {
        return this == STRIKE;
    }

    public boolean isBall() {
        return this == BALL;
    }
}
