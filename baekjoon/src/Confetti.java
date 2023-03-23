//백준 2차원 배열 2563번 문제 난이도 (실버5)
//2차원 배열을 활용하여 색종이로 평면을 덮인 넓이를 구하는 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Confetti {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        boolean[][] arr = new boolean[101][101]; //도화지 생성
        int count = 0; //한칸씩 넓이를 구함
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            // 가로 세로 10인 정사각형 만큼 반복
            for (int j = a; j < a+10; j++) { 
                for (int k = b; k < b+10; k++) {
                    if (arr[j][k]) { //겹치는 부분은 세지 않음
                        continue;
                    } else {
                        arr[j][k] = true;
                        count++;
                    }
                }
            }
        }
        // 색종이가 붙은 넓이 출력
        System.out.println(count);
    }
}
