package core.basesyntax;

public class Application {

    public static void main(String[] args) {
        Ball firstBall = Lottery.getRandomBall();
        Ball secondBall = Lottery.getRandomBall();
        Ball thirdBall = Lottery.getRandomBall();
        System.out.println("the ball color is " + firstBall.getColor()
                + "\n" + "the ball number is " + firstBall.getNumber());
        System.out.println("the ball color is " + secondBall.getColor()
                + "\n" + "the ball number is " + secondBall.getNumber());
        System.out.println("the ball color is " + thirdBall.getColor()
                + "\n" + "the ball number is " + thirdBall.getNumber());
        // create three balls using class Lottery and print information about them in console
    }
}
