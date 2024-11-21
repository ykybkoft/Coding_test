class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int large = (a > b ? a : b);
        int small = (a<b ? a: b);
        for (int i=small; i<large+1;i++){
            answer+=i;
        }
        return answer;
    }
}