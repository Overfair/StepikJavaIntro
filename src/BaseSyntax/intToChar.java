package BaseSyntax;

public class intToChar {
    public static final char charValue = '\\';

    public static char charExpression(int a) {
        return (char)(((int)charValue) + a);
    }

    public static void main(String[] args) {
        System.out.println(charExpression(29));
    }
}
