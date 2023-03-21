package baseball;

import java.util.List;

public class ChoosingGameOverOrExit {
    private int flag = 0;
    public void choice(String oneOrTwo, List<Integer> computer){
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
