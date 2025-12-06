import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		int[] score = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<N; i++) {
			score[i] = Integer.parseInt(st.nextToken()); 
		}
		
		Arrays.sort(score);
		double max = score[score.length-1];
		double sum = 0;
		double ave = 0;
		
		for (int i=0; i<N; i++) {
			double sc = (score[i] / max) * 100;
			sum += sc;
		}
		
		ave = sum / N;
		System.out.println(ave);
	}
}