class Solution {
    public int[] solution(int[] arr, int[][] queries) {
         int[] answer = {};
        answer = new int[queries.length];
        for (int i = 0; i < queries.length ; i++) {
            for (int j = queries[i][0]; j <= queries[i][1] ; j++) {
                if(queries[i][2]<arr[j]){

                    answer[i] = answer[i]==0 ? arr[j]: (answer[i] < arr[j]?answer[i]:arr[j]);

                }
            }
            answer[i] = answer[i]==0 ? -1 : answer[i];
        }
        return answer;
    }
}