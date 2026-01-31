class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String binum = Integer.toBinaryString(n);
        int count = binum.length() - binum.replace("1", "").length();
        
        int num = n;
        int next_cnt = 0;
        while (answer == 0) {
            num++;
            String check = Integer.toBinaryString(num);
            next_cnt = check.length() - check.replace("1", "").length();
            if (count == next_cnt) {
                answer = num;
            }        
        }
        
        return answer;
    }
}