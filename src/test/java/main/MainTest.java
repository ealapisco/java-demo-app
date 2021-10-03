package main;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void greetingTest() {
        String greeting = Main.getGreeting();
        String expectedGreeting = "hello world!";
        assertEquals(greeting, expectedGreeting);
    }

}
