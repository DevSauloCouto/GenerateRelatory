package com.course.workfiles.exercise.service;

import com.course.workfiles.exercise.entities.Relatory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriterService {

    public void writeFile(String fileName,  List<Relatory> relatories) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName, true))) {
            relatories.forEach( relatory -> {
                try {
                    bufferedWriter.write(String.valueOf(relatory));
                }
                catch (IOException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            });
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


}
