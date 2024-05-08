import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int cnt =0;
        int tmp = num;

        do {
            if(tmp>9){
                tmp=(tmp/10+tmp%10)%10+(tmp%10)*10;
                
            }else{
                tmp=tmp*11;
            }
            cnt++;
        }while (tmp!=num);

        System.out.println(cnt);


























    }
}