//백준 1차원 배열 3052번 문제
//배열을 활용하여 서로 다른 값의 개수를 찾는 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Remainer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int count = 0;
        int[] arr = new int[42];
        // 나머지 값을 인덱스에 넣어 1을 저장
        for (int i = 0; i < 10; i++) {
            arr[Integer.parseInt(br.readLine()) % 42] = 1;
        }
        // 배열 전체를 확인하여 1의 개수를 카운트
        for (int j = 0; j < 42; j++) {
            if (arr[j] == 1) {
                count++;
            }
        }
        // 서로 다른 나머지 개수 출력
        System.out.println(count);
    }
}
