package OCA.test2;

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
        double amount = 1 - rate/100*1 - rate/100;
        int amount2 = 1 - rate/100*1 - rate/100;
        System.out.println(amount + " - " + amount2);
        return true;
    }

    public static void main(String[] args) {
        addMore();
    }
}
