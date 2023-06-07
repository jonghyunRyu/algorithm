// 백준 그리디 알고리즘 11047번 문제 난이도(실버4)
// 동전 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Coin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        int[] coin = new int[N]; // 동전의 가치를 오름차순으로 배열에 저장
        
        for (int i = 0; i < N; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        int max = 0;
        int count = 0;
        // 가치가 0이 될 때까지 반복문 실행
        while (K != 0) {
            // 오름차순으로 정렬되어 있기 때문에 맨 끝 인덱스부터 반복문 시작
            for (int i = coin.length - 1; i >= 0; i--) {

                if (coin[i] <= K) {
                    max = coin[i]; // 가치에 가장 근접한 동전의 값을 저장
                    count += K / max; // 최대로 낼 수 있는 동전 갯수를 카운트
                    K %= max; // 카운트하고 남은 나머지를 K에 저장
                    break;
                }
            }

        }

        System.out.println(count);
    }
}
