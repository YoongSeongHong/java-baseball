package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class PrintingResult {
    private int strike;
    private int ball;
    private int flag = 0;
    List<Integer> computer;
    public PrintingResult(int strike, int ball, List<Integer> computer){
        this.strike = strike;
        this.ball = ball;
        this.computer = computer;
    }

    public void printResult(){
        if(strike == 3){
            PrintedSentences.printThreeStrike(strike);

            String oneOrTwo = Console.readLine();
            oneOrTwo = OneOrTwoInputChecking.check2(oneOrTwo);

            ChoosingGameOverOrExit choiceOneOrTwo = new ChoosingGameOverOrExit();
            choiceOneOrTwo.choice(oneOrTwo, computer);
            flag = choiceOneOrTwo.getFlag();


        }else if(strike == 0 && ball == 0){
            PrintedSentences.printNothing();
        }else if(strike != 0 && ball != 0){
            PrintedSentences.printStrikeAndBall(strike, ball);
        }else if(strike != 0){
            PrintedSentences.printOnlyStrike(strike);
        }else{
            PrintedSentences.printOnlyBall(ball);
        }
    }

    public int getFlag(){
        return flag;
    }

}
