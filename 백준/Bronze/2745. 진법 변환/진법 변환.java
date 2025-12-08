import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String str = st.nextToken();
        int n = Integer.parseInt(st.nextToken());
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((int)str.charAt(i) > 57) {
                num += (int)(str.charAt(i) - 55) * Math.pow(n, str.length()-i-1);
            } else {
                num += (int)(str.charAt(i) - 48) * Math.pow(n, str.length()-i-1);
            }
        }
        System.out.println(num);
    }
}