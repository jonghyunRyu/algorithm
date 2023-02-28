//백준 1차원 배열 2562번 문제
//최댓값이 어디에 있는지 찾는 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Maximum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 배열 선언
        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        int max = 0; // 최댓값 저장
        int num = 0; // 최댓값 위치저장
        // 최댓값 찾는 for문
        for (int i = 0; i < 9; i++) {
            if (arr[i] > max) {
                max = arr[i];
                num = i+1; //인덱스가 0부터 시작이라서 +1
            } 
        }

        System.out.println(max);
        System.out.println(num);
    }
}
