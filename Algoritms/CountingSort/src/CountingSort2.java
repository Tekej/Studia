import java.util.stream.IntStream;
public class CountingSort2 {
    public static int[] sort(int[] arr) {
        int size = arr.length;
        int[] sorted = new int[size + 1];
        int maxVal = arr[0];
        for (int i = 1; i < size; i++) if (arr[i] > maxVal) maxVal = arr[i];
        int[] count = new int[maxVal + 1];
        IntStream.range(0, maxVal).forEach(i -> count[i] = 0);
        IntStream.range(0, size).forEach(i -> count[arr[i]]++);
        IntStream.rangeClosed(1, maxVal).forEach(i -> count[i] += count[i - 1]);
        IntStream.range(0, size).forEachOrdered(i -> {
            sorted[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        });
        if (size >= 0) System.arraycopy(sorted, 0, arr, 0, size);
        printArr(arr);
        System.out.println();
        return arr;

    }


public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");

        }
        }


}