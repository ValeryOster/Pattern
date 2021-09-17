package interview.blinov;

import java.math.BigDecimal;
import java.math.MathContext;

enum Tests {
    AIRBUS_A320("AIRBUS_A320"), AIRBUS_A380("AIRBUS_A320");
    private String type;

    Tests(String type) {
        this.type = type;
    }
}

public class NumberTests {
    public static void main(String[] args) {
        NumberTests tests = new NumberTests();
        tests.testEnums();
    }

    private void testEnums() {

    }

    private void maschinenGenauigkeit() {
        boolean res1 = 1.00000001f == 1.00000002f;
        boolean res2 = 1 == 1f / 3 * 3;
        System.out.println(res1);
        System.out.println(res2);
    }

    private void bigDecimal() {
        float res = 0.4f - 0.3f;
        BigDecimal big1 = new BigDecimal("0.4");
        BigDecimal big2 = new BigDecimal("0.3");
        BigDecimal bigRes = big1.subtract(big2, MathContext.DECIMAL32);
        System.out.println(res);
        System.out.println(bigRes);

    }
}
