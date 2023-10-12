package org.task1;

import org.task1.otherClass.Note;
import org.task1.otherClass.Service;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заметку:");
        Scanner sc = new Scanner(System.in);
        Note note = new Note(sc.nextLine());
        sc.close();

        try {
            new Service().write(note.toString(), "file.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}