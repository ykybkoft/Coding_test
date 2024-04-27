
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long num = scan.nextLong()-1;

        int n =1;
        while(num>0){
            num-=n*6;
            n++;
        }

        System.out.println(n);













    }
}