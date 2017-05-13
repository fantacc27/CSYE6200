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
public class Meter extends MeterA implements MeterI{

    protected double current = 1.0;
    protected double voltage = 12.0;

    public Meter() {

    }

    public double getResistivity() {
        return voltage / current;
    }

    @Override
    public double getMeasure() {
        return current * 10.0 / voltage;
    }

    @Override
    public double calcProbeMeasure() {
        return getProbeVal() * 2.4;
    }
}
