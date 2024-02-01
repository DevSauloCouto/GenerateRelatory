package com.course.workfiles.exercise.service;

import com.course.workfiles.exercise.entities.Relatory;

import java.io.File;
import java.util.List;

public class RelatoryService {

    public void generateRelatory(List<Relatory> relatories) {
        String outFolder = "C:\\Users\\55799\\Desktop\\Relatorio\\out\\";

        boolean isCreatedDir = new File(outFolder).mkdir();

        System.out.println(isCreatedDir ? "created folder" : "error create folder or folder exist");

        WriterService writerService = new WriterService();

        writerService.writeFile(outFolder + "summary.csv", relatories);
    }

}
