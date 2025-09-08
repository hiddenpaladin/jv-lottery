package core.basesyntax;
import java.util.Random;
public class ColorSupplier {
    public enum Color {
        Red,
        Orange,
        Yellow,
        Green,
        Blue,
        Indigo,
        Violet,
        Pink,
        Brown,
        Black,
        White,
        Gray,
        Cyan,
        Magenta,
        Turquoise,
        Maroon,
        Navy,
        Teal,
        Lime,
        Olive,
        Coral,
        Beige,
        Gold,
        Silver,
        Bronze,
        Peach,
        Lavender,
        Mint,
        Sky
    }
    public static String getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        Color color = Color.values()[index];
        return color.toString();
    }
}