import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int count = 0;
        int[] arr = new int[42];
        for (int i = 0; i < 10; i++) {
            arr[Integer.parseInt(br.readLine()) % 42] = 1;
        }

        for (int j = 0; j < 42; j++) {
            if (arr[j] == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}