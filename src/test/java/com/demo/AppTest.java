package com.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void addWorks() {
        assertEquals(5, App.add(2, 3));
    }
}
