class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        int stLength = my_string.length();
        
        StringBuilder strBuilder = new StringBuilder();
        
        for(int i = 0; i < stLength; i++) {
            
            char my_char = my_string.charAt(i);
            
            for(int j = 0; j < n; j++) {
                strBuilder.append(my_char);
            }
            
        }
        
        answer = strBuilder.toString();
        
        return answer;
    }
}