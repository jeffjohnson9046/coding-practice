package leetcode.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toMap;

/**
 * Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each
 * nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
 * <p></p>
 * Return the answer in an array.
 * <p></p>
 * <strong>Example 1:</strong>
 * <pre>
 * Input: nums = [8,1,2,2,3]
 * Output: [4,0,1,1,3]
 * Explanation:
 * For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
 * For nums[1]=1 does not exist any smaller number than it.
 * For nums[2]=2 there exist one smaller number than it (1).
 * For nums[3]=2 there exist one smaller number than it (1).
 * For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
 * </pre>
 * <strong>Example 2:</strong>
 * <pre>
 * Input: nums = [6,5,4,8]
 * Output: [2,1,0,3]
 * </pre>
 * <strong>Example 3:</strong>
 * <pre>
 * Input: nums = [7,7,7,7]
 * Output: [0,0,0,0]
 * </pre>
 * <strong>Constraints:</strong>
 * <ul>
 * <li>2 <= nums.length <= 500</li>
 * <li>0 <= nums[i] <= 100</li>
 * </ul>
 */
public class SmallerThanTheCurrentNumberSolution {
    /**
     * Produce an array that describes how many <em>other</em> numbers in an array are smaller than the element at the
     * current index.
     *
     * @param nums The array of {@code int}s to evaluate.
     * @return An {@code int} array describing how many numbers are smaller than the number in its index.
     */
    public int[] smallerNumbersThanCurrent(final int[] nums) {
        if (nums == null || nums.length < 2 || nums.length > 500) {
            throw new IllegalArgumentException("nums cannot be null and must have between 2 and 500 elements.");
        }

        // Clone the nums; the Arrays.sort mutates the array during its sort operation and we don't want to change the
        // original input.
        final int[] numbers = nums.clone();
        Arrays.sort(numbers);

        final int[] numbersDesc = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numbersDesc[i] = numbers[(numbers.length - i - 1)];
        }

        final Map<Integer, Integer> numbersMappedToSmallerQty = new HashMap<>();
        for (int j = 0; j < numbersDesc.length; j++) {
            numbersMappedToSmallerQty.put(numbersDesc[j], numbersDesc.length - j - 1);
        }

        final int[] results = new int[nums.length];
        for (int k = 0; k < nums.length; k++) {
            results[k] = numbersMappedToSmallerQty.get(nums[k]);
        }

        return results;
    }
}
