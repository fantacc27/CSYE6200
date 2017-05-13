/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xiao
 */
public class removeElement {
  
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int result = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == val){
                count++;
            }
        }result = nums.length - count;
        return result;
    }
    public static void main(String[] args){
        removeElement re = new removeElement();
        int[] a = {3,2,2,3};
        System.out.println(re.removeElement(a, 3));
    }
}


