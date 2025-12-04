import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static boolean[][] cb;
    public static int min = 64;

    public static void findmin(int x, int y) {
        int row = x + 8;
        int col = y + 8;
        int count = 0;

        boolean check = cb[x][y];
        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if (check != cb[i][j]) {
                    count++;
                }
                check = (!check);
            }
            check = !check;
        }

        count = Math.min(count, 64 - count);
        min = Math.min(min, count);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        cb = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String chess = br.readLine();
            for (int j = 0; j < M; j++) {
                if (chess.charAt(j) == 'W') {
                    cb[i][j] = true;  // W일 때 true
                } else {
                    cb[i][j] = false; // B일 때 false
                }
            }
        }

        int N_row = N - 7;
        int M_col = M - 7;
        for (int i = 0; i < N-7; i++) {
            for (int j = 0; j < M-7; j++) {
                findmin(i, j);
            }
        }

        System.out.println(min);
    }
}