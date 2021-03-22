package BaseSyntax;

public class isPowerOfTwo {

    public static boolean check(int value) {
        return Integer.toBinaryString(Math.abs(value)).replace("0", "").length() == 1;
    }

    public static void main(String[] args) {
        System.out.println(check(0));
        System.out.println(check(1));
        System.out.println(check(-2));
    }
}
