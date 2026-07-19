import java.math.BigInteger;

class Solution {
    public static BigInteger factorial(int n) {

        BigInteger f = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }

        return f;
    }
}