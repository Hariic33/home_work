package io.codelexTest.javaAdvancedTest.exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JoinerTest {
    @Test
    public void testJoin() {
        Joiner<Integer> joiner = new Joiner<>("-");

        String joinedString = joiner.join(1, 2, 3, 4);

        assertEquals("1-2-3-4", joinedString);
    }
}