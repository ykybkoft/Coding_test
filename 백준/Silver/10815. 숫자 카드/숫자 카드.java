
import java.io.*;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        br.readLine();
        Set<String> set = new HashSet<>(Set.of(br.readLine().split(" ")));

        int cnt = Integer.parseInt(br.readLine());
        String[] list = br.readLine().split(" ");
        for (int i = 0; i < cnt ; i++) {
            if(set.add(list[i])){
                bw.write("0");
            }else{
                bw.write("1");
            }
            bw.write(" ");
        }

        bw.flush();





























    }
}