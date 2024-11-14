import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        answer = Arrays.stream(arr).filter(n -> n%divisor==0).sorted().toArray();
        if(answer == null || answer.length == 0){
            answer = new int[]{-1};
        }
        return answer;
    }
}