package DZ_2;

public class Task3 {
    public static void main(String[] args) {

    }
    class Solution {
        public int climbStairs(int n) {
            int[] steps = new int[n + 1];
            return howManySteps(n, steps);
        }

        private int howManySteps(int n, int[] steps) {
            if (n > 3) {
                if (steps[n] != 0) {
                    return steps[n];
                }
                else {
                    steps[n] = howManySteps(n - 1, steps) + howManySteps(n - 2, steps);
                    return steps[n];
                }
            } else {
                return n;
            }
        }
    }
}
