import static org.junit.Assert.*;
import org.junit.Test;
import org.omg.CORBA.PRIVATE_MEMBER;

public class JunitTest {

    private Checksum check = new Checksum();
    private FizzBuzz fizzbuzzer = new FizzBuzz();

    @Test
    public void testChecksum() {


        assertEquals(5, check.checksum("11111"));
        assertEquals(0, check.checksum("87654321"));

    }

    @Test
    public void testFizzBuzz() {


        //assertEquals("1,2,Fizz,4,Buzz", fizzbuzzer.fizzbuzz(5));
        //assertEquals("1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz", fizzbuzzer.fizzbuzz(10));

    }

}
