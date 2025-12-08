import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] side = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
            if (side[0] == 0 && side[1] == 0 && side[2] == 0) {
                break;
            }
            Arrays.sort(side);
            if (side[0]*side[0] + side[1]*side[1] == side[2]*side[2]) {
                sb.append("right").append('\n');
            } else {
                sb.append("wrong").append('\n');
            }
        }
        System.out.println(sb);
    }
}