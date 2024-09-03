class maze {
    int n = 4;

    boolean isValid(int x, int y, int maze[][]){
        if (x >= 0 && y>= 0 && x <n && y<n && maze[x][y] == 1) return true;
        return false;
    }

    boolean solveMazeUtil(int maze[][], int x, int y, int sol[][]) {
        if (x == n-1 && y == n-1) {
            sol[x][y] = 1;
            return true;
        }
        if (isValid(x,y, maze)) {
            sol[x][y] = 1;
            if (solveMazeUtil(maze, x+1, y, sol)) return true;
            if (solveMazeUtil(maze, x, y+1, sol)) return true;
            if (solveMazeUtil(maze, x-1, y, sol)) return true;
            if (solveMazeUtil(maze, x, y-1, sol)) return true;
            sol[x][y] = 0;
            return false;
        }
        return false;
    }

    void printSolution(int sol[][]) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(" " + sol[i][j] + " ");
            System.out.println();
        }
    }
    public static void main(String args[]) {
        maze m = new maze();
        int maze[][] = { { 1, 0, 0, 0 },
        { 1, 1, 0, 1 },
        { 0, 1, 0, 0 },
        { 1, 1, 1, 1 } };
        int sol[][] = { { 0, 0, 0, 0 },
                        { 0, 0, 0, 0 },
                        { 0, 0, 0, 0 },
                        { 0, 0, 0, 0 } };
 
        if (m.solveMazeUtil(maze, 0, 0, sol) == false) {
            System.out.print("Solution doesn't exist");
        }
 
        m.printSolution(sol);
    }
}
