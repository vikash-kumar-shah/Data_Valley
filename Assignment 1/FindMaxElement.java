//Arrays
// 2)write a java code to find the maximum element in array


public class FindMaxElement {

  public static void main(String[] args) {
    int[] arr = {3, 8, 1, 2, 5, 2, 1};

    int max = arr[0];

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }

    System.out.println("Maximum element: " + max);
  }
}