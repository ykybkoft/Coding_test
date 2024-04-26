
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str="";
		
		while(!(str = br.readLine()).equals("0") ) {
			String rev ="";
			
			for(int i =str.length()-1; i>=0;i--) {
				rev+=str.charAt(i);
			}
			
			System.out.println((rev.equals(str)?"yes":"no"));
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}