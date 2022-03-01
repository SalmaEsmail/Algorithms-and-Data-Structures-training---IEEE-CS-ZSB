import java.util.Scanner;
 
    public class Main {
     
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int a = input.nextInt();
            int a=input.nextInt();
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < b; j++) {
                    String cur = input.next();
                    if (cur.charAt(0) == 'C' || cur.charAt(0) == 'M'
                            || cur.charAt(0) == 'Y') {
                        System.out.println("#Color");
                        System.exit(0);
                    }
                }
            }
            System.out.println("#Black&White");
        }
    }
