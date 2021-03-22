package BaseSyntax;

public class booleanExpression {
    public static boolean compare(boolean a, boolean b, boolean c, boolean d){
        return ((a ^ b) & (c ^ d)) | ((a ^ c) & (b ^ d)) | ((a ^ d) & (b ^ c));
    }

    public static void main(String[] args) {
        System.out.println(compare(false, false, false, false));
        System.out.println(compare(true, true, false, false));
        System.out.println(compare(true, true, true, true));
    }
}
