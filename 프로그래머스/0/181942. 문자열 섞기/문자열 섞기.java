class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        int strLen = str1.length();
        
        for(int i=0; i<strLen; i++) {
            
            String oddStr = String.valueOf(str1.charAt(i));
            String evenStr = String.valueOf(str2.charAt(i));
            
            answer = answer.concat(oddStr).concat(evenStr);
        }
        
        return answer;
    }
}