package baseball.view;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class BaseBallViewInputTest {

    @DisplayName("Null 또는 빈값 넣을 시 IllegalArgumentException 발생 하는지 테스트")
    @ParameterizedTest
    @NullAndEmptySource
    void validateNullOrEmptyTest(String inputNumber){
        assertThatIllegalArgumentException().isThrownBy( () -> {
            new BaseBallGameInputView(inputNumber);
        });

    }
}
