package baseball.model;

import baseball.BallStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class BallsTest {

    @DisplayName("숫자 야구 번호 객체가 3개보다 적으면 예외 발생")
    @Test
    void throwExceptionWhenNotThreeBallNumbers() {
        assertThatIllegalArgumentException().isThrownBy(() -> {
            new Balls(Arrays.asList(1,2));
        });
    }

    @DisplayName("숫자 야구 번호 객체가 3개보다 많으면 예외 발생")
    @Test
    void throwExceptionWhenNotThreeBallNumbers2() {
        assertThatIllegalArgumentException().isThrownBy(() -> {
            new Balls(Arrays.asList(1,2,3,4));
        });
    }

    @DisplayName("숫자 야구 번호 3개 정상 숫자 야구 객체 발생")
    @Test
    void createTest(){
        assertThatCode(() -> new Balls(Arrays.asList(1,2,3))).doesNotThrowAnyException();
    }

    @DisplayName("중복된 숫자가 있으면 예외 발생")
    @Test
    void throwExceptionWhenDuplication() {
        assertThatIllegalArgumentException().isThrownBy(() -> {
            new Balls(Arrays.asList(1,1,2));
        });
    }

    @Test
    void compareBallsTest() {
        Balls computer = new Balls(Arrays.asList(1, 2, 3));
        assertThat(computer.compareBallsAndBall(new Ball(0, 1))).isEqualTo(BallStatus.STRIKE);
        assertThat(computer.compareBallsAndBall(new Ball(2, 1))).isEqualTo(BallStatus.BALL);
        assertThat(computer.compareBallsAndBall(new Ball(0, 4))).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    void compareBetweenBallsTest() {
        Balls computer = new Balls(Arrays.asList(1, 3, 5));
        assertThat(computer.compareBetweenBalls(new Balls(Arrays.asList(2, 4, 6))).toString()).isEqualTo("낫싱");
        assertThat(computer.compareBetweenBalls(new Balls(Arrays.asList(1, 3, 5))).toString()).isEqualTo("3스트라이크");
        assertThat(computer.compareBetweenBalls(new Balls(Arrays.asList(2, 5, 6))).toString()).isEqualTo("1볼");
        assertThat(computer.compareBetweenBalls(new Balls(Arrays.asList(2, 1, 3))).toString()).isEqualTo("2볼");
        assertThat(computer.compareBetweenBalls(new Balls(Arrays.asList(1, 2, 3))).toString()).isEqualTo("1볼 1스트라이크");
    }


}
