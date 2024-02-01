package com.course.workfiles.exercise.application;

import com.course.workfiles.exercise.entities.Product;
import com.course.workfiles.exercise.entities.Relatory;
import com.course.workfiles.exercise.service.ReaderService;
import com.course.workfiles.exercise.service.RelatoryService;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        String fileName = "C:\\Users\\55799\\Desktop\\Relatorio\\data.csv";

        File file = new File(fileName);

        ReaderService readerService = new ReaderService();

        try {
            List<Product> products = readerService.readFile(file);

            List<Relatory> relatories = new ArrayList<>();

            for (int i = 0; i < products.size(); i++) {
                relatories.add(new Relatory(products.get(i).getName(), products.get(i).getPrice() * products.get(i).getQuantity()));
            }

            RelatoryService relatoryService = new RelatoryService();

            relatoryService.generateRelatory(relatories);
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }

}
