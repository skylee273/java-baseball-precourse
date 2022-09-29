package baseball.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {

    @DisplayName("볼 생성 테스트")
    @ParameterizedTest
    @ValueSource(ints = {123, 123})
    void createBallTest(int input){
        assertThat(new Ball(input)).isNotEqualTo(new Ball(input));
    }

}
