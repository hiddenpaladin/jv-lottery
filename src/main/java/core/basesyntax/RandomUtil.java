package core.basesyntax;

import java.util.Random;

public class RandomUtil {
    private static final Random random = new Random();

    public static int randomInt(int max) {
        return new Random().nextInt(max);
    }
}
