import java.util.Scanner;

public class task-4-5{

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n =input.nextInt();
        int p =input.nextInt();
        int k =input.nextInt();
        int col = k+3;
        int cal = k;
        int star =p-1 ;
        int end = p+1;
       String a [] = new String [n];
       a[k+2] ="("+String.valueOf(p)+")";
       System.out.println(a[k+2]);
       for(int i =1;i<=k;i++){
           if(end<n){
               a[col] =" "+String.valueOf(col)+" ";
               col++;
               end++;
           }
       }
       if(end<n){
               a[col]=">>";
               col++;
           }
       for(int i =2;i>0;i--)
       {
           if(star>1){
               a[cal] =" "+String.valueOf(cal)+" ";
               cal++;
               star--;
           }
       }
       if(star>1){
               a[cal]="<< ";
               cal++;
           }
       
       for(int i =star;i<=k+5;i++)
       {
           System.out.print(a[i]);
       }
    }
}
