package baseball.gameProgress;

import baseball.checkingExceptions.OneOrTwoInputChecking;
import baseball.storingConstant.PrintedSentences;
import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class PrintingResult {
    private int strike;
    private int ball;
    private static final int GAME_CONTINUE = 0;
    List<Integer> computer;
    public PrintingResult(int strike, int ball, List<Integer> computer){
        this.strike = strike;
        this.ball = ball;
        this.computer = computer;
    }

    public int printResult(){
        if(strike == 3){
            PrintedSentences.printThreeStrike(strike);

            String oneOrTwo = Console.readLine();
            oneOrTwo = OneOrTwoInputChecking.check2(oneOrTwo);

            ChoosingNewGameOrExit choiceOneOrTwo = new ChoosingNewGameOrExit();
            return choiceOneOrTwo.chooseNewGameOrExit(oneOrTwo, computer);

        }else if(strike == 0 && ball == 0){
            PrintedSentences.printNothing();
            return GAME_CONTINUE;
        }else if(strike != 0 && ball != 0){
            PrintedSentences.printStrikeAndBall(strike, ball);
            return GAME_CONTINUE;
        }else if(strike != 0){
            PrintedSentences.printOnlyStrike(strike);
            return GAME_CONTINUE;
        }else{
            PrintedSentences.printOnlyBall(ball);
            return GAME_CONTINUE;
        }
    }


}
