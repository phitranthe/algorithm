package org.example;

/**
 * Find longest sequence of zeros in binary representation of an integer.
 */
public class BinaryGapSolution {

    /**
     * The solution contain 2 steps:
     * Step 1: convert the number into binary string.
     * Step 2: loop through the string and handle the count.
     * @param N
     * @return
     */
    public int solution(int N) {
        // Convert N to binary representation
        String binary = Integer.toBinaryString(N);
        System.out.println("The binary look like this: " + binary);
        int maxGap = 0;
        int currentGap = 0;

        // Loop through the binary string
        for (char c : binary.toCharArray()) {
            if (c == '1') {
                maxGap = Math.max(maxGap, currentGap); // Update max gap if needed
                currentGap = 0; // Reset gap count after encountering '1'
            } else {
                currentGap++; // Increment gap count when encountering '0'
            }
        }

        return maxGap; // Return the longest binary gap
    }

    public static void main(String[] args) {
        BinaryGapSolution solution = new BinaryGapSolution();
        int result = solution.solution(2147483647);
        System.out.println("The result is: " + result);
    }
}
