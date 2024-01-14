public class Problem1 {

    // Do not change signature (function name, parameter variable type and return type)
    public static int binarySearch(int[] data, int target) {

        int mid;
        int low = 0;
        int high;

        high = data.length - 1;

        while (high >= low) {
            mid = (high + low) / 2;
            if (data[mid] < target) {
                low = mid + 1;
            } else if (data[mid] > target) {
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return -1; // not found
    }

    }
   // I could prove that my code works my testing it with values I know are in the array to see if my code
   // recognizes that the number exists as well as check to see if my code identifiies the index. Also, purposefully testing
   // with numbers I know aren't in the array to make sure the code outputs the needed output in this cas "-1"



