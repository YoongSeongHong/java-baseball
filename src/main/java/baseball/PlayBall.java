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
    public PlayBall(){
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
    }

    public void check(){

    }

    public void start() {
        System.out.println("숫자 야구 게임을 시작합니다.");
        while(true) {
            System.out.print("숫자를 입력해 주세요 : ");
            String str = Console.readLine();
            

        }
    }

}
