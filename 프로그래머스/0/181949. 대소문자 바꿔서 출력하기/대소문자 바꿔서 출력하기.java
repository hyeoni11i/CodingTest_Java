import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        int aLen = a.length(); 
        
        StringBuilder newA = new StringBuilder("");
        
        for(int i = 0; i < aLen; i++) {
            char aCh = a.charAt(i);
            
            if(Character.isUpperCase(aCh)) {
               aCh = Character.toLowerCase(aCh);
                
            } else {
                aCh = Character.toUpperCase(aCh);
            }
            
            newA.append(aCh);
        }
        
        System.out.println(newA);
    }
}