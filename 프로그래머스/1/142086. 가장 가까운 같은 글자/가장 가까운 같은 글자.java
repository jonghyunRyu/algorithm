class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] alpha = new int[26];
        
        for (int i = 0; i < 26; i++) {
            alpha[i] = -2;    
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (alpha[s.charAt(i) - 97] == -2) {
                answer[i] = -1;
                alpha[s.charAt(i) - 97] = i;
            } else {
                answer[i] = i - alpha[s.charAt(i) - 97];
                alpha[s.charAt(i) - 97] = i;
            }
        }
        
        return answer;
    }
}