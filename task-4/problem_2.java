import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class JavaApplication29 {

    public static void main(String[] args) {
        // TODO code application logic here
          Scanner input =new Scanner(System.in);
        String a = input.next();
       String b = input.next();
    
   tring c = a;
   int n =0;
     n = a.length();
    for (int i = n - 1; i >= 0; i--)
    {
        while (c[i] < 'z')
        {
            c[i]++;
            if (c < b)
            {
                System.out.println(c);
               
            }
        }
        if (c[i] == 'z') c[i] = 'a';
    }
        System.out.println("No such string");
    }
    

}
