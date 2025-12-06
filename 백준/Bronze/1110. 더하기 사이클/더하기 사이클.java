import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int num = N;
		int sum = 0;
		
		while (num != N || sum == 0) {
			int X = N/10 + N%10;
			N = (N%10)*10 + X%10;
				sum ++;
		}
		System.out.println(sum);
	}
}