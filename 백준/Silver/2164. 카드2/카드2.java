
import java.util.LinkedList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<>();
        int cnt = scan.nextInt();

        for (int i = cnt; i >0 ; i--) {
            list.add(i);
        }

        while(list.size()!=1){
            list.pollLast();
            list.addFirst(list.pollLast());
        }

        System.out.println(list.getFirst());

    }
}
