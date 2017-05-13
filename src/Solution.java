
public class Solution {

    int[] a = null;

    public int[] getProductsOfAllIntsExceptAtIndex() {
        int[] a = new int[4];
        a[0] = 1;
        a[1] = 7;
        a[2] = 3;
        a[3] = 4;
        
        int[] b = {1, 1, 1, 1};
        for (int i = 0; i < a.length; i++) {
            //temp = a[i];
            for (int j = 0; j < a.length; j++) {
                if (j != i) {
                    b[i] = b[i] * a[j];
                }
                //b[i] = b[i] / temp ^ 2;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] b = s.getProductsOfAllIntsExceptAtIndex();
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
