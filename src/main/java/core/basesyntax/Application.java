package core.basesyntax;

public class Application {
    private static final int ballsToCreate = 3;

    public static void main(String[] args) {
        for (int i = 0; i < ballsToCreate; i++) {
            Ball ball = Lottery.getRandomBall();
            System.out.println(ball);
            System.out.println("№" + (i + 1) + " Color:" + ball.getColor()
                    + " Number:" + ball.getNumber() + "\n");
        }
    }
}
