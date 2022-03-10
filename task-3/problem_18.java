import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s =input.next();
        String d =input.next();
        
    int pos = 0;
    for (int i = 0; i < d.length(); ++i)
    {
        if (d.charAt(i) == s.charAt(pos))
        {
            pos += 1;
        }
    }
    System.out.println(pos + 1);
    }
    }
