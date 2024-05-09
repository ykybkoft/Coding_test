
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toUpperCase();

        int[] arr =new int[26];
        
        for(char c : str.toCharArray()){
            arr[(int)c%65]++;
            
        }
        int max_idx=0;
        int max=0;
        boolean same = false;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
                max_idx= i;
                same=false;
            }else if (max==arr[i]){
                same=true;
            }
        }

        if(same==true){
            System.out.println("?");
        }else{
            System.out.println((char)(max_idx+65));
        }




























    }
}