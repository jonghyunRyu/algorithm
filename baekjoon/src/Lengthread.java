//백준 2차원 배열 10798번 문제 난이도 (브론즈1)
//문자열의 배열을 다루는 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lengthread {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[5][15]; //문자 2차원 배열 생성
        // 배열들을 입력받아 한 문자씩 저장
        for (int i = 0; i < 5; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }
        }
        // 배열을 00 10 20 30 ~ 순으로 출력 배열이 비어있으면 넘기도록 함.
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[j][i] != '\0') { //char배열의 초기값은 '\0'이다.
                    System.out.print(arr[j][i]);
                } else {
                    continue;
                }
            }
        }
    }
}
