package baseball.model;

import baseball.BallStatus;
import baseball.utils.StringUtil;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class BallTest {

    @DisplayName("정상 숫자 야구 객체 생성")
    @Test
    void createTest() {
        assertThatCode(() -> new Ball(0, 1)).doesNotThrowAnyException();
    }

    @DisplayName("볼, 스트라이크, 낫싱 비교 테스트")
    @Test
    void compareTest() {
        Ball computer = new Ball(0, 1);
        assertThat(computer.compare(new Ball(1, 1))).isEqualTo(BallStatus.BALL);
        assertThat(computer.compare(new Ball(0, 1))).isEqualTo(BallStatus.STRIKE);
        assertThat(computer.compare(new Ball(0, 2))).isEqualTo(BallStatus.NOTHING);
    }


}
