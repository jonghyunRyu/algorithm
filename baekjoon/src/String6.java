//백준 문자열 10809번 문제
//한 단어에서 각 알파벳이 처음 등장하는 위치를 찾는 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class String6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int[] alpha = new int[26];
        Arrays.fill(alpha, -1); // 모든 배열에 -1 저장
        for (int i = str.length()-1; i >= 0; i--) { // 배열의 끝부터 값을 저장(처음 등장하는 위치를 저장해야되기 때문)
            alpha[str.charAt(i)-97] = i; // 알파벳 순서를 인덱스에 저장하고 문자 등장하는 위치를 저장
        }

        for (int i = 0; i < alpha.length; i++) {
            System.out.print(alpha[i]+" ");
        }
    }
}
