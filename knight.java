import java.util.*;
import java.io.*;

class knight {
    public static final int n = 5;
    public static final int row[] = {1,1,2,2,-1, -1, -2, -2, 1};
    public static final int col[] = {2, -2, 1, -1, -2, 2, 1, -1, 2};

    public static final void print(int visited[][]) {
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<n; j++) {
                System.out.println(visited[i][j]);
            }
            System.out.println();
        }
    }

    public static final boolean isValid(int x, int y) {
        if (x >=0 && y >=0 && x<n && y<n) return true;
        return false;
    }

    public static void Knight(int visited[][], int x, int y, int pos) {
        visited[x][y] = pos;
        if (pos >=n*n) {
            print(visited);
            visited[x][y] = 0;
            System.exit(0);
        }

        for (int k = 0; k<8; k++) {
            int newx = x + row[k];
            int newy = y + col[k];
            // System.out.println(newx + " " + newy);
            if (isValid(newx, newy)) {
                if(visited[newx][newy] == 0) {
                Knight(visited, newx, newy, pos+1);
            } 
            }
        }
        visited[x][y] = 0;
    }
    public static void main(String args[]) {
        int visited[][] = new int[n][n];
        int pos = 1;
        Knight(visited, 0, 0, pos);
    }
}