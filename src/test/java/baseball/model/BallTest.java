package baseball.model;

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

    private List<BallNumber> ballNumbers = new ArrayList<>();

    @DisplayName("숫자 야구 번호 객체가 3개보다 적으면 예외 발생")
    @Test
    void throwExceptionWhenNotThreeBallNumbers() {
        for(int i = 1; i <=2; i++){
            ballNumbers.add(new BallNumber(i));
        }
        assertThatIllegalArgumentException().isThrownBy(() -> {
           new Ball(ballNumbers) ;
        });
    }

    @DisplayName("숫자 야구 번호가 객체가 3개보다 맣으면 예외 발생")
    @Test
    void throwExceptionWhenNotThreeBallNumbers2(){
        for(int i = 1; i <=4; i++){
            ballNumbers.add(new BallNumber(i));
        }
        assertThatIllegalArgumentException().isThrownBy(() -> {
            new Ball(ballNumbers);
        });
    }

    @DisplayName("숫자 야구 번호 3개 정상 숫자 야구 객체 발생")
    @Test
    void createTest(){
        for(int i = 1; i <=3; i++){
            ballNumbers.add(new BallNumber(i));
        }
        assertThatCode(() -> new Ball(ballNumbers)).doesNotThrowAnyException();
    }

    @DisplayName("숫자가 아닌 값이 입력되면 예외 반환")
    @ParameterizedTest
    @ValueSource( strings = {"@", "Money", "!!"})
    void validateNonNumberTest(String input){
        assertThatIllegalArgumentException().isThrownBy(() -> {
            StringUtil.validateIntegerType(input);
        });
    }

    @DisplayName("중복된 숫자가 있으면 예외 발생")
    @Test
    void throwExceptionWhenDuplication() {
        for (int i = 1; i <= 3; i++) {
            ballNumbers.add(new BallNumber(1));
        }
        assertThatIllegalArgumentException().isThrownBy(() -> {
            new Ball(ballNumbers);
        });
    }


}
