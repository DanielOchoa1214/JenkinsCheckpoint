import org.example.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorTest {
    private Calculator c;

    @BeforeMethod
    public void beforeMethod(){
        c = new Calculator();
    }

    @Test
    public void AdditionTest(){
        int result = c.add(4, 9);
        Assert.assertEquals(result, 13);
    }

    @Test
    public void AdditionTestWithNegatives(){
        int result = c.add(4, -9);
        Assert.assertEquals(result, -5);
    }

    @Test
    public void SubtractionTest(){
        int result = c.subtract(4, 9);
        Assert.assertEquals(result, -5);
    }

    @Test
    public void SubtractionTestWithNegatives(){
        int result = c.subtract(4, -9);
        Assert.assertEquals(result, 13);
    }

    @Test
    public void MultiplicationTest(){
        int result = c.multiply(4, 9);
        Assert.assertEquals(result, 36);
    }

    @Test
    public void MultiplicationTestWithNegatives(){
        int result = c.multiply(4, -9);
        Assert.assertEquals(result, -36);
    }

    @Test
    public void DivisionTest(){
        int result = c.divide(4, 9);
        Assert.assertEquals(result, 0);
    }

    @Test
    public void DivisionTestWithNegatives(){
        int result = c.divide(4, -9);
        Assert.assertEquals(result, 0);
    }
}
