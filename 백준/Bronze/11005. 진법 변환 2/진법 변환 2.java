import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int i = 1;
        int count = 1;
        while (N / i >= B) {
            i *= B;
            count++;
        }

        char[] ch = new char[count];
        int num = N;
        for (int j = 0; j < count; j++) {
            if (num % B > 9) {
                ch[j] = (char)(num % B + '7');
                num /= B;
            } else {
                ch[j] = (char)(num % B + '0');
                num /= B;
            }
        }

        for (int j = count-1; j >= 0; j--) {
            System.out.print(ch[j]);
        }
    }
}