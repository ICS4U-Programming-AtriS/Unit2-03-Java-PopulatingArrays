import java.util.Random;
import java.util.Arrays;
/**
* Program that fills up an array with random integers.
* It then sorts that array and displays it,
* and subsequently displays the average.
*
* @author  Atri Sarker
* @version 1.0
* @since   2025-10-13
*/
public final class PopulatingArrays {

  /**
   * Constant for the size of the array.
   */
  public static final int ARRAY_SIZE = 10;
  /**
   * Constant for the minimum random integer.
   */
  public static final int MIN_NUM = 0;
  /**
   * Constant for the maximum random integer.
   */
  public static final int MAX_NUM = 100;

  /**
   * Private constructor to satisfy style checker.
   * @exception IllegalStateException for the utility class.
   * @see IllegalStateException
   */
  private PopulatingArrays() {
    // Prevents illegal states.
    throw new IllegalStateException("Utility class.");
  }

  /**
   * Function that generates an array filled with random integers.
   * It also prints the array.
   *
   * @param minNum    The minimum number [INCLUSIVE] for the random integers.
   * @param maxNum    The maximum number [INCLUSIVE] for the random integers.
   * @param arraySize The size of the array that's going to be generated.
   * @return An array of size {arraySize} filled up with
   *         random integers between {minNum} and {maxNum}.
   */
  public static int[] populateArray(final int minNum,
      final int maxNum, final int arraySize) {
    // Create an array of size {arraySize}
    final int[] arr = new int[arraySize];
    // Create instance of Random class
    final Random rand = new Random();
    // Go through every index of the array
    // And populate it with a random integer between {minNum} and {maxNum}
    for (int index = 0; index < arraySize; index++) {
      // Generate a random integer between {minNum} and {maxNum} [INCLUSIVE]
      final int randNum = rand.nextInt(1 + maxNum - minNum) + minNum;
      // Assign the random integer to the current index of the array
      arr[index] = randNum;
      // Print the random integer [no newline]
      System.out.printf("%d ", randNum);
    }
    // Print a newline
    System.out.println();
    // Return the populated array
    return arr;
  }

  /**
   * Function that sorts an array and calculates its average.
   * It also prints the sorted array and the average.
   * @param arr The array that's going to be sorted and displayed.
   */
  public static void calculateAverage(final int[] arr) {
    // Sort the array in ascending order using Arrays.sort
    Arrays.sort(arr);
    // Variable to initialize the total sum of the array
    double sum = 0;
    // Go through every number in the newly sorted array
    for (final int num : arr) {
      // Display the number
      System.out.printf("%d ", num);
      // Increment the sum
      sum += num;
    }
    // Calculate the average
    final double average = sum / arr.length;
    // Print the average
    System.out.println("Average: " + average);
  }

  /**
   * Entrypoint of the program.
   * @param args UNUSED.
   */
  public static void main(final String[] args) {
    // Call populateArray() to fill up the array with random integers
    // populateArray() also displays the generated array
    int[] arr = populateArray(MIN_NUM, MAX_NUM, ARRAY_SIZE);
    // call calculateAverage() to sort the array and calculate its average
    // calculateAverage() also displays the sorted array and the average
    calculateAverage(arr);
  }
}
