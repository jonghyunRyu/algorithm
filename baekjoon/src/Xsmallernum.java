//백준 1차원 배열 10871번 문제
//배열을 입력받고 x보다 작은 수를 찾는 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Xsmallernum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //첫째줄에 입력받은 값을 각각 N과 X에 저장
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        int[] arr = new int[N]; //N크기의 배열 선언
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        //st2의 값을 순서대로 배열에 저장한 뒤 x와 비교하여 더 작은 값은 sb에 저장
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
            if (arr[i] < X) {
                sb.append(arr[i]+" ");
            }
        }
        System.out.println(sb);
    }
}
