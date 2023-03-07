package baseball;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class PlayBall {
    List<Integer> computer = new ArrayList<>();
    int strike = 0;
    int ball = 0;
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
            this.flag = 1;
        }
    }

    public void play(List<Integer> computer){
        try{
            System.out.println(computer);
            System.out.print("숫자를 입력해 주세요 : ");
            String str = Console.readLine();

            if(str.charAt(0) == (char)(computer.get(0) + '0')){
                this.strike += 1;
            }else if(computer.contains(Character.getNumericValue(str.charAt(0)))){
                this.ball += 1;
            }
            if(str.charAt(1) == (char)(computer.get(1) + '0')){
                this.strike += 1;
            }else if(computer.contains(Character.getNumericValue(str.charAt(1)))){
                this.ball += 1;
            }
            if(str.charAt(2) == (char)(computer.get(2) + '0')){
                this.strike += 1;
            }else if(computer.contains(Character.getNumericValue(str.charAt(2)))){
                this.ball += 1;
            }

            if(this.strike == 3){
                System.out.printf("%d스트라이크\n", this.strike);
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                String oneOrTwo = Console.readLine();
                this.ball = 0;
                this.strike = 0;
                choice(oneOrTwo);

            }else if(this.strike == 0 && this.ball == 0){
                System.out.println("낫싱");
            }else if(this.strike != 0 && this.ball != 0){
                System.out.printf("%d볼 %d스트라이크\n", this.ball, this.strike);
            }else if(this.strike != 0){
                System.out.printf("%d스트라이크\n", this.strike);
            }else{
                System.out.printf("%d볼\n", this.ball);
            }
            this.ball = 0;
            this.strike = 0;


        }catch (IllegalArgumentException e){
            this.flag = 1;
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