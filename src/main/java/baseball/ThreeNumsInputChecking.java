package baseball;

public class ThreeNumsInputChecking {
    public static String check1(String s) throws IllegalArgumentException{
        if(inputNumWell(s)) {
            throw new IllegalArgumentException();
        }
        return s;
    }

    private static boolean inputNumWell(String s) {
        return s.length() != 3 || ((int) s.charAt(0) - '0' >= 10 || (int) s.charAt(0) - '0' < 0) || ((int) s.charAt(1) - '0' >= 10 || (int) s.charAt(1) - '0' < 0) || ((int) s.charAt(2) - '0' >= 10 || (int) s.charAt(2) - '0' < 0);
    }
}
