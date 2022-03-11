import static org.junit.Assert.*;
import org.junit.Test;

public class BraceCheckerTests {

    private CheckBraces checker = new CheckBraces();

    @Test
    public void testValid() {


        assertEquals(true, checker.isValid("{}"));
        assertEquals(true, checker.isValid("{}{}"));


    }

    @Test
    public void testInvalid() throws Exception {

        assertEquals(false, checker.isValid("{{}}} {{{}}"));

        assertEquals(false, checker.isValid("{{}}} {{{}}"));
        assertEquals(false, checker.isValid("{{{}"));


    }

}