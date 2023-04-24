//백준 심화1 10812번 문제 난이도 (브론즈2)
//자바 클래스와 메서드를 잘 이용할 줄 알아야겠다고 생각이 드는 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Basketch {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = i+1;
        }
        
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            int c = Integer.parseInt(st.nextToken()) - 1;
            
            int[] temp = Arrays.copyOfRange(arr, a, c); // arr배열의 a인덱스부터 c인덱스까지 잘라서 배열을 저장
            int num = 0;
            for (int j = a; j <= b; j++) {
                if (b >= c) { //mid값부터 end값까지 앞쪽으로 옮김
                    arr[j] = arr[c++];
                } else { //저장해두었던 begin부터 mid까지의 값을 뒤로 옮김
                    arr[j] = temp[num++]; 
                }
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
