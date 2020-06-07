package leetcode.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;


@RunWith(BlockJUnit4ClassRunner.class)
public class SmallerThanTheCurrentNumberSolutionTest {
    private SmallerThanTheCurrentNumberSolution smallerThanTheCurrentNumberSolution;

    @Before
    public void setup() {
        smallerThanTheCurrentNumberSolution = new SmallerThanTheCurrentNumberSolution();
    }

    @Test
    public void shouldSatisfyExample1() {
        final int[] nums = new int[]{8, 1, 2, 2, 3};
        final int[] results = smallerThanTheCurrentNumberSolution.smallerNumbersThanCurrent(nums);

        Assert.assertArrayEquals(new int[]{4, 0, 1, 1, 3}, results);
    }

    @Test
    public void shouldSatisfyExample2() {
        final int[] nums = new int[]{6, 5, 4, 8};
        final int[] results = smallerThanTheCurrentNumberSolution.smallerNumbersThanCurrent(nums);

        Assert.assertArrayEquals(new int[]{2, 1, 0, 3}, results);
    }

    @Test
    public void shouldSatisfyExample3() {
        final int[] nums = new int[]{7, 7, 7, 7};
        final int[] results = smallerThanTheCurrentNumberSolution.smallerNumbersThanCurrent(nums);

        Assert.assertArrayEquals(new int[]{0, 0, 0, 0}, results);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowWhenNumsArgumentIsNull() {
        smallerThanTheCurrentNumberSolution.smallerNumbersThanCurrent(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowWhenNumsArgumentIsEmptyArray() {
        smallerThanTheCurrentNumberSolution.smallerNumbersThanCurrent(new int[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowWhenArgumentIsLongerThan500Elements() {
        smallerThanTheCurrentNumberSolution.smallerNumbersThanCurrent(new int[501]);
    }
}
