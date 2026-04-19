import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MyBigNumberUnitTest {

    private final MyBigNumber myBigNumber = new MyBigNumber();

    @Test
    void testSum_basic() {
        String result = myBigNumber.sum("1234", "5678");
        assertEquals("6912", result);
    }

    @Test
    void testSum_withCarry() {
        String result = myBigNumber.sum("999", "1");
        assertEquals("1000", result);
    }

    @Test
    void testSum_differentLength() {
        String result = myBigNumber.sum("12345", "678");
        assertEquals("13023", result);
    }
    @Test
    void testSum_emptyString() {
        String result = myBigNumber.sum("", "123");
        assertEquals("123", result);
    }

    @Test
    void testSum_zero() {
        String result = myBigNumber.sum("0", "0");
        assertEquals("0", result);
    }

    @Test
    void testSum_largeNumber() {
        String result = myBigNumber.sum("999999999999", "1");
        assertEquals("1000000000000", result);
    }
}
