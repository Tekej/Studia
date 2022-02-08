public class CountingSort {
    public static int[] sort(int[] arr) {
        boolean cond = true;


        if (arr.length > 0 && arr.length < 10000) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 1000 || arr[i] < -1000) {
                    cond = false;
                }
            }
        }
        if (cond) {
            int arrayLen = arr.length;
            int max = arr[0], min = arr[0];
            for (int i = 1; i < arrayLen; i++) {
                if (arr[i] > max)
                    max = arr[i];
                if (arr[i] < min)
                    min = arr[i];
            }
            int range = max - min + 1;

            int[] count = new int[range];
            for (int i = 0; i < arrayLen; i++)
                count[arr[i] - min]++;
            for (int i = 1; i < range; i++)
                count[i] += count[i - 1];
            int j = 0;
            for (int i = 0; i < range; i++)
                while (j < count[i])
                    arr[j++] = i + min;

        }

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
