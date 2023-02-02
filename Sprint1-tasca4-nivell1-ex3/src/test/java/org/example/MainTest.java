package org.example;

import jdk.jfr.Name;
import org.junit.jupiter.api.Test;
import triggerError.TriggerError;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    @Name("index out of bounds by asking a higher number than list size")
    void triggerError() {

        assertThrows(ArrayIndexOutOfBoundsException.class,()-> TriggerError.triggerError());
    }
}