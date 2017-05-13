/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Xiao
 */
public class SerialTest {

    public void streamOut(CarData cardata, String filename) {
        try {
            FileOutputStream fos = new FileOutputStream(filename);

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(cardata);
            oos.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public CarData streamIn(String filename) {
        CarData cardata = null;
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            cardata = (CarData) ois.readObject();
            ois.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return cardata;
    }

    public static void main(String[] args) {
        SerialTest st = new SerialTest();

        CarData carData = new CarData(1, 2.0, "Ford");
        st.streamOut(carData, "auto.data");
        CarData carData2 = st.streamIn("auto.data");
        System.out.println("CarData2 is " + carData2.getName());
        ArrayList<CarData> carList = new ArrayList<CarData>();
        carList.add(new CarData(0,1.0,"Chevy"));
        carList.add(new CarData(1,1.0,"BMW"));
        carList.add(new CarData(2,1.0,"Land Rover"));
        carList.add(new CarData(3,1.0,"Audi"));
        carList.add(new CarData(4,1.0,"Mercedes"));
        
        Collections.sort(carList);
        System.out.println("List is sorted");
    }
}
