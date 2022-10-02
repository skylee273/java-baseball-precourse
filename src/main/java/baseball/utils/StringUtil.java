package baseball.utils;

import baseball.ErrorMessage;

public class StringUtil {

    public static boolean isNullOrEmpty(String input) { return (input.isEmpty() || input == null); }

    public static void validateNullAndEmpty(boolean isNullOrEmpty){
        if(isNullOrEmpty) throw new IllegalArgumentException(ErrorMessage.ERROR_NULL_AND_EMPTY.getErrorMessage());
    }

    public static void validateIntegerType(String input) {
        try{
            Integer.parseInt(input);
        }catch (NumberFormatException e){
            throw new IllegalArgumentException(ErrorMessage.ERROR_INTEGER_FORMAT.getErrorMessage());
        }
    }

    public static int convertStringToInteger(String input) {
        validateIntegerType(input);
        return Integer.parseInt(input);
    }
}
