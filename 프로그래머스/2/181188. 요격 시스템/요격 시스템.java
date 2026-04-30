import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        int[][] x = new int[targets.length][2];
        
        for (int i = 0; i < targets.length; i++) {
            x[i][0] = targets[i][0];
            x[i][1] = targets[i][1];
        }
        
        Arrays.sort(x, new Comparator<int[]>() {
            
            public int compare(int[] o1, int[] o2) {
                
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                } 
                
                return o1[1] - o2[1];
            }
        });
        
        int end = 0;
        
        for (int i = 0; i < x.length; i++) {
            if (end <= x[i][0]) {
                end = x[i][1];
                answer++;
            }
        }
        
        return answer;
    }
}