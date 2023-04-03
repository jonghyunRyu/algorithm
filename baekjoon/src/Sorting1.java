//백준 정렬 문제 난이도 (브론즈2)
//입력 받은 수를 오름차순으로 정렬하는 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Sorting1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N]; // 입력 받은 수를 배열에 저장
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr); // Arrays클래스를 사용, 오름차순으로 정렬함
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]); // 오름차순으로 정렬된 배열 순서대로 출력
        }
    }
}
