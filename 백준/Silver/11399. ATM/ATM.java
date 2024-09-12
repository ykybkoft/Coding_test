

import java.io.*;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        br.readLine();

        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(arr);

        int answer = 0;

        for (int i = 0; i < arr.length ; i++) {
            answer += arr[i]*(arr.length-i);
        }

        System.out.println(answer);

























    }
}