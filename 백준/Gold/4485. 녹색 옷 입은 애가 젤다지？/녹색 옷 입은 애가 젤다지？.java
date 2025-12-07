import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    
    static int N;
    static StringBuilder sb = new StringBuilder();
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    static class Edge implements Comparable<Edge> {
        int x, y, cost;

        Edge(int x, int y, int cost) {
            this.x = x;
            this.y = y;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return Integer.compare(cost, o.cost); 
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int count = 1;
        while (true) {
            N = Integer.parseInt(br.readLine());
            if (N == 0) break; 

            int[][] cave = new int[N][N];
            int[][] dist = new int[N][N];

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    cave[i][j] = Integer.parseInt(st.nextToken());
                    dist[i][j] = Integer.MAX_VALUE;
                }
            }

            PriorityQueue<Edge> pq = new PriorityQueue<>();
            pq.offer(new Edge(0, 0, cave[0][0]));
            dist[0][0] = cave[0][0];

            while (!pq.isEmpty()) {
                Edge cur = pq.poll();

                if (cur.cost > dist[cur.x][cur.y]) continue;

                for (int d = 0; d < 4; d++) {
                    int nx = cur.x + dx[d];
                    int ny = cur.y + dy[d];

                    if (nx < 0 || ny < 0 || nx >= N || ny >= N) continue;

                    int newCost = cur.cost + cave[nx][ny];

                    if (dist[nx][ny] > newCost) {
                        dist[nx][ny] = newCost;
                        pq.offer(new Edge(nx, ny, newCost));
                    }
                }
            }

            sb.append("Problem ").append(count++).append(": ").append(dist[N-1][N-1]).append("\n");
        }

        System.out.print(sb);
    }
}