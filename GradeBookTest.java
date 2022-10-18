import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class GradeBookTest {
    private GradeBook g1;
    private GradeBook g2;
    
    @Before
    public void setUp() {
        g1 = new GradeBook(5);
        g2 = new GradeBook(5);
        g1.addScore(60);
        g1.addScore(80);
        g2.addScore(85);
        g2.addScore(95);
    }
    
    @After
    public void tearDown() {
        g1 = null;
        g2 = null;
    }

    @Test
    public void testSum(){
        assertEquals(140,g1.sum(),0.001);
        assertEquals(180,g2.sum(),0.001);
    }
    @Test
    public void testMinimum(){
        assertEquals(60,g1.minimum(),0.001);
        assertEquals(85,g2.minimum(),0.001);
    }
    @Test
    public void addScoreTest(){
        assertTrue(g1.toString().equals("60.0 80.0 "));
        assertTrue(g2.toString().equals("85.0 95.0 "));
    }
    @Test 
    public void finalScoreTest(){
        assertEquals(80,g1.finalScore(),0.001);
        assertEquals(95,g2.finalScore(),0.001);
    }
    
}
