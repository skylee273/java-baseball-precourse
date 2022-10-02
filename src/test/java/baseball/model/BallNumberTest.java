package baseball.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class BallNumberTest {

    @DisplayName("1~9 범위 안의 숫자가 입력되면 정상적으로 객체 생성")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 9})
    void createTest(int input) {
        assertThatCode(() -> new BallNumber(input)).doesNotThrowAnyException();
    }

    @DisplayName("1~9 범위 밖의 숫자가 입력되면 예외")
    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 15})
    void throwExceptionWhenOutOfRangeFrom1To9(int input) {
        assertThatIllegalArgumentException().isThrownBy(() -> {
            new BallNumber(input);
        });
    }
}
