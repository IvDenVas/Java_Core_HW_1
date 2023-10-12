package org.task2.otherClass;
import java.io.IOException;

public interface Writable {
    void write(String string, String name) throws RuntimeException, IOException;
}