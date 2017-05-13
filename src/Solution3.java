/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xiao
 */
public class Solution3 {
   
    public int fib(int n){
        int[] f = new int[n+1];
        f[0] = 0;
        f[1] = 1;
        for(int i = 0; i < n -1 ; i++){
            f[i+2] = f[i+1] + f[i];
        }
        return f[n];
    }
    public static void main(String[] args){
        Solution3 s = new Solution3();
        System.out.println(s.fib(3));
    }
}
