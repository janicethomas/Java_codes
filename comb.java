import java.util.*;
import java.io.*;

class comb {

    static void pcomb(int arr[], int n, int r, int i, int index, int data[]) {
        if (index == r) {
            for (int j = 0; j<r; j++) {
                System.out.println(data[j]);
            }
            System.out.println();
            return;
        }

        if (i >= n) {
            return;
        }

        data[index] = arr[i];
        pcomb(arr, n, r, i+1, index+1, data);
        pcomb(arr, n, r, i+1, index, data);
    }
    public static void main(String args[]) {
        int arr[] = {1,2,3,4};
        int r = 2;
        int n = arr.length;
        int data[] = new int[2];
        pcomb(arr, n, r, 0, 0,data);
    }
}