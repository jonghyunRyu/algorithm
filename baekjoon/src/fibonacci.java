// 백준 동적 프로그래밍 알고리즘 24416번 문제 난이도 (브론즈1)
// 피보나치 수열 재귀와 dp 비교
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibonacci {

    static int[] dp;
    static int count1, count2;
    // 재귀를 이용한 피보나치 수열
    public static int fibo(int N) { 
        
        if (N == 1 || N == 2) {
            count1++;   // fibo()함수가 실행될때마다 카운트
            return 1;
        } else {
            return fibo(N - 1) + fibo(N - 2);
        }
    }
    // dp를 이용한 피보나치 수열
    public static int fibona(int N) {
        
        dp[1] = 1;
        dp[2] = 1;
        if (dp[N] != 0) {
            count2++;   //N이 1이거나 2일 경우 카운트가 1이 됨.
            return dp[N];
        } else {
            for (int i = 3; i < N+1; i++) {
                count2++; //N이 3이상일 경우 fibona()함수가 실행될 때마다 카운트
                dp[N] = dp[N-1] + dp[N-2];
            }
            
            return dp[N];
        } 
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        dp = new int[n + 1];
        fibo(n); //재귀
        fibona(n); //dp
        // 재귀함수 실행횟수, 공백, dp함수 실행횟수 출력
        System.out.println(count1 + " " + count2);
    }
}
