package OCA.test2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Predicate;

public class Bandwidth {
    public int available = 0;
    public int getAvailable(){
        return available;
    }
    public Bandwidth(int quota){
        Boolean b = Boolean.valueOf(true);
        Boolean b2 = Boolean.parseBoolean("true");
        int i = 10;
        System.out.println(i < 20 ? addMore(i) : getAvailable());
        this.available = quota;
    }
    public boolean addMore(int more){
        available += more;
        return false;
    }

    public static boolean addMore(){
        int rate = 10;
        double amount = 1 - rate/100.0*1 - rate/100;
        double amount3 = 1 - rate/100.0*1 - rate/100;
        int amount2 = 1 - rate/100*2 - rate/100;
        System.out.println(amount + " - " + amount2 + " - " + amount3);
        return true;
    }

    public static void main(String[] args) {
        addMore();
        System.out.println(args);
        testString();
        testDate();
        System.out.println("hello" + new String("world"));
        System.out.println(new StringBuilder("world").insert(0, "hello").toString());

        long bigInt = 3123456789L;
        System.out.println(bigInt);
        System.out.println(017);
        System.out.println("Hello");
        Boolean b = Boolean.parseBoolean("True");
        Boolean b2 = new Boolean("true");
    }

    private static void testDate(){
//        LocalDateTime greatDay = LocalDateTime.parse("2015-01-01"); // DateTimeParseException
        Bandwidth bandwidth = new Bandwidth(6);
        System.out.println(validateBandwidth(bandwidth, bandwidth1 -> bandwidth1.available < 5));
        String s = "hello";
        System.out.println(s.replace('h', 's'));
        System.out.println("hello" + new String("world"));
        s.length();
        LocalDateTime greatDay2 = LocalDateTime.parse("2007-12-03T10:15:30");
        LocalDate parse = LocalDate.parse("2015-01-01");
        System.out.println(parse);
        String format = greatDay2.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(DateTimeFormatter.ISO_ZONED_DATE_TIME.format(greatDay2));
        System.out.println(format);
    }

    private static boolean validateBandwidth(Bandwidth b, Predicate<Bandwidth> p){
        return p.test(b);
    }

    private static void testString(){
        String fullPhoneNumber = "123-456-7890";
        String mask = "xxx-xxx-";
        mask.substring(2); // x-xxx-
        mask.substring(2, 6); //
        StringBuilder stringBuilder = new StringBuilder("xxx-xxx-");
        System.out.println(new StringBuilder("xxx-xxx-") + fullPhoneNumber.substring(8));
        new StringBuilder(fullPhoneNumber).replace(0,7, mask);
        System.out.println(mask + fullPhoneNumber.substring(8, 12));
    }
}
