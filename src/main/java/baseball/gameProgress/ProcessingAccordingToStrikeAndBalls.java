package baseball.gameProgress;

import baseball.checkingExceptions.ExceptionChecking;
import baseball.storingResultComments.PrintingResults;
import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class ProcessingAccordingToStrikeAndBalls {
    private static final int GAME_CONTINUE = 0;
    private final ChoosingNewGameOrExit choiceOneOrTwo = new ChoosingNewGameOrExit();
    private final PrintingResults ptSentences = PrintingResults.getPrintedSentencesOnlyInstance();


    public int printResult(int strike, int ball, List<Integer> computer, ExceptionChecking exceptionChecking){
        if(strike == 3){
            ptSentences.printThreeStrike(strike);

            String oneOrTwo = Console.readLine();
            oneOrTwo = exceptionChecking.check1(oneOrTwo);

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
