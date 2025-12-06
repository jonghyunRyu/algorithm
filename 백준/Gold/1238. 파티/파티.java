import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    static class Edge implements Comparable<Edge> {
    	
        int to, cost;
        
        public Edge(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
        
        @Override
        public int compareTo(Edge e) {
            return Integer.compare(cost, e.cost);
        }
    }

    static final int INF = Integer.MAX_VALUE;

    static int N, M, X;
    static List<Edge>[] graph;
    static List<Edge>[] reverseGraph;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N + 1];
        reverseGraph = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
            reverseGraph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            graph[from].add(new Edge(to, cost));         
            reverseGraph[to].add(new Edge(from, cost));  
        }

        int[] distFromX = dijkstra(graph, X);       
        int[] distToX = dijkstra(reverseGraph, X);

        int answer = 0;
        for (int i = 1; i <= N; i++) {
            answer = Math.max(answer, distFromX[i] + distToX[i]);
        }

        System.out.println(answer);
    }

    static int[] dijkstra(List<Edge>[] g, int start) {
    	
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        int[] dist = new int[N + 1];
        Arrays.fill(dist, INF);
        dist[start] = 0;
        pq.offer(new Edge(start, 0));

        while (!pq.isEmpty()) {
        	
            Edge cur = pq.poll();
            
            if (cur.cost > dist[cur.to]) continue;

            for (Edge next : g[cur.to]) {
                int newCost = cur.cost + next.cost;
                if (dist[next.to] > newCost) {
                    dist[next.to] = newCost;
                    pq.offer(new Edge(next.to, newCost));
                }
            }
        }
        
        return dist;
    }
}
