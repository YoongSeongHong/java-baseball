package baseball.gameProgress;

import baseball.initializing.MakingRandomThreeNumsList;

import java.util.List;

public class ChoosingNewGameOrExit {
    private final static int GAME_CONTINUE = 0;
    private final static int GAME_OVER = 1;

    public int chooseNewGameOrExit(String oneOrTwo, List<Integer> computer){
        if(oneOrTwo.equals("1")){
            computer.clear();
            MakingRandomThreeNumsList mkRandom = new MakingRandomThreeNumsList(computer);
            mkRandom.makeRandomThreeNumsList();
            return GAME_CONTINUE;

        }else if(oneOrTwo.equals("2")){
            return GAME_OVER;
        }
        else
            return GAME_CONTINUE;
    }

}
