class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        

        int cnt =0;
        for (int i = 0; i < finished.length ; i++) {
            cnt += finished[i] == true ? 0: 1 ;
        }
        answer = new String[cnt];

        cnt=0;
        for (int i = 0; i <finished.length ; i++) {
            if(finished[i] == false){
                answer[cnt] = todo_list[i];
                cnt++;
            }
        }

        return answer;
    }
}