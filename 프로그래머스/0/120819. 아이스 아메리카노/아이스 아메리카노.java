class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        
        int americanoPrice = 5500;
        
        int cup = 0;
        
        int change = 0;
        
        while(americanoPrice <= money) {
            money -= americanoPrice;
            
            cup++;
        }
        change = money;
        
        answer[0] = cup;
        answer[1] = change;
        
        return answer;
    }
}