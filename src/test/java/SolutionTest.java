import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        int[] nums = {3,2,1,5};
        int expected = 6;
        int actual = new Solution().countMaxOrSubsets(nums);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test2() {
        int[] nums = {2,2,2,2};
        int expected = 15;
        int actual = new Solution().countMaxOrSubsets(nums);

        Assert.assertEquals(expected, actual);
    }
}
