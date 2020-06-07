package leetcode.easy;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(BlockJUnit4ClassRunner.class)
public class ReduceNumberToZeroSolutionTest {

    private ReduceNumberToZeroSolution reduceNumberToZeroSolution;

    @Before
    public void setup() {
        reduceNumberToZeroSolution = new ReduceNumberToZeroSolution();
    }

    @Test
    public void shouldSatisfyExample1() {
        final int results = reduceNumberToZeroSolution.numberOfSteps(14);

        assertEquals(6, results);
    }

    @Test
    public void shouldSatisfyExample2() {
        final int results = reduceNumberToZeroSolution.numberOfSteps(8);

        assertEquals(4, results);
    }

    @Test
    public void shouldSatisfyExample3() {
        final int results = reduceNumberToZeroSolution.numberOfSteps(123);

        assertEquals(12, results);
    }

    @Test
    public void shouldReturnZeroStepsForZero() {
        final int results = reduceNumberToZeroSolution.numberOfSteps(0);

        assertEquals(0, results);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowWhenNumIsLessThanZero() {
        reduceNumberToZeroSolution.numberOfSteps(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowWhenNumIsGreaterThanTenToTheSixth() {
        reduceNumberToZeroSolution.numberOfSteps(Integer.MAX_VALUE);
    }
}
