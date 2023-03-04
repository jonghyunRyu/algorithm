//백준 1차원 배열 5597번 문제
//30개의 배열값중 2개의 배열 값을 찾아내는 문제 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[30];
        // 입력받은 값의 인덱스에 1을 저장
        for (int i = 0; i < 28; i++) {
            arr[Integer.parseInt(br.readLine())-1] = 1;
        }
        // 1이 아니면 출력
        for (int j = 0; j < 30; j++) {
            if (arr[j] == 0) {
                System.out.println(j+1);
            }
        }
    }
}
