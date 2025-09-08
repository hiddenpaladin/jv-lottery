package core.basesyntax;
import java.util.Random;
public class Lottery {
    public static Ball getRandomBall() {
        Ball ball = new Ball();
        ball.color = ColorSupplier.getRandomColor();
        Random random = new Random();
        ball.number = random.nextInt(100);
        return ball;
    }
}