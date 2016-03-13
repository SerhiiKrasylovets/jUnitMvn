import junit.framework.TestCase;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

public class CalculatorTest extends TestCase {

    @Test
    public void testEvaluate() throws Exception {
        Calculator calc = new Calculator();
        int sum = calc.evaluate("1+2+3");
        assertEquals(6, sum);
    }

    @Test
    public void testAssertArrayEquals(){
        byte[]expected = "trial".getBytes();
        byte[]actual = "trial".getBytes();
        assertArrayEquals("failure, byte arrays not same", expected, actual);
    }

    @Test
    public void testAssertExuals(){
        assertEquals("failure - stings are not equal", "text", "text");
    }

    @Test
    public void testAssertFalse(){
        assertFalse("failure - should be false", false);
    }

    @Test
    public void testAssertNotNull(){
        assertNotNull("should not be null", new Object());
    }

    @Test
    public void testAssertNotSame(){
        assertNotSame("should not be same object", new Object(), new Object());
    }

    @Test
    public void testAssertNull(){
        assertNull("should be null", null);
    }

    @Test
    public void testAssertSame(){
        Integer aNumber = Integer.valueOf(768);
        assertSame("should be same", aNumber, aNumber);
    }


}