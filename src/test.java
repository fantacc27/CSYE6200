/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xiao
 */
public class test {

    int i = 63;

    public void run() {
        
        while (true) {
            if (i % 9 == 0 && i % 8 == 1 && i % 7 == 0 && i % 6 == 3 && i % 5 == 4 && i % 4 == 1 && i % 3 == 0 && i % 2 == 1) {
                System.out.println(i);
                break;
            } else {
                i += 63;
            }

        }
    }

    public static void main(String[] args) {
        test t = new test();
        t.run();
    }
}
