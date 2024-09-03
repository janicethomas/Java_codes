import java.util.*;
import java.io.*;

class test {
	public static void main(String[] args) {
		int L = 110;
		int R = 130;
		ArrayList<Integer> chprime = new ArrayList<Integer>();
		boolean c[] = new boolean[R+1];
		Arrays.fill(c, true);
		c[1] = false;
		c[0] = false;
		for (int i = 2; (i*i)<=R; i++) {
			if (c[i] == true) {
				for(int j = i*i; j<=Math.sqrt(R); j = j+i) {
					c[j] = false;
				}
			}
		}

		for (int i = 2; i*i<=R+1; i++) {
			if (c[i] == true) {
				chprime.add(i);
			}
		}

		boolean[] dummy = new boolean[R-L+1];
		Arrays.fill(dummy, true);
		int low;
		for (int i:chprime) {
			if (L<=i) {
				low = i+i;
			}
			else if (L%i!=0) {
				low = L + i;
			}
			else {
				low = L;
			}
			for(int j = low; j<=R; j = j+i) {
				dummy[j-L] = false;
			}
		}

		for (int i=L; i<=R; i++) {
			if (dummy[i-L] == true) {
				System.out.println(i);
			}
		}
	}
}

// import java.util.*;
// import java.lang.Math;
 
// public class incremental_sieve{
//     public static void GetPrime(ArrayList<Integer> prime,int R){
//         boolean[] c=new boolean[R+1];
//         Arrays.fill(c,true);
//         c[1]=false;
//         c[0]=false;
//     for(int i=2;(i*i)<=R;i++){
//         if(c[i]==true){
//             for(int j=i*i;j<=Math.sqrt(R);j=j+i){
//                 c[j]=false;
//             }
//         }
//     }
//     for(int i=2;i*i<=R;i++){
//         if(c[i]==true){
//            prime.add(i);
//         //    System.out.println(i);
//         }
//     }
// }

//     public static void Segmented_Sieve(int L,int R){
//         ArrayList<Integer> chprime= new ArrayList<Integer>();
//         GetPrime(chprime,R);
     
         
//         boolean[] dummy=new boolean [R-L+1];
//         Arrays.fill(dummy,true);
//         for(int i:chprime){
//             int low=(L/i);
//             if(low<=1){
//             low=i+i;
//             }
//             else if(L%i!=0){
//             low=(low*i)+i;
//             }
//             else{
//                 low=(low*i);
//             }
//             for(int j=low;j<=R;j=j+i){
//             dummy[j-L]=false;
//             }
//         }
//         for(int i=L;i<=R;i++){
//             if(dummy[i-L]==true){
            
//             System.out.printf("%d ",i);
//             }
//         }    
//     }
// public static void main(String[] args){
//         int L=110;    
//         int R=130;
//         Segmented_Sieve(L,R);
//     }
// }
