
import java.io.*;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int size = Integer.parseInt(arr[0]);
        int n = Integer.parseInt(arr[1]);

        arr = new String[size];
        arr= br.readLine().split(" ");
        int[] nums = new int[size];

        for (int i = 0; i <size ; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }

        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < size-2 ; i++) {
            for (int j = i+1; j <size-1; j++) {
                for (int k =j+1; k <size ; k++) {
                    int tmp = nums[i]+nums[j]+nums[k];
                    if(n -tmp >= 0 ){
                        set.add(tmp);
                    }
                }
            }
        }

        System.out.println(set.pollLast());
























    }
}