class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        int stLength = my_string.length();
        
        char[] chArr = new char[stLength];
        
        for(int i = 0; i < stLength; i++) {
            chArr[(stLength-1)-i] = my_string.charAt(i);
        }
        
        answer = String.valueOf(chArr);
        
        return answer;
    }
}