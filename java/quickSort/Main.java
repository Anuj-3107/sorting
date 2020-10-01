 // quickSort .................Below

import java.util.Arrays;

class Main {
  int partition(int arr[], int low, int high) {
    int pivot = arr[high];
    int i = (low - 1);
    for (int j = low; j < high; j++) {
      if (arr[j] <= pivot) {
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;
    return (i + 1);
  }
  void quickSort(int arr[], int low, int high) {
    if (low < high) {
      int pi = partition(arr, low, high);
      quickSort(arr, low, pi - 1);
      quickSort(arr, pi + 1, high);
    }
  }

  public static void main(String args[]) {
    int[] data = { 3, 1, 4, 9, 0, 12, 6 };
    int size = data.length;
    Main qs = new Main();
    qs.quickSort(data, 0, size - 1);
    System.out.println("Sorted Array is the following -> ");
    System.out.println(Arrays.toString(data));
  }
}
