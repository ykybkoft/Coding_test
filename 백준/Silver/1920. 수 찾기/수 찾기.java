

import java.io.*;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        br.readLine();

        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        br.readLine();
        int[] arr2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i <arr.length ; i++) {
            set.add(arr[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            if(set.contains(arr2[i])){
                bw.write("1\n");
            }else{
                bw.write("0\n");
            }
        }

        bw.flush();
























    }
}