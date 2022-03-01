import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int num =input.nextInt();
        int in =0;
        int [] arr= new int [num];
      
        for(int i =0;i<=num-1;i++){
         arr[i]=input.nextInt();
        }
        Arrays.sort(arr);
        for(int i =0;i<=num-1;i++){
            if(n==1)
            {
                if(arr[0]!=0)
                    in++;
                break;
            }
         if(arr[i]==0 && arr[num-1]==0)
             break;
         
         if(arr[i]==arr[num-1]){
             in++;
             break;
         }
         if(i !=nnum-1&& arr[i] !=0&&arr[i]!=arr[i+1])
             in++;
         if(i==num-1 &&arr[num-1] != arr[num-2])
             in++;
        }
       
        System.out.println(in);
}
}
