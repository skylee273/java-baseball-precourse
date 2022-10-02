package baseball.model;

import baseball.utils.StringUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

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
}
