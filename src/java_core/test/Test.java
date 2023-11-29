package java_core.test;

import java.sql.Timestamp;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.function.Function;

public class Test {
    public static void main(String[] args) throws Exception {
        Timestamp tomorrowTimeToViewReport = getTomorrowTimeToViewReport(Timestamp.valueOf("2023-10-21 12:30:00"), 9);
        Integer five = Integer.valueOf(5);
        five.equals(null);
        testArray();
        Test t = new Test();
        String param1 = "Foo", param2 = "Bar";

        String result = t.myMethod(SomeClass.class, x -> x.someMethod(param1, param2));

        System.out.println(result);
        SomeClass someClass = new SomeClass();
        System.out.println("Class name: " + someClass.getClass().getSimpleName());
    }
    public <C, R> R myMethod(Class<? extends C> clazz, Function<C, R> method) throws Exception {
        C obj = clazz.getConstructor().newInstance();
        return method.apply(obj);
    }

    private static Timestamp getTomorrowTimeToViewReport(Timestamp inputDate, Integer timeToViewReport) {
        ZonedDateTime zonedDateTime = inputDate.toLocalDateTime().atZone(ZoneId.of("Asia/Ho_Chi_Minh")).withHour(0)
                .withMinute(0).withSecond(0).withNano(0).plus(1, ChronoUnit.DAYS).withHour(timeToViewReport);
        return new Timestamp(zonedDateTime.toInstant().toEpochMilli());

    }

    private static void testArray() {
        String txt = "HOANG_TEST_2-ON-INS-INVITE-TEST1-BAN";
        String[] cmpCodeArray = txt.split("-");
        String[] cmpCodes = new String[10];
        int cmpCodeLength = cmpCodeArray.length;
        for(int i = 0; i < 10; i++) {
            if(i < cmpCodeLength) {
                cmpCodes[i] = cmpCodeArray[i];
            }
        }

        for(String cmp : cmpCodes) {
            System.out.println(cmp);
        }
    }
}

class SomeClass {
    public SomeClass() {}
    public String someMethod(String param1, String param2) {
        return param1 + " + " + param2 + ": " + this;
    }
}
