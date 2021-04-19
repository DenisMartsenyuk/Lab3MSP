import org.junit.Test;
import static org.junit.Assert.*;
import yahoo.eu.Main;

public class TestMain {

    @Test
    public void simpleTestForTest() {
        Main main = new Main();
        assertEquals("Hello, epta", main.getCodePhrase());
    }

    @Test
    public void stringBuilderTest() {
        StringBuilder sb = new StringBuilder("1");
        sb.append(1 + 3);
        assertEquals("14", sb.toString());
        assertEquals("13", sb.toString());
    }

}
