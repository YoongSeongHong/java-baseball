package baseball.gameProgress;

import java.util.List;

public class BallStrikeJudge {
    ScoreBoard scoreBoard = new ScoreBoard(0, 0);

    public ScoreBoard ballOrStrike(String str, List<Integer> computer){
        scoreBoard.resetScoreBoard();

        for(int i = 0; i < 3; i++){
            if(checkIfItIsStrike(str, computer, i)){
                scoreBoard.plusStrike();
            }else if(checkIfItIsBall(str, computer, i)){
                scoreBoard.plusBall();
            }
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
