class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cp = 0;
        int cy = 0;
        
        if(s.length()<= 50) {
            for (int i=0; i<s.length(); i++) {
                if (s.charAt(i) == 'p' || s.charAt(i) == 'P') cp++;
                else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') cy++;
            }
        }
        
        if (cp == cy) answer = true;
        else answer = false;
    
        return answer;
    }
}
