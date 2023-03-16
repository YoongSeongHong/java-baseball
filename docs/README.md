## 각 함수 기능 및 구현 목록

- 아직 다듬을게 많은 코드지만 일단 현재 진행상황 토대로 작성하였습니다.


### baseball package
- Application Class :
    * main 메소드 : PlayBall 객체 생성을 시작으로 야구 게임을 시작한다.


- MakingRandom Class : 
    * 생성자 : PlayBall의 computer리스트를 매개변수로 받는 객체를 생성한다.
    * 변수
      * computer : PlayBall로부터 전달받아 세 난수를 저장해서 다시 PlayBall로 보낼 리스트 변수이다.
    * 메소드
      * makeRandom
        * computer의 길이가 3 보다 작을 때, 중복되지 않는 0~9까지의 숫자를 computer에 저장하는 메소드이다.



- PlayBall Class : 
    * 생성자 : MakingRandom 객체를 생성하여 computer라는 리스트에 랜덤 난수 세 개를 생성하고 시작한다.
    * 변수
      * computer : 랜덤 난수 세 개를 저장할 리스트
      * flag : 평소에 0을 저장하고, 1을 저장하게 되면 게임을 종료할 때 쓰일 변수
    * 메소드
      * play
        * 연속된 세 숫자를 입력받고 ThreeNumsInputChecking의 check1 메소드를 실행시켜 예외처리
        * BallStrikeJudge 객체를 생성하여 스트라이크 수와 볼 수를 알아낸다.
        * PrintingResult 객체를 생성하여 각 상황에 맞는 출력을 해준다.
        * 여러 객체들을 거치며 flag변수를 건네받아 0이면 계속 진행, 1이면 게임을 종료하게 한다.
      * start
        * 숫자야구를 시작하는 문장을 출력하고, flag가 1이 아닌 이상 play를 무한 반복하도록 한다.


- ThreeNumsInputChecking Class :
    * 메소드
      * check1
        * 스태틱 메소드로 PlayBall에서 입력받은 문자열이 연속된 세 숫자인지 확인하고 아니면 IllegalArgumentException을 일으킨다.
      * inputNumWell
        * check1에 들어갈 긴 조건을 메소드화 한 것


- BallStrikeJudge Class :
    * 메소드
        * ballOrStrike
          * PlayBall에서 입력받은 문자열, computer 리스트를 매개변수로 받는다. 
          * strike, ball 0인 ScoreBoard 객체를 생성, 순서대로 숫자를 검사하여 스트라이크면 strike를 +1, 볼이면 ball을 +1
          * 최종으로 스트라이크, 볼 갯수를 저장하고 있는 PlayBall 객체를 리턴 해 준다.


- ScoreBoard Class :
  * 생성자 : strike, ball 수를 0으로 갖는 객체 생성
  * 변수
    * strike : 스트라이크 수를 저장할 변수
    * ball : 볼 수를 저장할 변수
  * 메소드
    * addStrike
      * strike 수를 +1 해준다.
    * addBall
      * ball 수를 +1 해준다.
    * getStrike
      * strike 수를 리턴 해준다.
    * getBall
      * ball 수를 리턴 해준다.


- PrintingResult Class :
    * 생성자 : PlayBall에서 BallStrikeJudge를 통해 건네받은 스트라이크, 볼 수와 computer를 매개변수로 받는 객체를 생성한다.
    * 변수
      * strike : PlayBall에서 ScoreBoard의 getStrike() 메소드를 통해 전달받은 stirke 수를 저장한다.
      * ball : PlayBall에서 ScoreBoard의 getBall() 메소드를 통해 전달받은 ball 수를 저장한다.
      * flag : 게임을 계속 진행할 지(0), 끝낼 지(1)를 저장하는 변수이다.
      * computer : PlayBall에서 입력 받은 세 숫자를 리스트로 저장한다.
    * 메소드
      * printResult
        * 볼, 스트라이크 갯수에 따른 상황에 알맞은 출력을 해준다.
        * 만약, 3 strike면 1이나 2를 입력받고 OneOrTwoInputChecking 클래스의 check2 메소드를 호출하여 알맞게 입력했는지 확인한다.
        * 1이나 2가 입력이 됐다면, ChoiceOneOrTwo 객체를 생성하여 각 상황에 알맞게 진행한다.
        * 마지막으로, getFlag 함수를 통해 flag를 건네받아 0인지 1인지 확인하여 게임을 계속할지, 그만할지 결정한다.
      * getFlag
        * 0또는 1 값을 가져 게임을 계속 할 지 멈출 지를 결정하는 flag 변수를 리턴한다.
  

- OneOrTwoInputChecking Class :
    * 메소드
      * check2
        * 스태틱 메소드로 3스트라이크 시 입력받은 값이 0이나 1인지 확인하고 다른 값이라면 IllegalArgumentException을 일으킨다.
      * whetherInputOneOrTWo
        * check2에 들어갈 긴 조건을 메소드화 한 것
    

- ChoiceOneOrTwo Class :
    * 변수
      * flag : 게임을 계속 진행할 지(0), 끝낼 지(1)를 저장하는 변수이다. 원래 0의 값을 가지지만, PrintingResult에서 2를 입력받았다면 1값을 가지게 된다.
    * 메소드
      * choice
        * 3스트라이크 시 입력 받은 숫자가 1인지 2인지 확인한다.
        * 1일 경우에는 랜덤 난수 세개를 가진 computer 리스트를 초기화 하고 다시 MakingRandom 객체를 생성하고 새로운 난수를 computer에 다시 저장한다.
        * 2일 경우에는 flag에 1을 저장하여 PrintResult를 거쳐 PlayBall에 flag = 1을 전달하여 start메소드의 무한루프를 멈춰 게임을 종료한다.
      * getFlag
        * 0또는 1 값을 가져 게임을 계속 할 지 멈출 지를 결정하는 flag 변수를 리턴한다.
      
