package core.basesyntax;

public class ColorSupplier {
    public static String getRandomColor() {
        int index = RandomUtil.randomInt(Color.values().length);
        return Color.values()[index].toString();
    }
}
