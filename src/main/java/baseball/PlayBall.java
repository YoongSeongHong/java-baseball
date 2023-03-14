package baseball;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class PlayBall {
    List<Integer> computer = new ArrayList<>();
    int flag = 0;
    public PlayBall(){
        MakingRandom mkRandom = new MakingRandom(computer);
        mkRandom.makeRandom();
    }

    public void choice(String oneOrTwo, List<Integer> computer){
        if(oneOrTwo.equals("1")){
            computer.clear();
            MakingRandom mkRandom = new MakingRandom(computer);
            mkRandom.makeRandom();

        }else if(oneOrTwo.equals("2")){
            flag = 1;
        }
    }

    public void play(List<Integer> computer){
        System.out.print("숫자를 입력해 주세요 : ");
        String str = Console.readLine();
        str = ThreeNumsInputChecking.check1(str);

        BallStrikeJudge ballStrikeJudge = new BallStrikeJudge();
        int strike = ballStrikeJudge.ballOrStrike(str, computer, flag).getStrike();
        int ball = ballStrikeJudge.ballOrStrike(str, computer, flag).getBall();

        if(strike == 3){
            System.out.printf("%d스트라이크\n", strike);
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

            String oneOrTwo = Console.readLine();
            oneOrTwo = OneOrTwoInputChecking.check2(oneOrTwo);
            choice(oneOrTwo, computer);


        }else if(strike == 0 && ball == 0){
            System.out.println("낫싱");
        }else if(strike != 0 && ball != 0){
            System.out.printf("%d볼 %d스트라이크\n", ball, strike);
        }else if(strike != 0){
            System.out.printf("%d스트라이크\n", strike);
        }else{
            System.out.printf("%d볼\n", ball);
        }
    }

    public void start() {
        System.out.println("숫자 야구 게임을 시작합니다.");
        while(true) {
            if(flag == 1){
                return;
            }
            play(this.computer);

        }
    }

}