package leetcode.easy;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(BlockJUnit4ClassRunner.class)
public class JewelsAndStonesSolutionTest {

    private JewelsAndStonesSolution jewelsAndStonesSolution;

    @Before
    public void setup() {
        jewelsAndStonesSolution = new JewelsAndStonesSolution();
    }

    @Test
    public void shouldSatisfyExample1() {
        final int results = jewelsAndStonesSolution.numJewelsInStones("aA", "aAAbbbb");
        assertEquals(3, results);
    }

    @Test
    public void shouldSatisfyExample2() {
        final int results = jewelsAndStonesSolution.numJewelsInStones("z", "ZZ");
        assertEquals(0, results);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowWhenArgumentForJIsNull() {
        jewelsAndStonesSolution.numJewelsInStones(null, "");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowWhenArgumentForJIsLongerThan50Characters() {
        final char[] fiftyOneChars = new char[51];

        jewelsAndStonesSolution.numJewelsInStones(new String(fiftyOneChars), "");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowWhenArgumentForSIsNull() {
        jewelsAndStonesSolution.numJewelsInStones("", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowWhenArgumentForSIsLongerThan50Characters() {
        final char[] fiftyOneChars = new char[51];

        jewelsAndStonesSolution.numJewelsInStones("", new String(fiftyOneChars));
    }
}
