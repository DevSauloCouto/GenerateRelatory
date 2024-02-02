package com.course.workfiles.exercise.service;

import com.course.workfiles.exercise.entities.Product;
import com.course.workfiles.exercise.entities.Relatory;
import com.sun.security.jgss.GSSUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RelatoryService {

    public List<Relatory> listRelatories(List<Product> products) {
        List<Relatory> relatories = new ArrayList<>();

        products.forEach(product -> {
            relatories.add(new Relatory(product.getName(), product.getPrice() * product.getQuantity()));
        });

        return relatories;
    }

    public void generateRelatory(List<Relatory> relatories) {
        String outFolder = "C:\\Users\\55799\\Desktop\\Relatorio\\out\\";

        File file = new File(outFolder);

        if(file.exists()) {
            File[] files = file.listFiles(File::isFile);

            Arrays.stream(files).forEach(File::delete);

            boolean isDeleteDir = file.delete();

            boolean isCreateDir = new File(outFolder).mkdir();

            WriterService writerService = new WriterService();

            writerService.writeFile(outFolder + "summary.csv", relatories);

        } else {
            System.out.println("Arquivo criado");
            boolean isCreatedDir = new File(outFolder).mkdir();

            WriterService writerService = new WriterService();

            writerService.writeFile(outFolder + "summary.csv", relatories);
        }

    }

}
