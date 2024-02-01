package com.course.workfiles.exercise.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReaderService {

    public List<List<String>> readFile(File file) throws IOException {

        try (Scanner sc = new Scanner(file)) {
            List<List<String>> data = new ArrayList<>();

            while (sc.hasNextLine()) {
                data.add(Arrays.stream(sc.nextLine().split(",")).collect(Collectors.toList()));
            }

            return data;
        }
        catch (IOException e) {
            throw new IOException(e.getMessage());
        }

    }

}
