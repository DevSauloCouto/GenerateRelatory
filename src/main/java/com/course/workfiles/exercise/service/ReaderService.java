package com.course.workfiles.exercise.service;

import com.course.workfiles.exercise.entities.Product;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderService {

    public List<Product> readFile(File file) throws IOException {

        try (Scanner sc = new Scanner(file)) {
            List<Product> products = new ArrayList<>();

            while (sc.hasNextLine()) {
                String[] line = sc.nextLine().split(",");
                products.add(new Product(line[0], Double.parseDouble(line[1]), Double.parseDouble(line[2])));
            }

            return products;
        }
        catch (IOException e) {
            throw new IOException(e.getMessage());
        }

    }

}
