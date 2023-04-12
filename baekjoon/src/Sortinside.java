// 백준 정렬 알고리즘 1427번 문제 난이도 (실버5)
// 수를 입력 받고 자리수를 내림차순으로 재배열하는 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sortinside {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine(); // 숫자를 문자열로 입력 받음
        String[] arr = s.split(""); // 문자 한 개 단위로 잘라서 배열에 저장

        Arrays.sort(arr); // 오름차순 정렬
        // 내림차순 출력을 위해 맨 뒤 인덱스부터 출력
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
