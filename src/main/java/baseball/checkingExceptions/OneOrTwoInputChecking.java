package baseball.checkingExceptions;

public class OneOrTwoInputChecking {
    public String check1(String s) throws IllegalArgumentException{
        if(whetherInputOneOrTwo(s)){
            throw new IllegalArgumentException();
        }
        return s;
    }

    private static boolean whetherInputOneOrTwo(String s) {
        return !s.equals("1") && !s.equals("2");
    }
}
