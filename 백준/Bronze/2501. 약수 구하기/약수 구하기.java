import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int count = 0;
        int num = 1;
        int result = 0;

        while (true) {
            if (N % num == 0) {
                count++;
                result = num;
            }
            if (count == K || num >= N) {
                break;
            }
            num++; 
        }

        if (count < K) {
            System.out.println(0);
        } else {
            System.out.println(result);
        }
    }
}