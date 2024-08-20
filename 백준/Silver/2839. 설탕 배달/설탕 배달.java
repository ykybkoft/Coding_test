
import java.io.*;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int five = n/5;


        while(five >= 0){
            int tmp = n;
            int result = 0;
            tmp-=five*5;
            if(tmp%3==0){
                result+=five;
                result+=tmp/3;
                System.out.println(result);
                return;
            }
            five--;
        }

        System.out.println(-1);























    }
}