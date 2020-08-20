package OCA;

public class Cougar extends Puma {
    static public void main(String[] args) {
        int b;
        {
           b  = 6;
        }
        b = 8;

        System.out.println(4 % 3);
        Puma puma = new Puma();
        System.out.println(puma.getTailLength());
        int count = 0;
        int x = 3;
        while(count++ < 3) {
            int y = (1 + 2 * count) % 3;
            switch(y) {
                default:
                case 0: x -= 1; break;
                case 1: x += 5;
            }
        }
        System.out.println(x);
    }

    public int getTailLength(){
        return 2;
    }
}
