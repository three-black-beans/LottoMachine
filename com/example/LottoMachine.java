package com.example;

/*
Service Architecture to implementation

1. Put in 45 balls in the lotto machine.
2. Mix these balls for 10,000 times.
3. Draw 6 balls.
*/
public interface LottoMachine {
    int MAX_BALL_COUNT = 45; // 'public static' can be omitted
    int RETURN_BALL_COUNT = 6;

    public void setBalls(Ball[] balls); // get 45 balls. 'abstract' can be omiited

    public void mix();

    public Ball[] getBalls(); // return 6 balls
}
