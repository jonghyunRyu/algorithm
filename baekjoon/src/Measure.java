// 백준 심화2 1037번 문제 난이도 (브론즈1)
// 약수가 1과 N을 제외하고 주어졌을 때 N을 찾는 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Measure {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        if (N > 1) { // 약수가 여러개 인 경우 가장 작은 약수와 가장 큰 약수의 곱이 N이 된다.
            System.out.println(arr[0] * arr[N-1]);
        } else { //약수의 개수가 1개인 경우는 그 약수의 제곱이 N이 된다.
            System.out.println(arr[0] * arr[0]);
        }
    }
}
