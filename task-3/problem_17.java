import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n =input.nextInt();
        String ch = input.next();
        int d =0;
        int a =0;
        for(int i=0;i<=n-1;i++){
            if(ch.charAt(i) == 'A')
                a++;
            else
                d++;
        }
        if(d>a)
            System.out.println("Danik");
        else if(d<a)
            System.out.println("Anton");
        else
            System.out.println("Friendship");
    }
    }
