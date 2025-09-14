package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final int ballsToCreate = 3;
        int doneOut = 0;

        do {
            Ball ball = Lottery.getRandomBall();
            System.out.println(ball);
            doneOut++;
        } while (doneOut < ballsToCreate);
    }
}
