package com.saimao.Lesson52_InnerClass;

public class Phone {

    private String brand;
    private String name;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    class Cpu {
        private String model;

        public void printInfo() {
            System.out.printf("Phone brand - %s%nName - %s%nCPU Model - %s", brand, name, model);
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }
    }

    class Ram {
        private int capacity;

        public void printInfo() {
            System.out.printf("Phone brand - %s%nName - %s%nRam Capacity - %d", brand, name, capacity);
        }

        public int getCapacity() {
            return capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }
    }

}
