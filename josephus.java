import java.util.*;
import java.io.*;

class josephus {

    static int j(int n, int k) {
        if (n == 1) return 1;
        return (j(n-1, k) + k-1)%n + 1;
    }
    public static void main(String args[]) {
        int n = 14;
        int k = 2;
        System.out.println(j(n, k));
    }
}