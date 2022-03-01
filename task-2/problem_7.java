import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[1001000];
        int t, a; 
         max = 0;
         cnt = 0;
        t = input.nextInt();
        for (int i = 0; i < 2 * t; i++) {
            a = input.nextInt();
            arr[a]++;
            if (arr[a] == 2) {
                cnt--;
            } else {
                cnt++;
            }
            max = max > cnt ? max : cnt;
        }
        System.out.println(max);
    }
}
