package org.task2;

import org.task2.otherClass.Service;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            new Service().write("Hello.World!\n", "file2.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}