class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cnt =0;

        for (String str : s.split("") ) {
            if(cnt==0){
                if(str.equals("(")){
                    cnt+=1;
                }else{
                    answer = false;
                    return answer;
                }
            }else{
                if(str.equals("(")){
                    cnt+=1;
                }else{
                    if(cnt==0){
                        answer=false;
                        return answer;
                    }else{
                        cnt-=1;
                    }
                }
            }
        }
        
        answer = cnt == 0 ? true : false;
        return answer;
    }
}