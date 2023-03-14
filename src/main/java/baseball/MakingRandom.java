package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class MakingRandom {
    List<Integer> computer;
    public MakingRandom(List<Integer> computer){
        this.computer = computer;
    }

    public void makeRandom(){
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
    }

}
