package com.company;

public class Car {

        public String make;
        public String model;
        public int mileage;
        public float gasTankPercent;

        public Car(String make, String model, int mileage, float gasTankPercent) {
            this.make = make;
            this.model = model;
            this.mileage = mileage;
            this.gasTankPercent = gasTankPercent;
        }

        public String getMake() {
            String Car1 = "Volkswagen";
            String Car2 = "Ford";
            String Car3 = "Tesla";
            return make;
        }

        public void setMake(String make) {
            String Car1 = "Volkswagen";
            String Car2 = "Ford";
            String Car3 = "Tesla";
            this.make = make;
        }

        public String getModel() {
            String Car1 = "Beetle";
            String Car2 = "Mustang";
            String Car3 = "Model S";
            return model;
        }

        public void setModel(String model) {
            String Car1 = "Beetle";
            String Car2 = "Mustang";
            String Car3 = "Model S";
            this.model = model;
        }

        public int getMileage() {
            int Car1 = 100_000;
            int Car2 = 75_000;
            int Car3 = 65_000;
            return mileage;
        }

        public void setMileage(int mileage) {
            int Car1 = 100_000;
            int Car2 = 75_000;
            int Car3 = 65_000;
            this.mileage = mileage;
        }

        public float getGasTankPercent() {
            float Car1 = 80;
            float Car2 = 72;
            float Car3 = 68;
            return gasTankPercent;
        }

        public void setGasTankPercent(float gasTankPercent) {
            float Car1 = 80;
            float Car2 = 72;
            float Car3 = 68;
            this.gasTankPercent = gasTankPercent;
        }
    }

