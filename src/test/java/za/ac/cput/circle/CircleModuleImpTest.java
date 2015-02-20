package za.ac.cput.circle;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.circle.Impl.CircleModuleImp;

/**
 * Created by student on 2015/02/20.
 */
public class CircleModuleImpTest extends TestCase{
    Circle c;

    @Before
    public void setUp() throws Exception {
        c = new CircleModuleImp();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testCalcArea() throws Exception {
        assertEquals(3.14,c.calcArea(1));
    }

    @Test
    public void testCalcCircumference() throws Exception {
        assertEquals(12.56,c.calcCircumference(2));

    }

    @Test
    public void testName() throws Exception {
        assertEquals(4.0,c.calcDiameter(2));
    }
}
