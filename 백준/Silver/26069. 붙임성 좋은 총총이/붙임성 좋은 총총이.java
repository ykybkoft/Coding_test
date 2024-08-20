
import java.io.*;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();
        set.add("ChongChong");

        for (int i = 0; i <cnt ; i++) {
            String[] arr = br.readLine().split(" ");

            if(set.contains(arr[0]) || set.contains(arr[1]) ){
                set.add(arr[0]);
                set.add(arr[1]);
            }

        }
        System.out.println(set.size());





















    }
}