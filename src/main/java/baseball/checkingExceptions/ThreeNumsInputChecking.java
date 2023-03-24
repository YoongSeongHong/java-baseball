package baseball.checkingExceptions;

public class ThreeNumsInputChecking {
    public String check2(String s) throws IllegalArgumentException{
        if(isInputNumThreeLengthAndIntegers(s)) {
            throw new IllegalArgumentException();
        }
        return s;
    }

    private static boolean isInputNumThreeLengthAndIntegers(String s) {
        return s.length() != 3 || ((int) s.charAt(0) - '0' >= 10 || (int) s.charAt(0) - '0' < 0) || ((int) s.charAt(1) - '0' >= 10 || (int) s.charAt(1) - '0' < 0) || ((int) s.charAt(2) - '0' >= 10 || (int) s.charAt(2) - '0' < 0);
    }
}
