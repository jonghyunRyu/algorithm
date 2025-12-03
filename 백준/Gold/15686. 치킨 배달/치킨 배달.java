import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	
	static int N, M;
	static int[][] map;
	static List<int[]> chicken = new ArrayList();
	static List<int[]> house = new ArrayList();
	static int min = Integer.MAX_VALUE;
	static boolean[] isSelected;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < N; j++) {
				int check = Integer.parseInt(st.nextToken());
				map[i][j] = check;
				
				if (check == 1) {
					house.add(new int[]{i, j});
				} else if (check == 2) {
					chicken.add(new int[] {i, j});
				}
			}
		}
		
		isSelected = new boolean[chicken.size()];
		combination(0, 0);
		
		System.out.println(min);
	}
	
	static void combination(int start, int count) {
		if (count == M) {
			calCityDistance();
			return;
		}
		
		for (int i = start; i < chicken.size(); i++) {
			isSelected[i] = true;
			combination(i + 1, count + 1);
			isSelected[i] = false;
		}
	}
	
	static void calCityDistance() {
		int sum = 0;
		
		for (int[] h : house) {
			int hx = h[0];
			int hy = h[1];
			int dist = Integer.MAX_VALUE;
			
			for (int i = 0; i < chicken.size(); i++) {
				if (isSelected[i]) {
					int cx = chicken.get(i)[0];
					int cy = chicken.get(i)[1];
					int d = Math.abs(hx - cx) + Math.abs(hy - cy);
					dist = Math.min(dist, d);
				}
			}
			
			sum += dist;
			if (sum >= min) return;
		}
		
		min = Math.min(min, sum);
	}
}