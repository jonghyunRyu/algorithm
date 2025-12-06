import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 최댓값 백준 2562번 문제풀이 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] N = new int[9];
		int i;
		int Max = 0;
		int T = 0;
		for (i=0; i<N.length; i++) {
			N[i] = Integer.parseInt(br.readLine());
			if (Max < N[i]) {
				Max = N[i];
				T = i+1;
			}
		}
		System.out.println(Max);	
		System.out.println(T);	
	}
}