package baseball.utils;

import baseball.ErrorMessage;

public class StringUtil {

    public static boolean isNullOrEmpty(String input) { return (input.isEmpty() || input == null); }
    public static void validateNullAndEmpty(boolean isNullOrEmpty){
        if(isNullOrEmpty) throw new IllegalArgumentException(ErrorMessage.ERROR_NULL_AND_EMPTY.getErrorMessage());
    }
}
