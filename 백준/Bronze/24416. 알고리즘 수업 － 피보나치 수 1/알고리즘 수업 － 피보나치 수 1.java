import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] dp;
    static int count1, count2;

    public static int fibo(int N) {
        
        if (N == 1 || N == 2) {
            return 1;
        } else {
            count1++;
            return fibo(N - 1) + fibo(N - 2);
        }
    }
    

    public static int fibona(int N) {
        
        dp[1] = 1;
        dp[2] = 1;
        if (dp[N] != 0) {
            count2++;
            return dp[N];
        } else {
            for (int i = 3; i < N+1; i++) {
                count2++;
                dp[N] = dp[N-1] + dp[N-2];
            }
            
            return dp[N];
        } 
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        dp = new int[n + 1];
        fibo(n);
        fibona(n);
        
        System.out.println(count1 + 1 + " " + count2);
    }
}