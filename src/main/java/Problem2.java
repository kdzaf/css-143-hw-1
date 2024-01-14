public class Problem2 {

    // Do not change signature (function name, parameters, return type)
    public static void bubbleSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (data[j] > data[j + 1]) {
                    // Swap elements if they are out of order
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }
    //Return the number of comparisons
    public static int numberOfComparisons(int n) {
        return n * (n - 1) / 2;
    }
}
    // For bubble sort, the number of comparisons is approximately n^2/2
    // as each element is compared with every other element.

