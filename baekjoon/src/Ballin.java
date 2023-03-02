//백준 1차원 배열 10810번 문제
//배열에 값을 쓰는 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ballin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N]; //배열 선언

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            // 배열 a-1인덱스부터 b까지 c를 저장.
            for (int j = a-1; j < b; j++) {
                arr[j] = c;
            }
        }
        // 배열출력
        for (int k = 0; k < N; k++) {
            System.out.print(arr[k]+" ");
        }
    }
}
