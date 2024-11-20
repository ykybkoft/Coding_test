import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;

        int[] min = new int[sizes.length];
        int[] max = new int[sizes.length];
        
        for (int i = 0; i <sizes.length ; i++) {
            min[i] = sizes[i][0]>sizes[i][1] ? sizes[i][1] : sizes[i][0];
            max[i] = sizes[i][0]>sizes[i][1] ? sizes[i][0] : sizes[i][1];
        }
        
        answer = Arrays.stream(min).max().getAsInt() * Arrays.stream(max).max().getAsInt();
        
        return answer;
    }
}