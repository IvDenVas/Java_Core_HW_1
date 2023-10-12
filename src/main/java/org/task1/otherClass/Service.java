package org.task1.otherClass;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Service implements Writable {

    public Service() {
    }

    @Override
    public void write(String str, String name) throws RuntimeException, IOException {
        FileWriter fw = new FileWriter(name, true);
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String formatDate = localDate.format(formatter);
        fw.write(formatDate + " -> " + str);
        System.out.println("Запись в файл завершена!");
        fw.close();
    }
}