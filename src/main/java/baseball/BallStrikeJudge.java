package baseball;

import java.util.List;

public class BallStrikeJudge {


    public ScoreBoard ballOrStrike(String str, List<Integer> computer){
        ScoreBoard scoreBoard = new ScoreBoard(0, 0);
        int num = 0;

        if(checkIfItIsStrike(str, computer, 0)){
            scoreBoard.addStrike();
        }else if(checkIfItIsBall(str, computer, 0)){
            scoreBoard.addBall();
        }
        if(checkIfItIsStrike(str, computer, 1)){
            scoreBoard.addStrike();
        }else if(checkIfItIsBall(str, computer, 1)){
            scoreBoard.addBall();
        }
        if(checkIfItIsStrike(str, computer, 2)){
            scoreBoard.addStrike();
        }else if(checkIfItIsBall(str, computer ,2)){
            scoreBoard.addBall();
        }

        return scoreBoard;
    }

    private static boolean checkIfItIsBall(String str, List<Integer> computer, int num) {
        return computer.contains(Character.getNumericValue(str.charAt(num)));
    }

    private static boolean checkIfItIsStrike(String str, List<Integer> computer, int num) {
        return str.charAt(num) == (char) (computer.get(num) + '0');
    }
}
