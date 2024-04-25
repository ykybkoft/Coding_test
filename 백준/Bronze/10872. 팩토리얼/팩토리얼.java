
import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		long multiple = 1;
		
		while(num>0) {
			multiple*=num;
			num--;
		}
		
		System.out.println(multiple);
		
		
		
		
		
	
		
		
		
		
	}
}