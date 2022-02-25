import java.util.Scanner;
public class task-5 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        long number=input.nextLong();
     
        for(int i=1;i<=12;i++){
          long multiplicatino=number*i;
          System.out.println(number+" "+"X"+" "+i+" "+"="+" "+multiplicatino);
        }  
    }
    
}
