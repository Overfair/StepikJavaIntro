package BaseSyntax;

import java.math.BigInteger;

public class factorial {

    public static BigInteger count(int value) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= value; ++i) result = result.multiply(BigInteger.valueOf(i));
        return result;
    }


    public static void main(String[] args) {
        System.out.println(count(5));
    }
}
