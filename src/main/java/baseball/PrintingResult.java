//package baseball;
//
//import camp.nextstep.edu.missionutils.Console;
//
//public class PrintingResult {
//    private int strike;
//    private int ball;
//    private int flag;
//    public PrintingResult(int strike, int ball, int flag){
//        this.strike = strike;
//        this.ball = ball;
//        this.flag = flag;
//    }
//    public void printResult(){
//        if(strike == 3){
//            System.out.printf("%d스트라이크\n", strike);
//            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
//            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
//
//            String oneOrTwo = Console.readLine();
//            oneOrTwo = PlayBall.check2(oneOrTwo);
//            checkIfItIsOneOrTwo(oneOrTwo);
//
//
//        }else if(strike == 0 && ball == 0){
//            System.out.println("낫싱");
//        }else if(strike != 0 && ball != 0){
//            System.out.printf("%d볼 %d스트라이크\n", ball, strike);
//        }else if(strike != 0){
//            System.out.printf("%d스트라이크\n", strike);
//        }else{
//            System.out.printf("%d볼\n", ball);
//        }
//    }
//}
