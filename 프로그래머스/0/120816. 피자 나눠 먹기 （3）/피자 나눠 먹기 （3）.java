class Solution {
    public int solution(int slice, int n) {
        int pizza = 1;
        
        while(true) {
            int pizzaPiece = slice * pizza;
            
            if(n <= pizzaPiece) {
                break;
                
            } else {
                pizza++;
            }
            
        }
        
        return pizza;
    }
}