import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	
	// V(정점), E(간선), K(시작 정점)
	static int V, E, K;
	static boolean[] visited;
	static int[] minDistance;
	static List<Edge>[] graph;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(br.readLine());
		
		graph = new ArrayList[V + 1];
		minDistance = new int[V + 1];
		
		for (int i = 1; i <= V; i++) {
			graph[i] = new ArrayList<>();
			minDistance[i] = Integer.MAX_VALUE;
		}
		
		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());
			int f = Integer.parseInt(st.nextToken());
			int t = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			
			graph[f].add(new Edge(t, w));
		}
		
		PriorityQueue<Edge> pq = new PriorityQueue<>();
        minDistance[K] = 0;
        pq.offer(new Edge(K, 0));

        while (!pq.isEmpty()) {
            Edge cur = pq.poll();
            int now = cur.v;
            int dist = cur.w;

            if (minDistance[now] < dist) continue;

            for (Edge next : graph[now]) {
                int cost = minDistance[now] + next.w;
                if (cost < minDistance[next.v]) {
                    minDistance[next.v] = cost;
                    pq.offer(new Edge(next.v, cost));
                }
            }
        }
		
        for (int i = 1; i <= V; i++) {
        	if (minDistance[i] == Integer.MAX_VALUE) {
        		System.out.println("INF");
        	} else {
        		System.out.println(minDistance[i]);
        	}
        }
	}
	
	static class Edge implements Comparable<Edge> {
		
		int v, w;
		
		public Edge(int v, int w) {
			this.v = v;
			this.w = w;
		}
		
		@Override
		public int compareTo(Edge e) {
			return Integer.compare(w, e.w);
		}
	}
}