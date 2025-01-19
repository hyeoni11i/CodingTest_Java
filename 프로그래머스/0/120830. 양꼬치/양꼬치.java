class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        int sheep = 12000;
        int drink = 2000;
        
        int discount = n/10;
        
        answer = (sheep * n) + (drink * k) - (drink * discount);
        
        return answer;
    }
}