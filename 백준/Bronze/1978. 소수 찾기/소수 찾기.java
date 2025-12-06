import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s," ");

        int count = 0;
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            boolean result = true;

            if (num == 1) {
                result = false;
            }

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    result = false;
                    break;
                }
            }

            if (result) {
                count++;
            }
        }
        System.out.println(count);
    }
}