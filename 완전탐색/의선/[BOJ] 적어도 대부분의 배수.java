
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i=0; i<5; i++) {
			arr[i] = sc.nextInt();
		}
		

		for(int i=1; i<=100000000; i++) { 
			
			int cnt = 0;
			
            
			if(i % arr[0] == 0) cnt++;
			if(i % arr[1] == 0) cnt++;
			if(i % arr[2] == 0) cnt++;
			if(i % arr[3] == 0) cnt++;
			if(i % arr[4] == 0) cnt++;
			
			
			if(cnt >= 3) {
				System.out.println(i); 
				break; 
			}
		}
        
        
	}
}