package baseball.storingConstant;

public class PrintedSentences {
    private int strike;
    private int ball;
    private static PrintedSentences printedSentencesOnlyInstance;

    private PrintedSentences(int strike, int ball){
        this.strike = strike;
        this.ball = ball;
    }

    public static PrintedSentences getPrintedSentencesOnlyInstance(){
        if (printedSentencesOnlyInstance == null){
            synchronized (PrintedSentences.class){
                printedSentencesOnlyInstance = new PrintedSentences(0, 0);
            }
        }
        return printedSentencesOnlyInstance;
    }

    public void printThreeStrike(int strike){
        System.out.printf("%d스트라이크\n", strike);
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
    public void printNothing(){
        System.out.println("낫싱");
    }

    public void printStrikeAndBall(int strike, int ball){
        System.out.printf("%d볼 %d스트라이크\n", ball, strike);
    }

    public void printOnlyStrike(int strike){
        System.out.printf("%d스트라이크\n", strike);
    }

    public void printOnlyBall(int ball){
        System.out.printf("%d볼\n", ball);
    }
}
