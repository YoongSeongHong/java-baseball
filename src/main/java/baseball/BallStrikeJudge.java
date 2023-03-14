package baseball;

import java.util.List;

public class BallStrikeJudge {


    public static void ballOrStrike(String str, List<Integer> computer, int strike, int ball, int flag){
        if(str.charAt(0) == (char)(computer.get(0) + '0')){
            strike += 1;
        }else if(computer.contains(Character.getNumericValue(str.charAt(0)))){
            ball += 1;
        }
        if(str.charAt(1) == (char)(computer.get(1) + '0')){
            strike += 1;
        }else if(computer.contains(Character.getNumericValue(str.charAt(1)))){
            ball += 1;
        }
        if(str.charAt(2) == (char)(computer.get(2) + '0')){
            strike += 1;
        }else if(computer.contains(Character.getNumericValue(str.charAt(2)))){
            ball += 1;
        }
        PrintingResult.printResult(strike, ball, flag);
    }
}
