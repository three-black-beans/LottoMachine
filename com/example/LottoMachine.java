package com.example;

/*
구현해야 할 서비스 구조

1. 1~45까지 써 있는 Ball 을 로또 기계에 넣는다.
2. 로또 기계에 있는 Ball 을 섞는다.
3. 섞인 Ball 중에 6개를 꺼낸다.
 */
public interface LottoMachine {
    int MAX_BALL_COUNT = 45; // public static 은 생략 가능
    int RETURN_BALL_COUNT = 6;

    public void setBalls(Ball[] balls); // Ball[] Ball 이 여러 개를 받겠다. 45개를 받는다. abstract 는 생략 가능

    public void mix(); // 자기가 가지고 있는 Ball 을 섞는다.

    public Ball[] getBalls(); // 6개의 Ball 을 반환한다.
}
