package com.course.workfiles.exercise.application;

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
            List<List<String>> datas = readerService.readFile(file);

            List<Relatory> relatories = new ArrayList<>();

            for (int i = 0; i < datas.size(); i++) {
                Double total = Double.parseDouble(datas.get(i).get(1)) * Double.parseDouble(datas.get(i).get(2));

                relatories.add(new Relatory(datas.get(i).get(0), total));
            }

            RelatoryService relatoryService = new RelatoryService();

            relatoryService.generateRelatory(relatories);
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }

}
