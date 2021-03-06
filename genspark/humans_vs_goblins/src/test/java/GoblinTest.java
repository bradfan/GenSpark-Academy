import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GoblinTest {
    Goblin goblin;

    @BeforeEach
    void setUp() { goblin = new Goblin(); }

    @DisplayName("Test Goblin getHitPoints")
    @Test
    void getHitPoints() {
        assertEquals(10, goblin.getHitPoints(), "This method has crashed.");
    }
    //  assertEquals('the expected return', 'pass in the data () to create expected return', type message should test fail.


    @AfterEach
    void tearDown() {
    }





}
