package baseball;

import java.util.List;

public class BallStrikeJudge {


    public ScoreBoard ballOrStrike(String str, List<Integer> computer, int flag){
        ScoreBoard scoreBoard = new ScoreBoard(0, 0);

        if(str.charAt(0) == (char)(computer.get(0) + '0')){
            scoreBoard.addStrike();
        }else if(computer.contains(Character.getNumericValue(str.charAt(0)))){
            scoreBoard.addBall();
        }
        if(str.charAt(1) == (char)(computer.get(1) + '0')){
            scoreBoard.addStrike();
        }else if(computer.contains(Character.getNumericValue(str.charAt(1)))){
            scoreBoard.addBall();
        }
        if(str.charAt(2) == (char)(computer.get(2) + '0')){
            scoreBoard.addStrike();
        }else if(computer.contains(Character.getNumericValue(str.charAt(2)))){
            scoreBoard.addBall();
        }

        return scoreBoard;
    }
}
