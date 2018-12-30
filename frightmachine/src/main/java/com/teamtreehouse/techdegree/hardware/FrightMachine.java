package com.teamtreehouse.techdegree.hardware;

import com.example.accessory.Accessory;
import com.example.motion.MotionDetector;

import java.util.ArrayList;
import java.util.List;

public class FrightMachine extends MotionDetector {

    private List<Accessory> accessoryList = new ArrayList<>();

    public void addAccessory(Accessory accessory) {
        accessoryList.add(accessory);
    }

    @Override
    public void onMotionDetected() {
        for(Accessory accessory : accessoryList){
            accessory.activate();
        }
    }
}
