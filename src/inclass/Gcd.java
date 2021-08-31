package inclass;

public class Gcd {

    static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        } else {
            return gcd(n, m % n);
        }
//        for (int i = m; i >= 1; i--) {
//            if (m % i == 0 && n % i == 0) {
//                return i;
//            }
//        }
//        return -1;
    }

}
