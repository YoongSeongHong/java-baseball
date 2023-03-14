package baseball;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class PlayBall {
    List<Integer> computer = new ArrayList<>();
    int flag = 0;
    public PlayBall(){
        makingRandom();
    }

    public void makingRandom(){
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
    }

    public void choice(String oneOrTwo){
        if(oneOrTwo.equals("1")){
            computer.clear();
            makingRandom();

        }else if(oneOrTwo.equals("2")){
            flag = 1;
        }
    }

    public void play(List<Integer> computer){
        System.out.print("숫자를 입력해 주세요 : ");
        String str = Console.readLine();
        str = check1(str);
        int strike = 0;
        int ball = 0;
        BallStrikeJudge ballStrikeJudge = new BallStrikeJudge();
        strike = ballStrikeJudge.ballOrStrike(str, computer, flag).getStrike();
        ball = ballStrikeJudge.ballOrStrike(str, computer, flag).getBall();

//        if(str.charAt(0) == (char)(computer.get(0) + '0')){
//            strike += 1;
//        }else if(computer.contains(Character.getNumericValue(str.charAt(0)))){
//            ball += 1;
//        }
//        if(str.charAt(1) == (char)(computer.get(1) + '0')){
//            strike += 1;
//        }else if(computer.contains(Character.getNumericValue(str.charAt(1)))){
//            ball += 1;
//        }
//        if(str.charAt(2) == (char)(computer.get(2) + '0')){
//            strike += 1;
//        }else if(computer.contains(Character.getNumericValue(str.charAt(2)))){
//            ball += 1;
//        }

        if(strike == 3){
            System.out.printf("%d스트라이크\n", strike);
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

            String oneOrTwo = Console.readLine();
            oneOrTwo = check2(oneOrTwo);
            choice(oneOrTwo);


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

    public static String check1(String s) throws IllegalArgumentException{
        if(s.length() != 3 || ((int)s.charAt(0) - '0' >= 10 || (int)s.charAt(0) - '0' < 0) || ((int)s.charAt(1) - '0' >= 10 || (int)s.charAt(1) - '0' < 0) || ((int)s.charAt(2) - '0' >= 10 || (int)s.charAt(2) - '0' < 0)) {
            throw new IllegalArgumentException();
        }
        return s;
    }

    public static String check2(String s) throws IllegalArgumentException{
        if(!s.equals("1") && !s.equals("2")){
            throw new IllegalArgumentException();
        }
        return s;
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