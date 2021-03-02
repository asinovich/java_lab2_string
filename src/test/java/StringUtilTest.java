import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringUtilTest {

    private StringUtil su;

    @Before
    public void setup() {
        su = new StringUtil();
    }

    @Test
    public void low() {
        String word = "Hello, World!";
        Assert.assertEquals("hello, world!", su.low(word));
    }

    @Test
    public void up() {
        String word = "Second lab";
        Assert.assertEquals("SECOND LAB", su.up(word));
    }

    @Test
    public void size() {

        String word = "Hi";
        Assert.assertEquals( 2, su.size(word));
    }

    @Test
    public void unite() {
        String firstWord = "I'm ";
        String secondWord = "Sergey!";
        Assert.assertEquals("I'm Sergey!", su.unite(firstWord, secondWord));
    }
}