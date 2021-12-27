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

    @AfterEach
    void tearDown() {
    }

}