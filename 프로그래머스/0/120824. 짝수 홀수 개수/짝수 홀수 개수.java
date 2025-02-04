class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        
        int numLength = num_list.length;
        
        int evenCnt = 0;
        int oddCnt = 0;
        
        for(int i = 0; i < numLength; i++) {
            
            int remain = num_list[i] % 2;
            
            if(remain == 0) {
                evenCnt++;
                
            } else {
                oddCnt++;
            }
            
        }
        
        answer[0] = evenCnt;
        answer[1] = oddCnt;
        
        return answer;
    }
}