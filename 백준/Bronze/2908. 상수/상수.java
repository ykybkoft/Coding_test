
import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		char[] str = scan.nextLine().toCharArray();
		
		String n1=String.valueOf(str[2])+String.valueOf(str[1])+String.valueOf(str[0]);
		String n2=String.valueOf(str[6])+String.valueOf(str[5])+String.valueOf(str[4]);
		
		
		String result = Integer.parseInt(n1)>Integer.parseInt(n2) ? n1: n2;
		
		
		System.out.println(result);
		
		
		
		
		
		
	}
}