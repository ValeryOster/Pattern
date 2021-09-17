package codewar.onesinsegment;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class CountOnes {
    public static BigInteger countOnes(long left, long right) {
        BigInteger total = BigInteger.ZERO;
        for (long i = left; i <= right; i++) {
            long count = Long.toBinaryString(i)
                    .chars()
                    .filter(value -> value == 49)
                    .count();
            total = total.add(BigInteger.valueOf(count));
        }
        return total;
    }

    public static void main(String[] args) {
        assertEquals(new BigInteger("7"), countOnes(5,7));
        assertEquals(new BigInteger("51"), countOnes(12,29));
    }
}
