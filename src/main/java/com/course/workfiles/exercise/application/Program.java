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

        ReaderService readerService = new ReaderService("C:\\Users\\55799\\Desktop\\Relatorio\\data.csv");

        try {
            List<Product> products = readerService.readFile();

            RelatoryService relatoryService = new RelatoryService();

            List<Relatory> relatories = relatoryService.listRelatories(products);

            relatoryService.generateRelatory(relatories);
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }

}
