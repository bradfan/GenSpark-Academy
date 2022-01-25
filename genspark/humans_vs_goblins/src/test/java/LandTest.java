import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

public class LandTest {
    Land land;

    @BeforeEach
    void setUp() { land = new Land(); }

    @DisplayName("Test Land UTF Charsets ")
    @Test


    void ToString() {
        String landGrid = "You can check out any time you like but you can never leave...";
        byte[] bytes = landGrid.getBytes(StandardCharsets.UTF_8);
        String utf8EncodedString = new String(bytes, StandardCharsets.UTF_8);
        assertEquals(landGrid, utf8EncodedString);
    }
    //  assertEquals('the expected return', 'pass in the data () to create expected return', type message should test fail.

    @AfterEach
    void tearDown() {
    }

}
