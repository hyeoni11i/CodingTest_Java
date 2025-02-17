class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int aB = Integer.parseInt(a + "" + b);
        int bA = Integer.parseInt(b + "" + a);
        
        answer = (aB > bA) ? aB : bA;
        
        return answer;
    }
}