
import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		String rev="";
		
		
		for(int i =str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		
		if(rev.equals(str)) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
		
	
		
		
		
		
	}
}