package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static AllColor getRandomColor() {
        int index = new Random().nextInt(AllColor.values().length);
        return AllColor.values()[index];
    }
}
