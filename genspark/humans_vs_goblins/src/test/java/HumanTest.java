import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HumanTest {
    Human human;

    @BeforeEach
    void setUp() { human = new Human(); }


    @DisplayName("Test setLocation")
    @Test
    void setLocation() {
        assertEquals(1, human.setLocation(1), "This method has crashed.");
    }
    //  assertEquals('the expected return', 'pass in the data () to create expected return', type message should test fail.


    @AfterEach
    void tearDown() {
    }




}
