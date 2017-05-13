/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xiao
 */
public class Solution2 {

    int mini = 0;
    String[] words = new String[]{
        "ptolemaic",
        "retrograde",
        "supplant",
        "undulate",
        "xenoepist",
        "asymptote", // <-- rotates here!
        "babka",
        "banoffee",
        "engender",
        "karpatka",
        "othellolagkage",};

    public Solution2() {

    }

    public int findRotationPoint() {
        int mini = 0;
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].compareTo(words[i + 1]) > 0) {
                mini = i + 1;
            }
        }
        return mini;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int b = s.findRotationPoint();
        System.out.println("The rotation point is " + b);
    }
}
