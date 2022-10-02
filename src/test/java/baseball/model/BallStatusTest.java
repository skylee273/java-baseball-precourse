package baseball.model;

import baseball.BallStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallStatusTest {

    @DisplayName("숫자야구 상태 확인")
    @Test
    void createBallStatusMapTest() {
        assertThat(BallStatus.createBallStatusMap().size()).isEqualTo(3);
        assertThat(BallStatus.createBallStatusMap().get(BallStatus.STRIKE)).isEqualTo(0);
        assertThat(BallStatus.createBallStatusMap().get(BallStatus.BALL)).isEqualTo(0);
        assertThat(BallStatus.createBallStatusMap().get(BallStatus.NOTHING)).isEqualTo(0);
    }
}
