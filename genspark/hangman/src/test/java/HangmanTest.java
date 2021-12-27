import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HangmanTest {
    Hangman hangman;

    @BeforeEach
    void setUp() {
        hangman = new Hangman();
    }

    @DisplayName("Test Retrieve Display")
    @Test
    void retrieveDisplay() { String threeDisplay = """
                        
                        +---+
                          O |
                          | |
                            |
                           === """;
        assertEquals(threeDisplay, hangman.RetrieveDisplay(1), "Retrieve Display method crashed.");
    }
//  assertEquals('the expected return', 'pass in the data () to create expected return', type message should test fail.
    @AfterEach
    void tearDown() {
    }

}