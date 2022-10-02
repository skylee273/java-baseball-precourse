package baseball.view;

import baseball.utils.ScannerUtil;
import baseball.utils.StringUtil;
import java.util.*;
import static baseball.GameMessage.*;

public class InputView {
    String inputNumber;
    private static final String DELIMITER = "";

    public InputView(String inputNumber) {
        this.inputNumber = inputNumber;
    }

    public static List<Integer> getManualBalls() {
        printMessage(BASEBALL_GAME_START_INPUT);
        return splitBaseBallNumber(ScannerUtil.readLine());
    }

    public static int getReStartManualBalls() {
        return StringUtil.convertStringToInteger(ScannerUtil.readLine());
    }

    private static List<Integer> splitBaseBallNumber(String input) {
        List<Integer> balls = new ArrayList<>();
        for(String number : input.split(DELIMITER)){
            balls.add(StringUtil.convertStringToInteger(number));
        }
        return balls;
    }

    private static void printMessage(String message) {
        System.out.println(message + "");
    }

}
