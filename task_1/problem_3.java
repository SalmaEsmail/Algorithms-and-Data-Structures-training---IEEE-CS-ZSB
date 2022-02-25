import java.io.IOException;
 import java.util.*;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        String repeat = "";
        for (int i = 0; i < n; i++) {
            repeat = repeat + "a";
        }
        System.out.println("Feliz "+repeat+"l!");
 
    }
 
}
