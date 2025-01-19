class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        
        double numLen = numbers.length;
        
        int sum = 0;
        
        for(int i=0; i<numLen; i++) {
            sum += numbers[i];
        }
        
        answer = sum / numLen;
        
        return answer;
    }
}