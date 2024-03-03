import com.example.Feline;
import com.example.Lion;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestParam {
    private final String sex;
    private Feline feline;
    private final boolean result;

    public TestParam(String sex, boolean result) {
        this.sex = sex;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] sexLion() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }
    @Test
    public void testLion() throws Exception {
        Lion lion = new Lion(sex, feline);
        Assert.assertEquals(lion.doesHaveMane(), result);
    }
}