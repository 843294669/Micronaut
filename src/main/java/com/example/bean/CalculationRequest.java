package com.example.bean;

public class CalculationRequest {
    private double A1;
    private double A2;

    public double getA1() {
        return A1;
    }

    public double getA2() {
        return A2;
    }

    public void setA2(double a2) {
        A2 = a2;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public void setA1(double a1) {
        A1 = a1;
    }

    private String formula;

}