
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long up = scan.nextLong();
        long down = scan.nextLong();
        long height = scan.nextLong();
        int result = 0;

        result+=height/(up-down);

        if((height % (up-down) + (up-down)) <= up){
            result -= up / (up-down);
            result += 1;
        }
        else if(height % (up-down) == 0) {

        }
        else {
            result += 1;

        }

        System.out.println(result);














    }
}