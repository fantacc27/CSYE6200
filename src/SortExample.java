
/**
 *
 */

/**
 * @author mgmunson
 *
 */
public class SortExample {

    /**
     * A quick sort example - not very efficient, but it's short
     */
    public static void main(String[] args) {
        String data[] = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight"};

        for (int i = 0; i < data.length - 1; i++) {  // Each pass pushes the highest value to the end of the list
            for (int j = 0; j < ((data.length - 1) - i); j++) { // After each pass, the number of unsorted items grows shorter
                String val0 = data[j];
                String val1 = data[j + 1];
                if (val0.compareTo(val1) > 0) { // We found items that are out of order, so swap them
                    data[j] = val1;
                    data[j + 1] = val0;
                }
            }
        }

        // Check the results
        for (String str : data) {
            System.out.println(str);
        }
    }

}
