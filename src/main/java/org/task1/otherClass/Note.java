package org.task1.otherClass;

public class Note {
    String inputUser;

    public Note(String inputUser) {
        this.inputUser = inputUser;
    }

    @Override
    public String toString() {
        return inputUser + "\n";
    }
}