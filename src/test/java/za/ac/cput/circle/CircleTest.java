package za.ac.cput.circle;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.circle.Impl.CircleImp;

/**
 * Created by student on 2015/02/20.
 */
public class CircleTest extends TestCase{
    Circle c;
    @Before
    public void setUp() throws Exception {
         c = new CircleImp();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testCalcArea() throws Exception {
        assertEquals(12.56,c.calcArea(2));
    }
    @Test
    public void testCalcDiameter() throws Exception {
        assertEquals(4.0,c.calcDiameter(2));
    }
    @Test
    public void testName() throws Exception {
        assertEquals(6.28,c.calcCircumference(1));
    }
}
