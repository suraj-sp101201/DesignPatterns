package com.example.designpatterns.creational.builder;

public class Computer {
    private String modelName;

    private String companyName;

    private int noOfCores;

    private Computer(ComputerBuilder computerBuilder) {
        this.modelName = computerBuilder.modelName;
        this.companyName = computerBuilder.companyName;
        this.noOfCores = computerBuilder.noOfCores;
    }

    public static class ComputerBuilder {
        private String modelName;

        private String companyName;

        private int noOfCores;

        public ComputerBuilder() {

        }

        public ComputerBuilder setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        public ComputerBuilder setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        public ComputerBuilder setNoOfCores(int noOfCores) {
            this.noOfCores = noOfCores;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
