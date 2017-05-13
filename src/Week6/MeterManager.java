/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week6;

import java.util.ArrayList;

/**
 *
 * @author Xiao
 */
public class MeterManager {

    private static MeterManager instance = null;
    private ArrayList<MeterI> meterList = new ArrayList<MeterI>();

    private MeterManager() {

    }

    public static MeterManager instance() {
        if (instance == null) {
            instance = new MeterManager();
        }
        return (instance);
    }

    public void add(MeterI meteri) {
        meterList.add(meteri);
    }

    public void displayMeters() {
        System.out.println("    Resistivity     Measure:");
        for (MeterI meteri : meterList) {
            String fTxt = String.format("Measure: %1$8.2f %2$8.3f",
                    meteri.getResistivity(), meteri.getMeasure());
            System.out.println(fTxt);
        }
    }

}
