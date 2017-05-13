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
public abstract class MeterA {
    private double probeVal = 12.3;
    public double getProbeVal(){
        return probeVal;
    }
    
    public abstract double calcProbeMeasure();
    
}
