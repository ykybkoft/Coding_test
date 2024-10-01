import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int answer = 0;
        for (int i = 0; i < cnt; i++) {
            int n = Integer.parseInt(st.nextToken());
            if(n==1){
                continue;
            }else if(n==2|| n==3){
                answer++;
                continue;
            }
            for (int j = 2; j <= (int)Math.sqrt(n) ; j++) {
                if (n % j == 0) {
                    answer--;
                    break;
                }
            }
            answer++;
        }

        System.out.println(answer);
    }
}
