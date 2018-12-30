package com.teamtreehouse.techdegree.hardware;

import com.example.accessory.Horn;
import com.example.accessory.Strobe;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import static org.hamcrest.core.AllOf.allOf;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

public class FrightMachineTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    private FrightMachine machine;

    @Before
    public void setUp() throws Exception {
        machine = new FrightMachine();
    }

    @Test
    public void whenMotionIsDetectedExpectedPluginsKickOff() throws Exception {
        Camera camera = new Camera(5);
        Horn horn = new Horn();
        Strobe strobe = new Strobe();

        machine.addAccessory(camera);
        machine.addAccessory(horn);
        machine.addAccessory(strobe);
        machine.simulateMotion();

        assertThat(systemOutRule.getLog()
            ,allOf(containsString("Photo #5 taken")
                ,containsString("BEEEEEEEP!")
                ,containsString("Flashing lights!!!  Flash, flash, flash")));
    }
}
