import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int N, S;
	static int[] datas;
	static int totalCnt;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		datas = new int[N];
		
		int i = 0;
		while(st.hasMoreTokens()) {
			datas[i++] = Integer.parseInt(st.nextToken());
		}
		
		subset(0, 0);
		if (S == 0) {
			System.out.println(--totalCnt);
		} else {
			System.out.println(totalCnt);
		}
	}

	private static void subset(int cnt, int sum) {
		if (cnt == N) {
			if (sum == S) {
				totalCnt++;
			}
			
			return;
		}
		
		subset(cnt + 1, sum + datas[cnt]);
		subset(cnt + 1, sum);
	}
}