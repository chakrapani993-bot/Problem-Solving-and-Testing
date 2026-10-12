
import java.util.*;

public class SmartTrafficNavigation {
    static class Edge {
        int destination, distance;

        Edge(int destination, int distance) {
            this.destination = destination;
            this.distance = distance;
        }
    }

    public static void main(String[] args) {
        int n = 5;

        List<List<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        addEdge(graph, 0, 1, 4);
        addEdge(graph, 0, 2, 2);
        addEdge(graph, 2, 1, 1);
        addEdge(graph, 1, 3, 5);
        addEdge(graph, 2, 3, 8);
        addEdge(graph, 3, 4, 3);
        addEdge(graph, 1, 4, 10);

        int source = 0;
        int destination = 4;

        int[] dist = new int[n];
        int[] parent = new int[n];

        Arrays.fill(dist, Integer.MAX_VALUE);
        Arrays.fill(parent, -1);

        PriorityQueue<int[]> pq = new PriorityQueue<>(
                Comparator.comparingInt(a -> a[1]));

        dist[source] = 0;
        pq.add(new int[]{source, 0});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int node = current[0];
            int distance = current[1];

            if (distance != dist[node]) {
                continue;
            }

            for (Edge edge : graph.get(node)) {
                int newDistance = distance + edge.distance;

                if (newDistance < dist[edge.destination]) {
                    dist[edge.destination] = newDistance;
                    parent[edge.destination] = node;

                    pq.add(new int[]{
                            edge.destination, newDistance
                    });
                }
            }
        }

        if (dist[destination] == Integer.MAX_VALUE) {
            System.out.println("No route found");
            return;
        }

        List<Integer> path = new ArrayList<>();

        for (int node = destination; node != -1;
             node = parent[node]) {
            path.add(node);
        }

        Collections.reverse(path);

        System.out.println("Shortest Distance: "
                + dist[destination]);

        System.out.println("Best Route: " + path);
    }

    static void addEdge(List<List<Edge>> graph,
                        int u, int v, int distance) {
        graph.get(u).add(new Edge(v, distance));
        graph.get(v).add(new Edge(u, distance));
    }
}



Shortest Distance: 10
Best Route: [0, 2, 1, 3, 4]
