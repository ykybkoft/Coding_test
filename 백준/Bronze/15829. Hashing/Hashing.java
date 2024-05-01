
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine()) ;
        String str = br.readLine();
        long result = 0;
        int idx = 0;
        for (char c : str.toCharArray()) {


            result += ((int)c-96)*(int)Math.pow(31,idx++);


        }

        System.out.println(result);


    }
}
