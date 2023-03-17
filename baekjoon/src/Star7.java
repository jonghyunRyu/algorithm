//백준 심화1 2444번 문제
//별 찍기 - 7
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Star7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            for (int j = i; j < N; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i*2-1; k++) {
                System.out.print("*");
            }
            System.out.println();   
        }

        for (int i = N-1; i > 0; i--) {
            for (int j = i; j < N; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i*2-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
