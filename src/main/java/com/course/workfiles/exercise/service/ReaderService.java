package com.course.workfiles.exercise.service;

import com.course.workfiles.exercise.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderService {

    public List<Product> readFile(File file) throws IOException {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            List<Product> products = new ArrayList<>();

            while (bufferedReader.ready()) {
                String[] line = bufferedReader.readLine().split(",");
                products.add(new Product(line[0], Double.parseDouble(line[1]), Double.parseDouble(line[2])));
            }

            return products;
        }
        catch (IOException e) {
            throw new IOException(e.getMessage());
        }

    }

}
