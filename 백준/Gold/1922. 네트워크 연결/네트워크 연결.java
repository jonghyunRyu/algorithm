import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 프림 버전
public class Main {
	
	static int N, M;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine()); 
		
		StringTokenizer st;
		
		// 간선 정보 입력 받기
		int[][] arr = new int[N+1][N+1];
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());
			
			arr[from][to] = arr[to][from] = weight;
		}
		
		boolean[] visited = new boolean[N + 1];
		int result = 0;
		int pickCnt = 0;
		
		PriorityQueue<Edge> pq = new PriorityQueue<>();//(5)
		
		pq.offer(new Edge(0,1,0)); 
		
		while(!pq.isEmpty()) {
			Edge e = pq.poll();
			if(visited[e.t]) continue;
			visited[e.t] = true;
			result += e.w;
			if(++pickCnt == N) break;
			for (int nt = 1; nt <= N; nt++) {
				if(!visited[nt] && arr[e.t][nt] != 0 ) pq.offer(new Edge(e.t, nt, arr[e.t][nt]));
			}
		}
		
		System.out.println(result);
 	}
	
	static class Edge implements Comparable<Edge>{ //(6)
		int f,t,w;

		public Edge(int f, int t, int w) {
			super();
			this.f = f;
			this.t = t;
			this.w = w;
		}

		@Override
		public String toString() {
			return "Edge [f=" + f + ", t=" + t + ", w=" + w + "]";
		}

		@Override
		public int compareTo(Edge o) {
			return Integer.compare(w, o.w);
		}
	}
}