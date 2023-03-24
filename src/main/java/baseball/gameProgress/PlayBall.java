package baseball.gameProgress;
import baseball.initializing.MakingRandomThreeNumsList;
import baseball.checkingExceptions.ThreeNumsInputChecking;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class PlayBall {
    List<Integer> computer = new ArrayList<>();
    private static final int GAME_OVER = 1;
    private final BallStrikeJudge ballStrikeJudge = new BallStrikeJudge();
    private final  PrintingResult ptResult = new PrintingResult();

    private final ThreeNumsInputChecking threeNumsInputChecking = new ThreeNumsInputChecking();
    public PlayBall(){
        MakingRandomThreeNumsList mkRandom = new MakingRandomThreeNumsList(computer);
        mkRandom.makeRandomThreeNumsList();
    }

    private int repeatGameUntilGameOver(List<Integer> computer){
        System.out.print("숫자를 입력해 주세요 : ");
        String inputtedThreeNums = Console.readLine();
        inputtedThreeNums = threeNumsInputChecking.check2(inputtedThreeNums);

        int strike = ballStrikeJudge.ballOrStrike(inputtedThreeNums, computer).getStrike();
        int ball = ballStrikeJudge.ballOrStrike(inputtedThreeNums, computer).getBall();

        return ptResult.printResult(strike, ball, computer);


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