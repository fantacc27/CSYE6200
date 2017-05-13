
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Xiao
 */
public class digui {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] b = scan.nextLine().toCharArray();
        int a = Integer.parseInt(scan.nextLine());
        System.out.println(a + b[0]);
    }
}
