import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        int small = n1 < n2 ? n1 : n2;
        int large = n1 < n2 ? n2 : n1;

        if(small == large){
            System.out.println(small);
            System.out.println(small);
            return;
        }

        while(large > 0){
            int tmp = large;
            large = small%large;
            small = tmp;
        }
        System.out.println(small);
        System.out.println(n1*n2/small);



        



    }
}
