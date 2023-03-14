package baseball;

public class ScoreBoard {
    private int strike;
    private int ball;
    public ScoreBoard(int strike, int ball){
        this.strike = strike;
        this.ball = ball;
    }

    public void addStrike(){
        this.strike++;
    }

    public void addBall(){
        this.ball++;
    }

    public int getStrike(){
        return this.strike;
    }

    public int getBall(){
        return this.ball;
    }


}
