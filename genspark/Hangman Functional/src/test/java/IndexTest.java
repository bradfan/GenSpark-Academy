import org.junit.jupiter.api.Test;

import java.awt.image.BandCombineOp;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IndexTest {
     Index index = new Index();


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void determineWord() {
        Index.wordBank.stream().forEach(w -> assertTrue(Index.wordBank.contains(index.determineWord())));
    }

    @org.junit.jupiter.api.Test
    void isCorrectLetter() {
        assertTrue(index.isCorrectLetter("cat", "a"));
        assertFalse(index.isCorrectLetter("cat", "b"));
        assertFalse(index.isCorrectLetter("cat", "@"));

    }
//@Test
//void retrieveDisplay() {
//        assertEquals("""
//                +---+
//                    |
//                    |
//                    |
//                   ===
//                """, index.retrieveDisplay(3));
//}

@Test
    void displayWord() {
        assertEquals("_ a _", index.displayWord("cat", "a"));
        assertEquals("c _ _", index.displayWord("cat", "c"));
        assertEquals("c a t", index.displayWord("cat", "cat"));
        assertEquals("c a t", index.displayWord("cat", "tac"));
        assertEquals("_ _ _", index.displayWord("cat", "x"));

}


}