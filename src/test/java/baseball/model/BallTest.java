package baseball.model;

import baseball.utils.StringUtil;
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

    @DisplayName("숫자가 아닌 값을 받았을때 예외 발생")
    @ParameterizedTest
    @ValueSource(strings = {"123", "$", "Ball"})
    void validateInputTypeTest(int input){
        assertThatIllegalArgumentException().isThrownBy(() -> {
           new Ball(input);
        });
    }

    @DisplayName("음수 값을 받으면 예외 발생")
    @ParameterizedTest
    @ValueSource(ints = {-1})
    void validateInputNegativeTest(int input){
        assertThatIllegalArgumentException().isThrownBy(() -> {
            new Ball(input);
        });
    }

    @DisplayName("1~9 이외에 값을 받는지 확인")
   @ParameterizedTest
    @ValueSource(ints = {10, 5, 0})
    void validateRangeNumber(int input){
        assertThatIllegalArgumentException().isThrownBy(() -> {
            new Ball(input);
        });
    }

    @DisplayName("숫자가 아닌 값이 입력되면 예외 반환")
    @ParameterizedTest
    @ValueSource( strings = {"@", "Money", "!!"})
    void validateNonNumberTest(String input){
        assertThatIllegalArgumentException().isThrownBy(() -> {
            StringUtil.validateIntegerType(input);
        });
    }

}
