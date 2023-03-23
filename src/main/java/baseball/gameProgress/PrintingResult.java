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
    ChoosingNewGameOrExit choiceOneOrTwo = new ChoosingNewGameOrExit();
    PrintedSentences ptSentences = PrintedSentences.getPrintedSentencesOnlyInstance();
    public PrintingResult(){}

    public int printResult(int strike, int ball, List<Integer> computer){
        if(strike == 3){
            ptSentences.printThreeStrike(strike);

            String oneOrTwo = Console.readLine();
            oneOrTwo = OneOrTwoInputChecking.check2(oneOrTwo);

            return choiceOneOrTwo.chooseNewGameOrExit(oneOrTwo, computer);

        }else if(strike == 0 && ball == 0){
            ptSentences.printNothing();
            return GAME_CONTINUE;
        }else if(strike != 0 && ball != 0){
            ptSentences.printStrikeAndBall(strike, ball);
            return GAME_CONTINUE;
        }else if(strike != 0){
            ptSentences.printOnlyStrike(strike);
            return GAME_CONTINUE;
        }else{
            ptSentences.printOnlyBall(ball);
            return GAME_CONTINUE;
        }
    }


}
