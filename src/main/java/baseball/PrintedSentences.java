package baseball;

public class PrintedSentences {
    private int strike;
    private int ball;

    public PrintedSentences(int strike, int ball){
        this.strike = strike;
        this.ball = ball;
    }

    public static void printThreeStrike(int strike){
        System.out.printf("%d스트라이크\n", strike);
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
    public static void printNothing(){
        System.out.println("낫싱");
    }

    public static void printStrikeAndBall(int strike, int ball){
        System.out.printf("%d볼 %d스트라이크\n", ball, strike);
    }

    public static void printOnlyStrike(int strike){
        System.out.printf("%d스트라이크\n", strike);
    }

    public static void printOnlyBall(int ball){
        System.out.printf("%d볼\n", ball);
    }
}
