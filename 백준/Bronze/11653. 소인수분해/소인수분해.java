import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int fN = N; // fN에 첫 입력값 N저장
        int num = 2;
        // num으로 나눠질 경우 반복해서 출력
        for (int i = 0; num <= Math.sqrt(fN); i++) {
            if (N % num == 0) {
                System.out.println(num);
                N = N/num;
            } else if (N == 1){ // 1이 되면 종료
                break;
            } else {
                num++;
            }
        }
        if (N != 1) {
            System.out.println(N);
        }
    }
}