class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int aPb = Integer.parseInt(a + "" + b);
        int aCb = 2 * a * b;
        
        answer = (aCb > aPb) ? aCb : aPb;
        
        return answer;
    }
}