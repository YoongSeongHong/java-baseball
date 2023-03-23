package baseball.gameProgress;
import baseball.initializing.MakingRandomThreeNumsList;
import baseball.checkingExceptions.ThreeNumsInputChecking;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class PlayBall {
    List<Integer> computer = new ArrayList<>();
    private int flag = 0;
    private int strike = 0;
    private int ball = 0;
    private static final int GAME_OVER = 1;
    private String inputtedThreeNums;
    public PlayBall(){
        MakingRandomThreeNumsList mkRandom = new MakingRandomThreeNumsList(computer);
        mkRandom.makeRandomThreeNumsList();
    }

    public int repeatGameUntilGameOver(List<Integer> computer){
        System.out.print("숫자를 입력해 주세요 : ");
        inputtedThreeNums = Console.readLine();
        inputtedThreeNums = ThreeNumsInputChecking.check1(inputtedThreeNums);

        BallStrikeJudge ballStrikeJudge = new BallStrikeJudge();
        strike = ballStrikeJudge.ballOrStrike(inputtedThreeNums, computer).getStrike();
        ball = ballStrikeJudge.ballOrStrike(inputtedThreeNums, computer).getBall();

        PrintingResult ptResult = new PrintingResult(strike, ball, computer);
        return ptResult.printResult();


    }

    public void start() {
        System.out.println("숫자 야구 게임을 시작합니다.");
        while(true) {
            if(repeatGameUntilGameOver(this.computer) == GAME_OVER){
                return;
            }

        }
    }

}