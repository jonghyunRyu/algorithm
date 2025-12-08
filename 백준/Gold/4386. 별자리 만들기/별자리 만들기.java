import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	
	static double getW(double x1, double y1, double x2, double y2) {
		
		double xCal = Math.pow(Math.abs(x2 - x1), 2);
		double yCal = Math.pow(Math.abs(y2 - y1), 2);
		
		return Math.sqrt(xCal + yCal);
	}
	
	static class Edge implements Comparable<Edge> {

		int f, t; 
		double w;
		
		public Edge(int f, int t, double w) {
			this.f = f;
			this.t = t;
			this.w = w;
		}
		
		@Override
		public int compareTo(Edge o) {
			return Double.compare(this.w, o.w);
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		double[] x = new double[n];
		double[] y = new double[n];
		double[][] arr = new double[n][n];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			x[i] = Double.parseDouble(st.nextToken());
			y[i] = Double.parseDouble(st.nextToken());
		}
		
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				arr[i][j] = arr[j][i] = getW(x[i], y[i], x[j], y[j]);
			}
		}
		
		boolean[] visited = new boolean[n];
		PriorityQueue<Edge> pq = new PriorityQueue();
		pq.offer(new Edge(0, 0, 0.0));
		
		double result = 0;
		int pickCnt = 0;
		while(!pq.isEmpty()) {
			Edge  e = pq.poll();
			if (visited[e.t]) continue;
			visited[e.t] = true;
			
			// 하고 싶은 일
			result += e.w;
			if (++pickCnt == n) break;
			// 다음 후보 정점 뽑기
			for (int nt = 0; nt < n; nt++) {
				if (!visited[nt] && arr[e.t][nt] != 0.0) {
					pq.offer(new Edge(e.t, nt, arr[e.t][nt]));
				}
			}
		}
		
		System.out.println(Math.round(result * 100) / 100.0);
	}
}