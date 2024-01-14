import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem2Test {

    @Test
    public void testBubbleSort() {
        int[][] inputs = {
                {3, 2, 1},
                {5, 1, 4, 2, 8},
                {9, 7, 5, 3, 1},
                {2, 4, 6, 8, 10},
                {1, 1, 1, 1, 1},
                {-3, -7, -1, -5, -2}
                // TODO: add more test case inputs
        };
        int[][] expects = {
                {1, 2, 3},
                {1, 2, 4, 5, 8},
                {1, 3, 5, 7, 9},
                {2, 4, 6, 8, 10},
                {1, 1, 1, 1, 1},
                {-7, -5, -3, -2, -1}
                // TODO: add more test case expected sorted results
        };

        // TODO: add a check to verify inputs and expects have the same amount of arrays

        for (int i = 0; i < inputs.length; i++) {

            Problem2.bubbleSort(inputs[i]);

            for (int j = 0; j < inputs[i].length; j++) {

                // this checks whether the actual result matches the expects result
                // note the use of assertArrayEquals instead of assertEquals here
                // less code == less chance of mistake
                assertArrayEquals("Test Case " + (i + 1),expects[i], inputs[i]);
            }
        }
    }
}
