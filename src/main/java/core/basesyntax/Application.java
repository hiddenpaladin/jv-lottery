package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final int ballsToCreate = 3;
        int doneOut = 0;

        do {
            Ball ball = Lottery.getRandomBall();
            System.out.println("the " + doneOut + " ball color is " + ball.getColor().getName()
                    + "\n" + "the ball number is " + ball.getNumber());
            doneOut++;
        } while (doneOut < ballsToCreate);
    }
}
