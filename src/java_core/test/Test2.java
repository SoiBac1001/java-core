package java_core.test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(roudingHaleUpDoubleWithPlaces(1.23, 0));
    }

    public static Double roudingHaleUpDoubleWithPlaces(Double value, int places) {
        return new BigDecimal(value).setScale(places, RoundingMode.HALF_UP).doubleValue();
    }
}
