import java.io.IOException;
 import java.util.*;
public class task-4 {
 
    public static void main(String[] args) throws IOException {
  Scanner input=new Scanner(System.in);
        long number=input.nextLong();
        for(int i=1;i<=12;i++){
          long multiplicatino=number*i;
          System.out.println(number+" "+"X"+" "+i+" "+"="+" "+multiplicatino);
        }  
 
    }
 
}
