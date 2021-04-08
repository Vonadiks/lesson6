import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class OneFourArrayTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {true, new int[]{1, 4, 5}},
                {true, new int[]{1, 4, 4, 1}},
                {true, new int[]{1, 4, 4, 4, 4}},
                {true, new int[]{2, 3, 5}},
        });
    }

    private OneFourArray t;
    private boolean a;
    private int[] b;

    public OneFourArrayTest(boolean a, int[] b) {
        this.a = a;
        this.b = b;
    }

    @Before
    public void init() {
        t = new OneFourArray();
    }

    @Test
    public void testTask2() {
        Assert.assertEquals(a, t.doOneFourArray(b));
    }
}
