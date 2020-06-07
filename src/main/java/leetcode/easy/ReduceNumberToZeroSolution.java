package leetcode.easy;

/**
 * Given a non-negative integer num, return the number of steps to reduce it to zero. If the current number is even, you
 * have to divide it by 2, otherwise, you have to subtract 1 from it.
 * <p></p>
 * <strong>Example 1:</strong>
 * <pre>
 * Input: num = 14
 * Output: 6
 * Explanation:
 * Step 1) 14 is even; divide by 2 and obtain 7.
 * Step 2) 7 is odd; subtract 1 and obtain 6.
 * Step 3) 6 is even; divide by 2 and obtain 3.
 * Step 4) 3 is odd; subtract 1 and obtain 2.
 * Step 5) 2 is even; divide by 2 and obtain 1.
 * Step 6) 1 is odd; subtract 1 and obtain 0.
 * </pre>
 * <p></p>
 * <strong>Example 2:</strong>
 * <pre>
 * Input: num = 8
 * Output: 4
 * Explanation:
 * Step 1) 8 is even; divide by 2 and obtain 4.
 * Step 2) 4 is even; divide by 2 and obtain 2.
 * Step 3) 2 is even; divide by 2 and obtain 1.
 * Step 4) 1 is odd; subtract 1 and obtain 0.
 * </pre>
 * <p></p>
 * <strong>Example 3:</strong>
 * <pre>
 * Input: num = 123
 * Output: 12
 * </pre>
 * <p></p>
 * <strong>Constraints:</strong>
 * <pre>
 * 0 <= num <= 10^6
 * </pre>
 */
public class ReduceNumberToZeroSolution {
    /**
     * Find the number of steps it takes to reduce a number to zero.
     * <p></p>
     * Rules:
     * <ul>
     *     <li>If the number is even, divide by 2</li>
     *     <li>If the number is odd, subtract 1</li>
     * </ul>
     *
     * @param num The number to divide
     * @return An {@code int} for the number of steps it took to reduce a number to zero.
     */
    public int numberOfSteps(final int num) {
        if (num < 0 || num > Math.pow(10, 6)) {
            throw new IllegalArgumentException("num must be between 0 and 10 ^ 6 (inclusive).");
        }

        int number = num;
        int steps = 0;

        if (number == 0) {
            return steps;
        }

        while (number > 0) {
            number = number % 2 == 0
                    ? number / 2
                    : number - 1;

            steps++;
        }

        return steps;
    }
}
