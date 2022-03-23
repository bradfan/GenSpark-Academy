import static org.junit.jupiter.api.Assertions.*;

class HangmanAppTest {
    HangmanApp app = new HangmanApp();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void points() {
    }

    @org.junit.jupiter.api.Test
    void highScore() {
        assertEquals(100, app.highScore(100));
        assertNotEquals(100, app.highScore(0));
        assertNotEquals(300, app.highScore(100));
    }
}