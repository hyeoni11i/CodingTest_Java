class Solution {
    public int solution(int n) {
        int pizza = 1;
        int pizzaPiece = 6;
        
        while(true) {
            int totalPiece = pizzaPiece * pizza;
            
            int sixMultiple = totalPiece % n;
            
            if(sixMultiple == 0) {
                break;
                
            } else {
                pizza++;
            }
            
        }
        
        return pizza;
    }
}