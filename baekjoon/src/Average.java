//백준 1차원 배열 1546번 문제
//평균을 조작하는 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Average {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 실수계산을 해야되기 때문에 double 배열 생성
        double arr[] = new double[Integer.parseInt(br.readLine())];
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 배열에 입력받은 점수 저장
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
        }

        double sum = 0;
        Arrays.sort(arr); //배열 정렬 오름차순

        for (int i = 0; i < arr.length; i++) {
            sum += (arr[i] / arr[arr.length-1] * 100); //가장 높은 점수로 나눠서 *100
        }
        // 결과 출력
        System.out.println(sum / arr.length);
    }
}
