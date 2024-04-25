
import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int cnt = scan.nextInt();
		int result = 0;
		
		
		
		for(int i = 0; i< cnt ;i++) {
			String str = scan.next();
			int[] list = new int[26];
			for(int j=0;j<str.length();j++) {
				if(list[str.charAt(j)%97]==0) {
					list[str.charAt(j)%97] = j+1;
				}else if (list[str.charAt(j)%97]==j) {
					list[str.charAt(j)%97] = j+1;
				}else {
					result++;
					break;
				}
			}
			
			
		}
		
		System.out.println(cnt-result);
		
		
		
		
		
		
	}
}