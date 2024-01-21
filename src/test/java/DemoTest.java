import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */
public class DemoTest {
    // negative
    //character
    //decimal
    @Test
    public void testMain_IsTriangle() {
        String input = "4\n1\n4\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());  
        System.setIn(in); 

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //invoke main
        Demo.main(new String[]{});
        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is a triangle." + System.getProperty("line.separator");
        
        assertEquals(consoleOutput, out.toString()); 
    }

    @Test
    public void testMain_NotTriangle() {
        String input = "-1\n1\n4\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());  
        System.setIn(in); 

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //invoke main
        Demo.main(new String[]{});
        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is not a triangle." + System.getProperty("line.separator");
        
        assertEquals(consoleOutput, out.toString()); 
    }


    @Test
    public void isNotTriangle_1() {
        
        assertFalse(Demo.isTriangle(-4, -3, -2)); 
    }
    @Test
    public void isNotTriangle_2() {
        
        assertFalse(Demo.isTriangle(0, 0, 4));
    }
    @Test
    public void isNotTriangle3() {
        
        assertFalse(Demo.isTriangle(4, 4, 9)); 
    }
    @Test
    public void isNotTriangle4() {
        
        assertFalse(Demo.isTriangle(50, 3, 57)); 
    }
    @Test
    public void isNotTriangle5() {
        
        assertFalse(Demo.isTriangle(-1, 3, 1)); 
    }
    @Test
    public void isNotTriangle6() {
        
        assertFalse(Demo.isTriangle(4, -1, 2)); 
    }
    @Test
    public void isTriangle7() {
        
        assertTrue(Demo.isTriangle(4, 1, 4)); 
    }
    @Test
    public void isTriangle8() {
        
        assertTrue(Demo.isTriangle(1, 9, 9)); 
    }
    @Test
    public void isNotTriangle9() {
        
        assertFalse(Demo.isTriangle(0, 0, 0)); 
    }

}
