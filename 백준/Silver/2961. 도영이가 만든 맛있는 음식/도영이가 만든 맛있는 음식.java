import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int N;
	static int min = Integer.MAX_VALUE;
	static int[] acid;
	static int[] acer;
	static boolean[] isSelected;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		acid = new int[N];
		acer = new int[N];
		isSelected = new boolean[N];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			acid[i] = Integer.parseInt(st.nextToken());
			acer[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(0, 1, 0, 0);
		System.out.println(min);
	}
	
	public static void dfs(int count, int calAcid, int calAcer, int selected) {
		if (count == N) {
			if (selected > 0) {
				min = Math.min(min, Math.abs(calAcid - calAcer));
			}
			return;
		}
		
		// 현재 재료 선택
		dfs(count + 1, calAcid * acid[count], calAcer + acer[count], selected + 1);
		// 현재 재료 선택 안 함
		dfs(count + 1, calAcid, calAcer, selected);
	}
}