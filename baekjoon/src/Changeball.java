//백준 1차원 배열 10813번 문제
//배열에 값을 교환하는 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Changeball {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        // 배열에 값을 넣어줌 0 ~ N-1까지 순서대로 1 ~ N까지 
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i+1;
        }
        // 입력을 M번 받음
        for (int j = 0; j < M; j++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = arr[a-1]; // a-1인덱스 값을 c에 저장
            // c에 값을 저장해두지 않으면 변경된 값을 다시 집어 넣게 되는 결과가 됨.
            arr[a-1] = arr[b-1];
            arr[b-1] = c; 
        }
        // arr배열의 값을 출력
        for (int k = 0; k < N; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
