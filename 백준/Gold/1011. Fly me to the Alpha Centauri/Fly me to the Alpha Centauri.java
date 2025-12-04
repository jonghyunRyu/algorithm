import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i=0; i < T; i++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int distance = y - x;
            int count = (int)Math.sqrt(distance);
            
            if (count == Math.sqrt(distance)) {
                sb.append(count * 2 - 1  + "\n");
            } else if (distance - count * count <= count) {
                sb.append(count * 2 + "\n");
            } else {
                sb.append(count * 2 + 1 + "\n");
            }
        }
        System.out.println(sb);
    }
}