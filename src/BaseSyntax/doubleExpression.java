package BaseSyntax;

public class doubleExpression {
    public static boolean compare(double a, double b, double c) {
        return Math.abs((a + b) - c) < 0.0001;
    }

    public static void main(String[] args) {
        System.out.println(compare(0.1, 0.2, 0.3));
    }
}
