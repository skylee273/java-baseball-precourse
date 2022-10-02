package baseball;

public enum ErrorMessage {
    ERROR_NOT_NUMBER_IN_RANGE(100, "숫자 야구 게임의 번호는 1이상 9이하의 숫자만 가능합니다."),
    ERROR_NULL_AND_EMPTY(200, "공백 또는 빈문자열은 입력할 수 없습니다."),
    ERROR_INTEGER_FORMAT(300, "숫자만 입력 가능합니다."),
    ERROR_BALL_SIZE(400, "숫자 야구의 번호는 총 3개의 숫자로 구성되어야 합니다.");
    private final int errorCode;
    private final String errorMessage;

    ErrorMessage(int errorCode, String errorMessage){
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public int getErrorCode() { return errorCode; }
    public String getErrorMessage(){
        return errorMessage;
    }


}
