package leetcode.easy;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(BlockJUnit4ClassRunner.class)
public class MostCandiesSolutionTest {
    MostCandiesSolution mostCandiesSolution;

    @Before
    public void setup() {
        mostCandiesSolution = new MostCandiesSolution();
    }

    @Test
    public void shouldSatisfyExample1() {
        final int[] candies = new int[]{2, 3, 5, 1, 3};
        final int extraCandies = 3;

        final List<Boolean> results = mostCandiesSolution.kidsWithCandies(candies, extraCandies);

        assertEquals(Arrays.asList(true, true, true, false, true), results);
    }

    @Test
    public void shouldSatisfyExample2() {
        final int[] candies = new int[]{4, 2, 1, 1, 2};
        final int extraCandies = 1;

        final List<Boolean> results = mostCandiesSolution.kidsWithCandies(candies, extraCandies);

        assertEquals(Arrays.asList(true, false, false, false, false), results);
    }

    @Test
    public void shouldSatisfyExample3() {
        final int[] candies = new int[]{12, 1, 12};
        final int extraCandies = 10;

        final List<Boolean> results = mostCandiesSolution.kidsWithCandies(candies, extraCandies);

        assertEquals(Arrays.asList(true, false, true), results);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenCandiesArrayIsLessThan2() {
        mostCandiesSolution.kidsWithCandies(new int[1], 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenCandiesArrayIsGreaterThan100() {
        mostCandiesSolution.kidsWithCandies(new int[101], 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldTrowExceptionWhenExtraCandiesIsLessThan1() {
        mostCandiesSolution.kidsWithCandies(new int[10], 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldTrowExceptionWhenExtraCandiesIsGreaterThan50() {
        mostCandiesSolution.kidsWithCandies(new int[10], 51);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfAnyCandiesAreLessThan1() {
        mostCandiesSolution.kidsWithCandies(new int[]{0}, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfAnyCandiesAreGreaterThan100() {
        mostCandiesSolution.kidsWithCandies(new int[]{101}, 0);
    }
}
