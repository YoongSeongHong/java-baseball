package baseball.gameProgress;

public class ScoreBoard {
    private int strike;
    private int ball;
    public ScoreBoard(int strike, int ball){
        this.strike = strike;
        this.ball = ball;
    }

    public void plusStrike(){
        this.strike++;
    }

    public void plusBall(){
        this.ball++;
    }

    public int getStrike(){
        return this.strike;
    }

    public int getBall() { return this.ball; }


}
