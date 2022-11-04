package com.gzeinnumer.recyclerviewinfinitecachev2.model;

public class ParamsModel {
    private String angka1;
    private Result result;

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    //res

    public ParamsModel(String angka1) {
        this.angka1 = angka1;
        this.result = new Result();
    }

    public String getAngka1() {
        return angka1;
    }

    public void setAngka1(String angka1) {
        this.angka1 = angka1;
    }


    @Override
    public String toString() {
        return "ParamsModel{" +
                "angka1='" + angka1 + '\'' +
                ", result=" + result.toString() +
                '}';
    }

    public static class Result{

        private String angka2;
        private String hasil;

        public Result() {
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
            return "Result{" +
                    "angka2='" + angka2 + '\'' +
                    ", hasil='" + hasil + '\'' +
                    '}';
        }
    }
}
