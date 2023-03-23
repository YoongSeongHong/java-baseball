package baseball.initializing;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class MakingRandomThreeNumsList {
    List<Integer> computer;
    public MakingRandomThreeNumsList(List<Integer> computer){
        this.computer = computer;
    }

    public void makeRandomThreeNumsList(){
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
    }

}
