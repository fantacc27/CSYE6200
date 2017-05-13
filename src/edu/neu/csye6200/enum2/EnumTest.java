/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.enum2;

/**
 *
 * @author Xiao
 */
public class EnumTest {
    enum WeekDay { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY} 
   
   
    private WeekDay currDay = WeekDay.MONDAY;
    public EnumTest(){
       System.out.println("Current day is " + currDay + " ordinal value" + currDay.ordinal());
    }
    
    private void setDay(WeekDay day){
        currDay =day;
        System.out.println("Current day is" + day + " ordinal value " + day.ordinal());
    }
    public static void main(String[] args){
        EnumTest et =new EnumTest();
        et.setDay(WeekDay.SUNDAY);
    }
    
}
