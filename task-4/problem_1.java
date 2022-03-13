
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class JavaApplication28{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner input =new Scanner(System.in);
        int c1 =0;
        int c2 =0;
        int re =0;
        String c =input.nextLine();
         char cha[] =new char [c.length()+1];
         int col =0;
        for(int i =0;i<c.length();i++){
            if(c.charAt(i)=='='){
                re =i;
                break;
            }
            else if(c.charAt(i)!='+')
                c1++;
            
        }
        for(int i =re;i<c.length()-1;i++){
            c2++;
        }
        if(c1 == c2){
            System.out.println(c);
        }
        else if(c1+1 < c2-1||c1+1 > c2-1){
            System.out.println("Impossible");
        }
        else if(c1+1 == c2-1){
         for(int i =0;i<c.length()-1;i++){
            if(c.charAt(i)!='+'){
                cha[col] = c.charAt(i);
                col++;
           }
            else{
                cha[col] = '|';
                col++;
                cha[col] = c.charAt(i);
                col++;
            }
                
        }   
         
          for(int i =0;i<cha.length;i++){
            System.out.print(cha[i]);
        }
          System.out.println();
        }
        
    }
    }
    

