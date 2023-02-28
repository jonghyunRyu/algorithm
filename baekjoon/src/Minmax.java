//백준 1차원 배열 10818번 문제
//최솟값과 최댓값을 찾는 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Minmax {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = Integer.parseInt(st.nextToken()); //첫 번째 값을 min과 max에 저장
        int max = min;
        
        for (int i = 1; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] < min) { // 저장해둔 값과 비교 후 작은 값 저장
                min = arr[i];
            } else if (arr[i] > max) { // 비교 후 큰 값 저장
                max = arr[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
