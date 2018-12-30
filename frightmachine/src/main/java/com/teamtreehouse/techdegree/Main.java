package com.teamtreehouse.techdegree;

import com.example.accessory.Horn;
import com.example.accessory.Strobe;
import com.teamtreehouse.techdegree.hardware.Camera;
import com.teamtreehouse.techdegree.hardware.FrightMachine;

public class Main {
    public static void main(String[] args) {
        FrightMachine machine = new FrightMachine();

        Camera camera = new Camera(7);
        Horn horn = new Horn();
        Strobe strobe = new Strobe();

        machine.addAccessory(camera);
        machine.addAccessory(horn);
        machine.addAccessory(strobe);

        machine.simulateMotion();
    }
}
