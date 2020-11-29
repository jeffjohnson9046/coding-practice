package leetcode.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Given the array candies and the integer extraCandies, where candies[i] represents the number of candies that the ith
 * kid has.
 * <p></p>
 * For each kid check if there is a way to distribute extraCandies among the kids such that he or she can have the
 * greatest number of candies among them. Notice that multiple kids can have the greatest number of candies.
 * <p></p>
 * <strong>Example 1</strong>
 * <pre>
 * Input: candies = [2,3,5,1,3], extraCandies = 3
 * Output: [true,true,true,false,true]
 * Explanation:
 *   Kid 1 has 2 candies and if he or she receives all extra candies (3) will have 5 candies --- the greatest number of candies among the kids.
 *   Kid 2 has 3 candies and if he or she receives at least 2 extra candies will have the greatest number of candies among the kids.
 *   Kid 3 has 5 candies and this is already the greatest number of candies among the kids.
 *   Kid 4 has 1 candy and even if he or she receives all extra candies will only have 4 candies.
 *   Kid 5 has 3 candies and if he or she receives at least 2 extra candies will have the greatest number of candies among the kids.
 * </pre>
 * <strong>Example 2</strong>
 * <pre>
 * Input: candies = [4,2,1,1,2], extraCandies = 1
 * Output: [true,false,false,false,false]
 * Explanation:
 *   There is only 1 extra candy, therefore only kid 1 will have the greatest number of candies among the kids regardless of who takes the extra candy.
 * </pre>
 * <strong>Example 3</strong>
 * <pre>
 * Input: candies = [12,1,12], extraCandies = 10
 * Output: [true,false,true]
 * </pre>
 * <p></p>
 * <strong>Constraints:</strong>
 * <ul>
 *     <li>{@code 2 <= candies.length <= 100}</li>
 *     <li>{@code 1 <= candies[i] <= 100}</li>
 *     <li>{@code 1 <= extraCandies <= 50}</li>
 * </ul>
 */
public class MostCandiesSolution {
    /**
     * @param candies
     * @param extraCandies
     * @return
     */
    public List<Boolean> kidsWithCandies(final int[] candies, final int extraCandies) {
        // CONSTRAINT:  The candies array must contain at least two and no more than 100 elements
        if (candies.length < 2 || candies.length > 100) {
            throw new IllegalArgumentException(String.format("The number of elements in the candies array must be between 2 and 100 (inclusive).  Candies array contains %d candies", candies.length));
        }

        // CONSTRAINT:  the extraCandies must be between 1 and 50 (inclusive)
        if (extraCandies < 1 || extraCandies > 50) {
            throw new IllegalArgumentException(String.format("extraCandies value must be between 1 and 50 (inclusive).  The extraCandies value %d is out of bounds.", extraCandies));
        }

        // CONSTRAINT:  each element in the candies array must be between 1 and 100 (inclusive)
        if (IntStream.of(candies).anyMatch(i -> i < 1 || i > 100)) {
            throw new IllegalArgumentException("Each value in the candies array must be between 1 and 100 (inclusive).");
        }

        final int maxCandies = findMaxCandies(candies);

        final List<Boolean> results = new ArrayList<>();
        for (final int candy : candies) {
            results.add(candy >= maxCandies - extraCandies);
        }

        return results;
    }

    public List<Boolean> kidsWithCandiesStreams(final int[] candies, final int extraCandies) {
        // CONSTRAINT:  The candies array must contain at least two and no more than 100 elements
        if (candies.length < 2 || candies.length > 100) {
            throw new IllegalArgumentException(String.format("The number of elements in the candies array must be between 2 and 100 (inclusive).  Candies array contains %d candies", candies.length));
        }

        // CONSTRAINT:  the extraCandies must be between 1 and 50 (inclusive)
        if (extraCandies < 1 || extraCandies > 50) {
            throw new IllegalArgumentException(String.format("extraCandies value must be between 1 and 50 (inclusive).  The extraCandies value %d is out of bounds.", extraCandies));
        }

        // CONSTRAINT:  each element in the candies array must be between 1 and 100 (inclusive)
        if (IntStream.of(candies).anyMatch(i -> i < 1 || i > 100)) {
            throw new IllegalArgumentException("Each value in the candies array must be between 1 and 100 (inclusive).");
        }

        final List<String> foo = new ArrayList<>();
        final int maxCandies = IntStream.of(candies)
                .max()
                .getAsInt();

        return IntStream.of(candies)
                .mapToObj(candy -> candy >= maxCandies - extraCandies)
                .collect(Collectors.toList());
    }

    /**
     * Find the largest number of candies in the {@code candies} array.
     *
     * @param candies The collection of kids and the number of candies each of them has
     * @return The largest {@code int} in the {@code candies} array
     */
    private int findMaxCandies(final int[] candies) {
        int seen = 0;
        for (final int candy : candies) {
            if (candy > seen) {
                seen = candy;
            }
        }

        return seen;
    }
}
