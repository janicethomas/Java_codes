import java.util.*;
import java.io.*;

class binary_palindrome {
	public static void main(String []args) {
		int x = 5;
		String bin = Integer.toBinaryString(x);
		int right = bin.length() - 1;
		int left = 0;
		while(left<=right) {
			if (bin.charAt(right) != bin.charAt(left)) {
				break;
			}
			left++; right--;
			if (left >= right) {
				System.out.println("yes");
				break;
			}
		}
	}
}

// import java.util.Scanner;

// public class binary_palindrome  {
//     public static void main(String argc[]) {
//        Scanner s = new Scanner(System.in);
//        long num = s.nextInt();
//        long n1;
//        long reverse = 0;
//        n1 = num;
//        while (n1 > 0) {
//           reverse <<= 1;
//           if ((n1 & 1) == 1)
//              reverse ^= 1;
//           n1 >>= 1;
//        }
//        if(num == reverse) {
//           System.out.println("Binary representation of " + num + " is palindrome");
//        }else {
//           System.out.println("Binary representation of " + num + " is not palindrome");
//        }
//     }
//  }