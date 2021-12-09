import com.kodilla.exception.test.SecondChallange;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondChallangeTestSuite {

    @Test
    public void flightTest() throws Exception {
        SecondChallange secondChallange = new SecondChallange();
        String result = secondChallange.probablyIWillThrowException(1.5,1.0);
        assertEquals("Done!", result);
    }

}
