
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        for(int i =0; i<cnt;i++){
            String st = br.readLine();
            String result ="";
            for(int j=0; j< st.split(" ")[1].length(); j++){
                result+=String.valueOf(st.split(" ")[1].charAt(j)).repeat(Integer.parseInt(st.split(" ")[0]) )
                        ;
            }
            System.out.println(result);

        }















    }
}