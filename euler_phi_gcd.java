import java.io.*;
 
class euler_phi_gcd {
    static int phi(int n)
    {
        float result = n;

        for (int p = 2; p * p <= n; ++p) {
            if (n % p == 0) {
                while (n % p == 0)
                    n /= p;
                result *= (1.0 - (1.0 / (float)p));
            }
        }

        if (n > 1)
            result -= result / n;

 
        return (int)result;
    }
 
    public static void main(String args[])
    {
        int n;
        for (n = 1; n <= 10; n++)
            System.out.println("phi(" + n + ") = " + phi(n));
    }
}