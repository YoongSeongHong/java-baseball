package baseball;

import java.util.List;

public class ChoiceOneOrTwo {
    private int flag = 0;
    public void choice(String oneOrTwo, List<Integer> computer){
        if(oneOrTwo.equals("1")){
            computer.clear();
            MakingRandom mkRandom = new MakingRandom(computer);
            mkRandom.makeRandom();

        }else if(oneOrTwo.equals("2")){
            flag = 1;
        }
    }
    public int getFlag(){
        return flag;
    }

}
