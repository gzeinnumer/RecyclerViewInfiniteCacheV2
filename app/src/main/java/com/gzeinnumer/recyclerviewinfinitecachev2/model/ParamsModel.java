package com.gzeinnumer.recyclerviewinfinitecachev2.model;

public class ParamsModel {
    private String angka1;

    //res
    private String angka2;
    private String hasil;

    public ParamsModel(String angka1) {
        this.angka1 = angka1;
    }

    public String getAngka1() {
        return angka1;
    }

    public void setAngka1(String angka1) {
        this.angka1 = angka1;
    }

    public String getAngka2() {
        return angka2;
    }

    public void setAngka2(String angka2) {
        this.angka2 = angka2;
    }

    public String getHasil() {
        return hasil;
    }

    public void setHasil(String hasil) {
        this.hasil = hasil;
    }

    @Override
    public String toString() {
        return "ParamsModel{" +
                "angka1=" + angka1 +
                ", angka2=" + angka2 +
                ", hasil=" + hasil +
                '}';
    }

}
