import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        answer = new int[num_list.length-5];
        Arrays.sort(num_list);
        for (int i = num_list.length-1; i >=5 ; i--) {
            answer[i-5] = num_list[i];
        }
        return answer;
    }
}