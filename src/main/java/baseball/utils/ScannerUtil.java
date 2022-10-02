package baseball.utils;


import static baseball.utils.StringUtil.*;

import camp.nextstep.edu.missionutils.Console;

public class ScannerUtil {

    public static String readLine() {
        String stringInput = Console.readLine();
        validateNullAndEmpty(isNullOrEmpty(stringInput));
        return stringInput;
    }

    public static int readInt() {
        String stringInput = Console.readLine();
        validateNullAndEmpty(isNullOrEmpty(stringInput));
        return Integer.parseInt(stringInput);
    }
}
