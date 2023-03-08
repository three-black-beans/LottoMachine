package com.example;

public class LottoMachineMain {
    public static void main(String[] args) {
        /*
        Ball instance 를 45개 참조할 수 있는 배열 생성
        Ball 객체 생성 아님, Ball 을 참조할 수 있는 배열을 생성
        */
        Ball[] balls = new Ball[45];

        // Ball instance 를 생성하고 balls 배열이 이를 참조하도록 함
        for (int i = 0; i < 45; i++) {
            balls[i] = new Ball(i + 1);
        }


        LottoMachine Machine = new LottoMachineImpl(); // Lotto Machine instance 생성
        Machine.setBalls(balls); // Lotto Machine 에 balls 넣어주기
        Machine.mix(); // ball 섞기
        Ball[] result = Machine.getBalls(); // ball 꺼내기

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i].getNumber());
        }

    }


}
