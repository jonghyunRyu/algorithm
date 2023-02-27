//백준 입출력과 사칙연산 3003번 문제
//체스 말 필요한 갯수 찾는 식을 세우는 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chess {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        // 입력받은 체스 말 갯수를 띄어쓰기에 따라 입력 받고 저장
        StringTokenizer st = new StringTokenizer(str, " ");
        int king = Integer.parseInt(st.nextToken());
        int queen = Integer.parseInt(st.nextToken());
        int rook = Integer.parseInt(st.nextToken());
        int bishop = Integer.parseInt(st.nextToken());
        int knight = Integer.parseInt(st.nextToken());
        int pawn = Integer.parseInt(st.nextToken());
        // 갯수를 구하여 출력
        System.out.println((1 - king) + " " + (1 - queen) + " " + (2 - rook) + " " + (2 - bishop) + " " + (2 - knight) + " " + (8 - pawn));
    }
}
