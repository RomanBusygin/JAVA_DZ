package DZ_2;

public class Task1 {
    class Solution {
        public double myPow(double x, int n) {
            if (n == 0) return 1;
            if (x == 0) return 0;
            if (n == 1) return x;

            if (n >= 2147483647) {
                if (x == 1 || x == -1) return x;
                else return 0;
            }

            if (n <= -2147483647) {
                if (x == 1 || x == -1) return 1;
                else return 0;
            }

            if (n > 0) {
                if (n % 2 == 0) return myPow(x, n / 2) * myPow(x, n / 2);
                else return myPow(x, n / 2) * myPow(x, n / 2) * x;
            }
            else {
                if (n % 2 == 0) return (1 / myPow(x, -n / 2)) * (1 / myPow(x, -n / 2));
                else return (1 / myPow(x, -n / 2)) * (1 / myPow(x, -n / 2) * (1 / x));
            }
        }
    }
}