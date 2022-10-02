package baseball.utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

public class StringUtilTest {

    @DisplayName("숫자 이외의 값이 입력되면 예외를 리턴한다")
    @ParameterizedTest
    @ValueSource(strings = {"1,@,3", "10,2,3:=", "%,),2:*"})
    void convertToNumberTest(String input){
        assertThatThrownBy(() -> {
            StringUtil.convertStringToInteger(input);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("음수를 입력하면 예외를 리턴한다.")
    @ParameterizedTest
    @ValueSource(strings = {"1,-1,0", "10,-9", "20,-20,-1"})
    void validateNegativeTest(String input) {
        //when, then
        assertThatThrownBy(() -> {
            StringUtil.validateIntegerType(input);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("null 또는 공백 문자열이 입력되면 예외를 리턴한다.")
    @ParameterizedTest
    @NullAndEmptySource
    void StringTestWhenNullOrEmpty(String input) {
        assertThatThrownBy(() -> {
            StringUtil.validateNullAndEmpty(StringUtil.isNullOrEmpty(input));
        }).isInstanceOf(RuntimeException.class);
    }

}
