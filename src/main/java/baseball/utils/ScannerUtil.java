package baseball.utils;

import java.util.Scanner;

import static baseball.utils.StringUtil.*;

public class ScannerUtil {
    private static final Scanner scanner = new Scanner(System.in);

    public static int readInt() {
        String stringInput = scanner.nextLine();
        validateNullAndEmpty(isNullOrEmpty(stringInput));
        return Integer.parseInt(stringInput);
    }
}
