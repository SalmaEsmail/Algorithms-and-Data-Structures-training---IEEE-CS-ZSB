import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        int [][] a= new int [5][5];
        int re =0;
        for(int i =0;i<=a.length-1;i++){
            for(int k =0;k<=a[i].length-1;k++){
                a[i][k] =s.nextInt();
        }
       
          
           int n = s.nextInt();
   
    int past = 0;
    int min = 1200;
    int max = 0;
    int count = 0;
    for (int i = 0; i < n; i++)
    {
        int x =s.nextInt();
        if (!i)
        {
            min = x;
            max = min;
        }
        else
        {

            if (x > max)
            {
                max = x;
                ++count;
            }
            else if (x < min)
            {
                ++count;
                min = x;
            }
        }
    }
    System.out.println(count);

}
}
