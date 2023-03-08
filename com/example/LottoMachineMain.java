package com.example;

public class LottoMachineMain {
    public static void main(String[] args) {
        /*
        Create an array that can refers to 45 ball instances
        It does not Create ball instances, only creates an array
        */
        Ball[] balls = new Ball[45];

        // Create Ball instances and make the array refers to them.
        for (int i = 0; i < 45; i++) {
            balls[i] = new Ball(i + 1);
        }


        LottoMachine Machine = new LottoMachineImpl(); // Create Lotto Machine instance 
        Machine.setBalls(balls); // Put the balls in the Lotto Machine
        Machine.mix(); // mix balls
        Ball[] result = Machine.getBalls(); // draw balls

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i].getNumber());
        }

    }


}
