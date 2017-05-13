/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week6;

/**
 *
 * @author Xiao
 */
public class InheritTest {

    public InheritTest() {

    }

    public void run() {
        Meter m0 = new Meter();
        displayMeter(m0);
        System.out.println(m0.calcProbeMeasure());
        MeterManager meterMgr = MeterManager.instance();
        meterMgr.add(m0);
        meterMgr.displayMeters();
    }

    public void displayMeter(MeterI meter) {
        double resistivity = meter.getResistivity();
        System.out.println("Resistivity for meter is: " + resistivity);

        if (meter instanceof Meter) {
            Meter im0 = (Meter) meter;
            System.out.println("Measure is: " + im0.getProbeVal());
        }
    }

    public static void main(String[] args) {
        InheritTest iht = new InheritTest();
        iht.run();
    }

}
