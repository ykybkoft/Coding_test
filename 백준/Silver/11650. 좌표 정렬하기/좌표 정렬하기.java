

import java.util.Arrays;
import java.util.Comparator;

import java.util.Scanner;




public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		
		int cnt = scan.nextInt();
		
		int[][] arr = new int[cnt][2];
		
		
		for(int i =0;i<cnt ;i++) {
			arr[i]= new int[] {scan.nextInt(),scan.nextInt()};
			
		}
		
		
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[0]==o2[0]? o1[1]-o2[1]:o1[0]-o2[0];
			}
		
		
		}
		);
		
		
		for(int i =0;i<cnt ;i++) {
			System.out.println(arr[i][0]+" "+arr[i][1]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}