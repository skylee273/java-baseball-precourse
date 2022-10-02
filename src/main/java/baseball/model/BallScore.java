package baseball.model;

import baseball.BallStatus;

import java.util.Map;

public class BallScore {
    private final Map<BallStatus, Integer> ballStatusMap = BallStatus.createBallStatusMap();

    public void setScore(BallStatus ballStatus) {
        ballStatusMap.put(ballStatus, ballStatusMap.get(ballStatus) + 1);
    }

    public int getStrikeScore() {
        return ballStatusMap.get(BallStatus.STRIKE);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (hasBall()) {
            sb.append(ballStatusMap.get(BallStatus.BALL));
            sb.append("볼 ");
        }
        if (hasStrike()) {
            sb.append(ballStatusMap.get(BallStatus.STRIKE));
            sb.append("스트라이크 ");
        }
        if (sb.length() <= 0)
            sb.append("낫싱");

        return sb.toString().trim();
    }

    private boolean hasBall() {
        return ballStatusMap.get(BallStatus.BALL) > 0;
    }

    private boolean hasStrike() {
        return ballStatusMap.get(BallStatus.STRIKE) > 0;
    }

}
