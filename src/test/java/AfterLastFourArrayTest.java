import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AfterLastFourArrayTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {new int[]{2, 1, 0}, new int[]{4, 1, 2, 3, 2, 4, 4, 2, 1, 0}},
                {new int[]{1, 0}, new int[]{2, 1, 2, 3, 2, 7, 7, 2, 1, 0}},
                {new int[]{4, 5, 2}, new int[]{1, 4, 2, 4, 3, 4, 4, 4, 5, 0}},
                {new int[]{2, 3, 2, 7}, new int[]{2, 4, 2, 3, 2, 7}},
        });
    }
    private AfterLastFourArray t;
    private int[] a;
    private int[] b;
    public AfterLastFourArrayTest(int[] a, int[] b) {
        this.a = a;
        this.b = b;
    }

    @Before
    public void init() {
        t = new AfterLastFourArray();
    }

    @Test
    public void testTask1() {
        Assert.assertTrue("Arrays ara not equals", Arrays.equals(a, t.doAfterLastFourArray(b)));
    }
}