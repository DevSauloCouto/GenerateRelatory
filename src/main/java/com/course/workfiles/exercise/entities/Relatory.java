package com.course.workfiles.exercise.entities;

public class Relatory {

    private String prodName;
    private Double total;

    public Relatory(String prodName, Double total) {
        this.prodName = prodName;
        this.total = total;
    }

    public String getProdName() {
        return prodName;
    }

    public Double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return prodName + "," + total + "\n";
    }

}
