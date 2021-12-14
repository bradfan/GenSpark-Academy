package com.company;

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
    void userResponse() {
        assertEquals("You approach the cave...\n" +
                "It is dark and spooky...\n" +
                "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                "Gobbles you down in one bite!!", main.userResponse(1), "User response method crashed.");
    }

    @AfterEach
    void tearDown() {
    }

}

//You approach the cave...\n" +
//                "                It is dark and spooky...\n" +
//                "                A large dragon jumps out in front of you! He opens his jaws and...