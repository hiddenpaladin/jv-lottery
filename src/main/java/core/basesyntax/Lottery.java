package core.basesyntax;

public class Lottery {
    private static final int maxBallNumber = 100;

    public static int getMaxBallNumber() {
        return maxBallNumber;
    }

    public static Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(ColorSupplier.getRandomColor());
        ball.setNumber(RandomUtil.randomInt(getMaxBallNumber()));
        return ball;
    }
}
