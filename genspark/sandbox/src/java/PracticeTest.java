import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PracticeTest {

    Practice practice;
//Before all /access DB, retrieve file etc...ONLY CALLED ONCE BEFORE ANYTHING ELSE

//    RUN ONCE BEFORE EACH TEST METHOD
    @BeforeEach
    void setUp() {
        practice = new Practice();
    }

    @DisplayName("Test Name")
    @Test
    void getName() {
        assertEquals("Brad", practice.getName(), "Get name method crashed.");
    }

    @DisplayName("Test Age")
    @Test
    void getAge() {
        assertEquals(53, practice.getAge(), "Get age method crashed.");
    }

    @AfterEach
    void tearDown() {
    }

//    After all /disconnect from session DB etc...ONLY CALLED ONCE AFTER EVERYTHING ELSE

}