import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
         Scanner input= new Scanner(System.in);
         int num =input.nextInt();
        int [] arr= new int [num];
        int ser =0;
        int dima = 0;
        int e =n-1;
        int c =0;
        for(int i =0;i<=n-1;i++){
         arr[i]=s.nextInt();
        }
        for(int i =0;i<=num-1;i++){
            if(i % 2 ==0){
                if(arr[c]>arr[e]){
                ser = ser + a[c];
                c++;
            }
            else{ 
                ser = ser + arr[e];
                e--;
            }
            }
            else{
                
             if(arr[c]>arr[e]){
                dima = dima + a[c];
                c++;
            }
            else{
                dima = dima + arr[e];
                e--;
            }
            }
        }
        System.out.println(ser+" "+dima);
}
}
