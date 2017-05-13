/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.serial;

import java.io.Serializable;

/**
 *
 * @author Xiao
 */
public class CarData implements Serializable, Comparable<CarData> {

    private int iValue = 0;
    private double dValue = 0;
    private String name;

    public CarData(int iValue, double dValue, String name) {
        this.iValue = iValue;
        this.dValue = dValue;
        this.name = name;
    }

    public void setiValue(int iValue) {
        this.iValue = iValue;
    }

    public void setdValue(double dValue) {
        this.dValue = dValue;
    }

    public void setNmae(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(CarData cd) {
        return name.compareTo(cd.name);
    }
}
