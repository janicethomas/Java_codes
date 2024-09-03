import java.util.*;
import java.io.*;

/*
0 1 0 1 1 0 0 0
1 0 1 0 0 1 0 0
0 1 0 1 0 0 1 0
1 0 1 0 0 0 0 1
1 0 0 0 0 1 0 1
0 1 0 0 1 0 1 0
0 0 1 0 0 1 0 1
0 0 0 1 1 0 1 0
 */

class ham {
    int V;
    int path[];
    int pathc;
    int graph[][];

    void find() {
        pathc = 0;
        path = new int[V];
        for (int i = 0; i<V; i++) {
            path[i] = -1;
        }

        try {
            path[0] = 0;
            pathc = 1;
            solve(0);
        } catch(Exception e) {
            display();
        }
    }

    void solve(int vertex) throws Exception{
        if (graph[vertex][0] == 1 && pathc == V) {
            throw new Exception("");
        }
        if (pathc == V) return;

        for (int v = 0; v<V; v++) {
            if (graph[vertex][v] == 1) {
                path[pathc++] = v;
                graph[vertex][v] = 0;
                graph[v][vertex] = 0;
                if (!isPresent(v)) {
                    solve(v);
                }
                path[--pathc] = -1;
                graph[vertex][v] = 1;
                graph[v][vertex] = 1;
            }
        }
    }

    boolean isPresent(int v) {
        for (int i = 0; i<pathc-1; i++) {
            if (path[i] == v) return true;
        }
        return false;
    }

    void display() {
        for (int i = 0; i<V; i++) {
            System.out.println(path[i%V]);
        }
    }
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        ham h = new ham();
        h.V = 8;
        h.graph = new int[h.V][h.V];
        for (int i = 0; i < h.V; i++)
            for (int j = 0; j < h.V; j++)
                h.graph[i][j] = scan.nextInt();
        h.find();
    }
}