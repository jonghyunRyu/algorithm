//백준 1차원 배열 10811번 문제
//배열을 뒤집는 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Basket {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        // 바구니에 순서대로 값을 저장
        for (int i = 0; i < N; i++) {
            arr[i] = i+1;
        }
        // 바구니 번호를 입력받고 a번 바구니부터 b번 바구니까지 배열을 뒤짚음
        for (int j = 0; j < M; j++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for (int k = 0; k < (b-a+1)/2; k++) { //배열 길이의 반절만큼 반복
                int temp = arr[a+k-1]; // 나중에 바뀔 배열의 값을 미리 저장해둠
                arr[a+k-1] = arr[b-k-1]; //앞의 바구니와 뒤 바구니를 순서대로 교환
                arr[b-k-1] = temp;
            }
        }
        // 바뀐 바구니 배열 출력
        for (int z = 0; z < N; z++) {
            System.out.print(arr[z]+" ");
        }
    }
}
