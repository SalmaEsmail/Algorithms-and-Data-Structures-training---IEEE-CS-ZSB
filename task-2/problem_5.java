import java.util.Scanner;
 import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, m;
        n =input.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        m =input.nextInt();
        for(int i=0;i<m;i++){
       int x =input.nextInt();
       int y =input.nextInt();
       int rigth=arr[x-1]-y;
	    int left=y-1;
	if(x-1>=1){
		arr[x-2]+=left;
	}
	if(x+1<=n){
		arr[x]+=rigth;
	}
	arr[x-1]=0;
		
	}
	for(int i=0;i<n;i++){
		System.out.println(arr[i]);
	}
    }
}
	if(x-1>=1){
		arr[x-2]+=left;
	}
	if(x+1<=n){
		arr[x]+=rigth;
	}
	arr[x-1]=0;
		
	}
	for(int i=0;i<n;i++){
		System.out.println(arr[i]);
	}
    }
}
