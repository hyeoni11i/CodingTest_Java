class Solution {
    public int[] solution(int[] num_list) {
        
        int numLength = num_list.length; 
        
        int[] answer = new int[numLength];
        
        for(int i = 0; i < numLength; i++) {
            answer[i] = num_list[(numLength-1)-i];
        }
        
        return answer;
    }
}