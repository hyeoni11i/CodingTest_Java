class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        int msLen = my_string.length();
        int osLen = overwrite_string.length();
        
        String frontMyStr = my_string.substring(0,s);
        String backMyStr = my_string.substring(s+osLen);
        
        if(msLen > osLen + s) {
            answer = frontMyStr.concat(overwrite_string).concat(backMyStr);
               
        } else {
            answer = frontMyStr.concat(overwrite_string);   
        }
        
        return answer;
    }
}