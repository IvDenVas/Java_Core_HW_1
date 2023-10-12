package org.task1.otherClass;
import java.io.IOException;

public interface Writable {
    void write(String string, String name) throws RuntimeException, IOException;
}