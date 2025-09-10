package core.basesyntax;
import java.util.Random;
public class ColorSupplier {
    public enum allColor{
        RED,
        ORANGE,
        YELLOW,
        GREEN,
        BLUE,
        INDIGO,
        VIOLET,
        PINK,
        BROWN,
        BLACK,
        WHITE,
        GRAY,
        CYAN,
        MAGENTA,
        MAROON,
        NAVY,
        TEAL,
        LIME,
        OLIVE,
        CORAL,
        BEIGE,
        GOLD,
        SILVER,
        BRONZE,
        PEACH,
        LAVENDER,
        MINT,
        SKY
    }
    public static Color getRandomColor() {
        int index = new Random().nextInt(allColor.values().length);
        Color color = new Color();
        color.setName(String.valueOf(allColor.values()[index]));
        return color;
    }
}