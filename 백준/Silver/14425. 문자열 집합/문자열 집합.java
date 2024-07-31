
import java.io.*;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] cnt=br.readLine().split(" ");
        Set<String> set = new HashSet<>();

        int result =0;
        for (int i = 0; i < Integer.parseInt(cnt[0]) ; i++) {
            set.add(br.readLine());
        }

        for (int i = 0; i <Integer.parseInt(cnt[1]) ; i++) {
            if(set.contains(br.readLine())){
                result+=1;
            }
        }
        System.out.println(result);





























    }
}