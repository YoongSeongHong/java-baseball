package baseball.checkingExceptions;

public class ExceptionChecking {
    public String check1(String s) throws IllegalArgumentException{
        if(whetherInputOneOrTwo(s)){
            throw new IllegalArgumentException("1이나 2가 입력되지 않았습니다.");
        }
        return s;
    }

    private boolean whetherInputOneOrTwo(String s) {
        return !s.equals("1") && !s.equals("2");
    }

    public String check2(String s) throws IllegalArgumentException{
        if(isInputNumThreeLengthAndIntegers(s)) {
            throw new IllegalArgumentException("세 개의 연속된 한 자리 수가 입력되지 않았습니다.");
        }
        return s;
    }

    private boolean isInputNumThreeLengthAndIntegers(String s) {
        return s.length() != 3 || ((int) s.charAt(0) - '0' >= 10 || (int) s.charAt(0) - '0' < 0) || ((int) s.charAt(1) - '0' >= 10 || (int) s.charAt(1) - '0' < 0) || ((int) s.charAt(2) - '0' >= 10 || (int) s.charAt(2) - '0' < 0);
    }
}
