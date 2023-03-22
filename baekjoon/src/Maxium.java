//백준 2차원 배열 2566번 문제 난이도(브론즈3)
// 최댓값을 2차원에서 찾는 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Maxium {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] arr = new int[9][9];
        // 2차원 배열에 입력받아 저장
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int max = 0;
        int N = 0;
        int M = 0;
        // 최댓값, 행렬을 찾아 저장
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (max <= arr[i][j]) {
                    max = arr[i][j];
                    N = i+1;
                    M = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.print(N + " " + M);
    }
}
