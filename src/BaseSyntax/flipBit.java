package BaseSyntax;

public class flipBit {
    public static int flip(int value, int bitIndex) {
        return value ^ (1 << (bitIndex - 1));
    }

    public static void main(String[] args) {
        System.out.println(flip(13, 2));
    }
}
