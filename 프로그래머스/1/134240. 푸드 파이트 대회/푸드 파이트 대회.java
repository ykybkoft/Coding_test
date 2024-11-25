class Solution {
    public String solution(int[] food) {
        String answer = "";
        String[] cal = {"0","1","2","3","4","5","6","7","8"};
        for (int i = 1; i <food.length ; i++) {
            answer += cal[i].repeat(food[i]/2);
        }
        answer += "0";
        for (int i = food.length-1; i >0 ; i--) {
            answer += cal[i].repeat(food[i]/2);
        }
        return answer;
    }
}