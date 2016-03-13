import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class CalcTest{
    @Category(AcceptanceTest.class)

    @Test(expected = DivByZeroException.class)
    public void testDiv(){
        Calc calc = new Calc();
        Assert.assertEquals("incorrect div", 6, calc.div(36, 0));
    }



}