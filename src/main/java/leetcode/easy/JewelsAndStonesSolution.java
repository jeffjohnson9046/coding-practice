package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * You're given strings {@code J} representing the types of stones that are jewels, and {@code S} representing the
 * stones you have.  Each character in {@code S} is a type of stone you have.  You want to know how many of the stones
 * you have are also jewels.
 * <p></p>
 * The letters in {@code J} are guaranteed distinct, and all characters in {@code J} and {@code S} are letters. Letters
 * are case sensitive, so "a" is considered a different type of stone from "A".
 * <p></p>
 * <strong>Example 1:</strong>
 * <pre>
 * Input: J = "aA", S = "aAAbbbb"
 * Output: 3
 * </pre>
 *
 * <strong>Example 2:</strong>
 * <pre>
 * Input: J = "z", S = "ZZ"
 * Output: 0
 * </pre>
 * <strong>Note:</strong>
 * <ul>
 *  <li>{@code S} and {@code J} will consist of letters and have length at most 50.</li>
 * <li>The characters in {@code J} are distinct.</li>
 * </ul>
 */
public class JewelsAndStonesSolution {
    /**
     * Find the number of Jewels in a collection of Stones.
     *
     * @param J A {@link java.lang.String} representing the collection of Jewels.
     * @param S A {@link java.lang.String} representing the collection of Stones.
     * @return The number of Jewels that occur in the collection of Stones.
     */
    public int numJewelsInStones(final String J, final String S) {
        validate(J, "J cannot be null and must contain between 1 and 50 elements");

        validate(S, "S cannot be null and must contain between 1 and 50 elements");

        final Set<Character> jewels = new HashSet<>();
        for (final char c : J.toCharArray()) {
            jewels.add(c);
        }

        int numberOfJewels = 0;

        for (final char c : S.toCharArray()) {
            if (jewels.contains(c)) {
                numberOfJewels++;
            }
        }

        return numberOfJewels;
    }

    /**
     * Validate the input {@link java.lang.String} according to the constraints defined in the <strong>Note</strong>
     * section of this problem.
     *
     * @param S The input {@link java.lang.String} to validate
     * @param exceptionMessage The message to display in the exception
     */
    private void validate(final String S, final String exceptionMessage) {
        if (S == null || S.length() < 1 || S.length() > 50) {
            throw new IllegalArgumentException(exceptionMessage);
        }
    }
}
