package com.company;

public class Main {

    public static void main(String[] args) {
        Computer comp = new Computer.ComputerBuilder(
                "2000 GB", "16 GB").setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true).build();
    }
}
