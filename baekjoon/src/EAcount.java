//백준 1차원 배열 10807번 문제
//배열을 입력받고 v를 찾는 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EAcount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N]; //N크기의 배열 선언
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(br.readLine());
        int count = 0;
        // 배열값과 v를 비교하여 갯수 카운트
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] == v) {
                count++;
            }
        }

        System.out.println(count);
    }
}
