import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
     Main main;

    @BeforeEach
    void setUp() {
        main = new Main();
    }

    @DisplayName("Test for User Response")
    @Test
    void getName() {
        assertEquals("Bill", main.getName("Bill"),"Get Name method crashed.");
    }

    @AfterEach
    void tearDown() {
    }
}

//import com.sun.tools.javac.Main;
//        import org.junit.jupiter.api.AfterEach;
//        import org.junit.jupiter.api.BeforeEach;
//        import org.junit.jupiter.api.DisplayName;
//        import org.junit.jupiter.api.Test;
//
//        import static org.junit.jupiter.api.Assertions.*;

//class MainTest {
//    com.sun.tools.javac.Main main;
//
//    @BeforeEach
//    void setUp() {
//        main = new com.sun.tools.javac.Main();
//    }
//    @DisplayName("Test for User Response")
//    @Test
//    void getName() {
//        assertEquals("Bill", main.getName("Bill"),"Get Name method crashed.");
//    }
//    @AfterEach
//    void tearDown() {
//    }
//
//
//}