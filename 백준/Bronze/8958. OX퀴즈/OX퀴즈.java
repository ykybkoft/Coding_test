
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());


        for(int i =0; i<cnt;i++){
            String str = br.readLine();
            int num =1;
            int result=0;
            for (int j = 0; j <str.length() ; j++) {
                if(str.charAt(j)=='X'){
                    num=1;
                }else{
                    result+=num++;
                }
            }
            System.out.println(result);

        }




















    }
}