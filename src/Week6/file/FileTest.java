/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week6.file;

import java.io.File;

/**
 *
 * @author Xiao
 */
public class FileTest {

    public void run() {
        File basedir = new File(".");
        if (!basedir.exists()) {
            basedir.mkdirs();

        }
        listDir(basedir);
    }

    public void listDir(File dirFile) {
        if (!dirFile.isDirectory()) {
            return;
        }

        System.out.println("Dir: " + dirFile.getAbsolutePath());
        for (File file : dirFile.listFiles()) {
            if (file.isDirectory()) {
                continue;
            }
            String fTxt = String.format("%1$32s %2$8d",
                    file.getName(), file.length());
            System.out.println(fTxt);
        }
        for (File file : dirFile.listFiles()) {
            if (file.isDirectory()) {
                listDir(file);
            }
        }
    }

    public static void main(String[] args) {
        FileTest fileTest = new FileTest();
        fileTest.run();
    }

}
