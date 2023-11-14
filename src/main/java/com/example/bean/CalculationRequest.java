package com.example.bean;

import java.util.Map;

public class CalculationRequest {
    protected Map<String, String> cellMap;
    private String formula;

    public Map<String, String> getCellMap() {
        return cellMap;
    }

    public void setCellMap(Map<String, String> cellMap) {
        this.cellMap = cellMap;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }



}