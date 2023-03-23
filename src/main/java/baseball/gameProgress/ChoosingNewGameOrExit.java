package baseball.gameProgress;

import baseball.initializing.MakingRandomThreeNumsList;

import java.util.List;

public class ChoosingNewGameOrExit {
    private int flag = 0;
    public void chooseNewGameOrExit(String oneOrTwo, List<Integer> computer){
        if(oneOrTwo.equals("1")){
            computer.clear();
            MakingRandomThreeNumsList mkRandom = new MakingRandomThreeNumsList(computer);
            mkRandom.makeRandomThreeNumsList();

        }else if(oneOrTwo.equals("2")){
            flag = 1;
        }
    }
    public int getFlag(){
        return flag;
    }

}
