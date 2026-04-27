class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        for (int i = 1; i <= Math.sqrt(yellow); i++) {
            if (yellow % i == 0) {
                answer[0] = yellow / i;
                answer[1] = i;
                if (2 * (answer[0] + answer[1]) + 4 == brown) {
                    answer[0] += 2;
                    answer[1] += 2;
                    break;
                }
            }    
        }
        
        return answer;
    }
}