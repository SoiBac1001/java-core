package OCA.test2;

public class Zoo {
    public static void main(String[] args) {
        Integer a = 5;
        switch (a){
            case 1:
                System.out.println(a);
            case 2:
                System.out.println(a);
        }

        char i;
        char c = 65;
        System.out.println(c == 'A');
        char j = 0;
        System.out.println(j);
        LOOP: for (i = 76; i < 77; i++){
            switch (i++){
                default:
                case '0':
                    System.out.println("A");
                case 'A':
                    System.out.println("A");
                    break ;
                case 1:
                    System.out.println("B");
                    break LOOP;
                case 2:
                    System.out.println("C");
                    break ;
                case 3:
                    System.out.println("D");
                    break ;
                case 4:
                    System.out.println("E");
                    break ;
                case 'E':
                    System.out.println("F");
            }
        }

        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}
