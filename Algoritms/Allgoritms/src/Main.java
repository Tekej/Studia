public class Main {


    public static void main(String[] args) {
        int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
        sortInt(arr);
        double[] arr1 = {5.0, 4.4, 1.9, 2.9, 3.4, 4.3, 3.5};
        sortDouble(arr1);
        char[] arr2 = {'a','d','b','c','A','H'};
        sortChar(arr2);
        float[] arr3 = {1f,2f,0f,4.2f,4.1f};
        sortFloat(arr3);
    }
    public static void sortInt(int[] numbers) {
        long x,y;
        System.out.println("-------------For int[]--------------\n");

        System.out.println("\n"+"Insertion Sort : ");
        x = System.nanoTime();
        print(InsertionSort.sort(numbers.clone()));
        y = System.nanoTime();
        System.out.println("Time for realization :" + (y - x));

        System.out.println("\n"+ "Selection Sort: ");
        x = System.nanoTime();
        print(SelectionSort.sort(numbers.clone()));
        y = System.nanoTime();
        System.out.println("Time for realization :" + (y - x));

        System.out.println("\n"+"Merge Sort :");
        x = System.nanoTime();
        print(MergeSort.sort(numbers.clone(),0,numbers.length-1));
        y = System.nanoTime();
        System.out.println("Time for realization :" + (y - x));

        System.out.println("\n"+"Heap Sort: ");
        x = System.nanoTime();
        print(HeapSort.sort(numbers.clone()));
        y = System.nanoTime();
        System.out.println("Time for realization :" + (y - x));

        System.out.println("\n"+"Quick Sort: ");
        x = System.nanoTime();
        print(QuickSort.quickSort(numbers.clone(),0,numbers.length-1));
        y = System.nanoTime();
        System.out.println("Time for realization :" + (y - x));

        System.out.println("\n"+"Bubble Sort: ");
        x = System.nanoTime();
        print(BubbleSort.bubbleSort(numbers.clone()));
        y = System.nanoTime();
        System.out.println("Time for realization :" + (y - x));

        System.out.println("\n"+"Bucket Sort: ");
        x = System.nanoTime();
        print(BucketSort.bucketSort(numbers.clone(),BucketSort.maxValue(numbers)));
        y = System.nanoTime();
        System.out.println("Time for realization :" + (y - x));

        System.out.println("\n"+"Radix Sort: ");
        x = System.nanoTime();
        print(Radix_Sort.radixSort(numbers.clone(), numbers.length));
        y = System.nanoTime();
        System.out.println("Time for realization :" + (y - x));
    }

    public static void sortDouble(double[] numbers) {
        long x,y;
        System.out.println("\n\n------------For doble[]----------------\n");

        System.out.println("\n"+"Insertion Sort : ");
        x = System.nanoTime();
        print(InsertionSort.sort(numbers.clone()));
        y = System.nanoTime();
        System.out.println("Time for realization :" + (y - x));

        System.out.println("\n"+ "Selection Sort: ");
        x = System.nanoTime();
        print(SelectionSort.sort(numbers.clone()));
        y = System.nanoTime();
        System.out.println("Time for realization :" + (y - x));

        System.out.println("\n"+"Merge Sort :");
        x = System.nanoTime();
        print(MergeSort.sort(numbers.clone(),0,numbers.length-1));
        y = System.nanoTime();
        System.out.println("Time for realization :" + (y - x));

        System.out.println("\n"+"Heap Sort: ");
        x = System.nanoTime();
        print(HeapSort.sort(numbers.clone()));
        y = System.nanoTime();
        System.out.println("Time for realization :" + (y - x));

        System.out.println("\n"+"Quick Sort: ");
        x = System.nanoTime();
        print(QuickSort.quickSort(numbers.clone(),0,numbers.length-1));
        y = System.nanoTime();
        System.out.println("Time for realization :" + (y - x));

        System.out.println("\n"+"Bubble Sort: ");
        x = System.nanoTime();
        print(BubbleSort.bubbleSort(numbers.clone()));
        y = System.nanoTime();
        System.out.println("Time for realization :" + (y - x));

        System.out.println("\n"+"Bucket Sort: ");
        x = System.nanoTime();
        print(BucketSort.bucketSort(numbers.clone(), (int) BucketSort.maxValue(numbers)));
        y = System.nanoTime();
        System.out.println("Time for realization :" + (y - x));

        System.out.println("\n"+"Radix Sort: ");
        System.out.println("Time before: "+ System.nanoTime());
//        print(Radix_Sort.radixSort(numbers.clone(), numbers.length));
        System.out.println("Time after: " + System.nanoTime());
    }

    public static void sortChar(char[] numbers) {
        long x,y;
        System.out.println("\n\n------------For char[]----------------\n");

        System.out.println("\n"+"Insertion Sort : ");
        x = System.nanoTime();
        print(InsertionSort.sort(numbers.clone()));
        y = System.nanoTime();
        System.out.println("Time for realization :" + (y - x));

        System.out.println("\n"+ "Selection Sort: ");
        x = System.nanoTime();
        print(SelectionSort.sort(numbers.clone()));
        y = System.nanoTime();
        System.out.println("Time for realization :" + (y - x));

        System.out.println("\n"+"Merge Sort :");
        x = System.nanoTime();
        print(MergeSort.sort(numbers.clone(),0,numbers.length-1));
        y = System.nanoTime();
        System.out.println("Time for realization :" + (y - x));

        System.out.println("\n"+"Heap Sort: ");
        x = System.nanoTime();
        print(HeapSort.sort(numbers.clone()));
        y = System.nanoTime();
        System.out.println("Time for realization :" + (y - x));

        System.out.println("\n"+"Quick Sort: ");
        x = System.nanoTime();
        print(QuickSort.quickSort(numbers.clone(),0,numbers.length-1));
        y = System.nanoTime();
        System.out.println("Time for realization :" + (y - x));

        System.out.println("\n"+"Bubble Sort: ");
        x = System.nanoTime();
        print(BubbleSort.bubbleSort(numbers.clone()));
        y = System.nanoTime();
        System.out.println("Time for realization :" + (y - x));

        System.out.println("\n"+"Bucket Sort: ");
        x = System.nanoTime();
        print(BucketSort.bucketSort(numbers.clone(), BucketSort.maxValue(numbers)));
        y = System.nanoTime();
        System.out.println("Time for realization :" + (y - x));

        System.out.println("\n"+"Radix Sort: ");
        System.out.println("Time before: "+ System.nanoTime());
        System.out.println("Time after: " + System.nanoTime());
    }

    public static void sortFloat(float[] numbers) {
        long x,y;
        System.out.println("\n\n------------For float[]----------------\n");

        System.out.println("\n"+"Insertion Sort : ");
        x = System.nanoTime();
        print(InsertionSort.sort(numbers.clone()));
        y = System.nanoTime();
        System.out.println("Time for realization :" + (y - x));

        System.out.println("\n"+ "Selection Sort: ");
        x = System.nanoTime();
        print(SelectionSort.sort(numbers.clone()));
        y = System.nanoTime();
        System.out.println("Time for realization :" + (y - x));

        System.out.println("\n"+"Merge Sort :");
        x = System.nanoTime();
        print(MergeSort.sort(numbers.clone(),0,numbers.length-1));
        y = System.nanoTime();
        System.out.println("Time for realization :" + (y - x));

        System.out.println("\n"+"Heap Sort: ");
        x = System.nanoTime();
        print(HeapSort.sort(numbers.clone()));
        y = System.nanoTime();
        System.out.println("Time for realization :" + (y - x));

        System.out.println("\n"+"Quick Sort: ");
        x = System.nanoTime();
        print(QuickSort.quickSort(numbers.clone(),0,numbers.length-1));
        y = System.nanoTime();
        System.out.println("Time for realization :" + (y - x));

        System.out.println("\n"+"Bubble Sort: ");
        x = System.nanoTime();
        print(BubbleSort.bubbleSort(numbers.clone()));
        y = System.nanoTime();
        System.out.println("Time for realization :" + (y - x));

        System.out.println("\n"+"Bucket Sort: ");
        x = System.nanoTime();
//        print(BucketSort.bucketSort(numbers.clone(), BucketSort.maxValue(numbers)));
        y = System.nanoTime();
        System.out.println("Time for realization :" + (y - x));

        System.out.println("\n"+"Radix Sort: ");
        System.out.println("Time before: "+ System.nanoTime());
        System.out.println("Time after: " + System.nanoTime());
    }
    static void print(int[] arr)
    {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    static void print(double[] arr)
    {
        for (double j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    static void print(char[] arr)
    {
        for (char j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    static void print(float[] arr)
    {
        for (float j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}

class InsertionSort {
    static int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
     static double[] sort(double[] arr) {
        for (int i = 1; i < arr.length; i++) {
            double currentElement = arr[i];
            int k;
            for (k = i - 1; k >= 0 && arr[k] > currentElement; k--) {
                arr[k + 1] = arr[k];
            }
            arr[k + 1] = currentElement;
        }
        return arr;
    }
    static char[] sort(char[] arr) {
        for (int i = 1; i < arr.length; i++) {
            char currentElement = arr[i];
            int k;
            for (k = i - 1; k >= 0 && arr[k] > currentElement; k--) {
                arr[k + 1] = arr[k];
            }
            arr[k + 1] = currentElement;
        }
        return arr;
    }
    static float[] sort(float[] arr) {
        for (int i = 1; i < arr.length; i++) {
            float currentElement = arr[i];
            int k;
            for (k = i - 1; k >= 0 && arr[k] > currentElement; k--) {
                arr[k + 1] = arr[k];
            }
            arr[k + 1] = currentElement;
        }
        return arr;
    }
}

class SelectionSort {
    static int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    static double[] sort(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            double temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    static char[] sort(char[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            char temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    static float[] sort(float[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            float temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
class MergeSort {
    //MergeSort for int
    static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        System.arraycopy(arr, l, L, 0, n1);
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    static int[] sort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
        return arr;
    }
    //MergeSort for double
    static void merge(double[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        double[] L = new double[n1];
        double[] R = new double[n2];
        System.arraycopy(arr, l, L, 0, n1);
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    static double[] sort(double[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
        return arr;
    }
    //MergeSort for char
    static void merge(char[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        char[] L = new char[n1];
        char[] R = new char[n2];
        System.arraycopy(arr, l, L, 0, n1);
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    static char[] sort(char[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
        return arr;
    }
    //MergeSort for float
    static void merge(float[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        float[] L = new float[n1];
        float[] R = new float[n2];
        System.arraycopy(arr, l, L, 0, n1);
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    static float[] sort(float[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
        return arr;
    }
}

class HeapSort {
	//HeapSort for int
    static int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
        return arr;
    }
    static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }
    //HeapSort for double
    static double[] sort(double[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            double temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
        return arr;
    }
    static void heapify(double[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }
        if (largest != i) {
            double swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }
    //HeapSort for char
    static char[] sort(char[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            char temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
        return arr;
    }
    static void heapify(char[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }
        if (largest != i) {
            char swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }
    //HeapSort for float
    static float[] sort(float[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            float temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
        return arr;
    }
    static void heapify(float[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }
        if (largest != i) {
            float swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }
}

class QuickSort {
    //Quicksort for int
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
    static int[] quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
        return arr;
    }
    //Quicksort for double
    static void swap(double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(double[] arr, int low, int high) {
        double pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
    static double[] quickSort(double[] arr, int low, int high) {
        if (low < high) {
            double pi = partition(arr, low, high);
            quickSort(arr, low, (int) (pi - 1));
            quickSort(arr, (int) (pi + 1), high);
        }
        return arr;
    }
    //Quicksort for char
    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(char[] arr, int low, int high) {
        char pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
    static char[] quickSort(char[] arr, int low, int high) {
        if (low < high) {
            double pi = partition(arr, low, high);
            quickSort(arr, low, (int) (pi - 1));
            quickSort(arr, (int) (pi + 1), high);
        }
        return arr;
    }
    //Quicksort for float
    static void swap(float[] arr, int i, int j) {
        float temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(float[] arr, int low, int high) {
        float pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
    static float[] quickSort(float[] arr, int low, int high) {
        if (low < high) {
            double pi = partition(arr, low, high);
            quickSort(arr, low, (int) (pi - 1));
            quickSort(arr, (int) (pi + 1), high);
        }
        return arr;
    }
}

class BubbleSort {
    static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    static double[] bubbleSort(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    static char[] bubbleSort(char[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    static float[] bubbleSort(float[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    float temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
class BucketSort
{
    //BucketSort for int
    static int[] bucketSort(int[] array, int maxValue)
    {
        int[] Bucket = new int[maxValue + 1];
        int[] sorted_array = new int[array.length];
        for (int k : array) Bucket[k]++;
        int outPos = 0;
        for (int i = 0; i < Bucket.length; i++) {
            for (int j = 0; j < Bucket[i]; j++) {
                sorted_array[outPos++] = i;
            }
        }
        return sorted_array;
    }
    static int maxValue(int[] array)
    {
        int maxValue = 0;
        for (int j : array) {
            if (j > maxValue) maxValue = j;
        }
        return maxValue;
    }
    //BucketSort for double
    static double[] bucketSort(double[] array, int maxValue)
    {
        double[] Bucket = new double[(maxValue + 1)];
        double[] sorted_array = new double[array.length];
        for (double k : array) Bucket[(int) k]++;
        int outPos = 0;
        for (double i = 0; i < Bucket.length; i++) {
            for (int j = 0; j < Bucket[(int) i]; j++) {
                sorted_array[outPos++] = i;
            }
        }
        return sorted_array;
    }
    static double maxValue(double[] array)
    {
        double maxValue = 0;
        for (double j : array) {
            if (j > maxValue) maxValue = j;
        }
        return maxValue;
    }
    //BucketSort for char
    static char[] bucketSort(char[] array, int maxValue)
    {
        char[] Bucket = new char[maxValue + 1];
        char[] sorted_array = new char[array.length];
        for (char k : array) Bucket[k]++;
        int outPos = 0;
        for (char i = 0; i < Bucket.length; i++) {
            for (int j = 0; j < Bucket[i]; j++) {
                sorted_array[outPos++] = i;
            }
        }
        return sorted_array;
    }
    static char maxValue(char[] array)
    {
        char maxValue = 0;
        for (char j : array) {
            if (j > maxValue) maxValue = j;
        }
        return maxValue;
    }
    //BucketSort for float
    static float[] bucketSort(float[] array, int maxValue)
    {
        float[] Bucket = new float[maxValue + 1];
        float[] sorted_array = new float[array.length];
        for (float k : array) Bucket[(int) k]++;
        int outPos = 0;
        for (char i = 0; i < Bucket.length; i++) {
            for (int j = 0; j < Bucket[i]; j++) {
                sorted_array[outPos++] = i;
            }
        }
        return sorted_array;
    }
    static float maxValue(float[] array)
    {
        float maxValue = 0;
        for (float j : array) {
            if (j > maxValue) maxValue = j;
        }
        return maxValue;
    }
}
class Radix_Sort {
    //Radix sort for int
    static void countingSort(int array[], int size, int place) {
        int[] output = new int[size + 1];
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max)
                max = array[i];
        }
        int[] count = new int[max + 1];

        for (int i = 0; i < max; ++i)
            count[i] = 0;

        // Calculate count of elements
        for (int i = 0; i < size; i++)
            count[(array[i] / place) % 10]++;

        // Calculate cumulative count
        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Place the elements in sorted order
        for (int i = size - 1; i >= 0; i--) {
            output[count[(array[i] / place) % 10] - 1] = array[i];
            count[(array[i] / place) % 10]--;
        }

        for (int i = 0; i < size; i++)
            array[i] = output[i];
    }

    // Function to get the largest element from an array
    static int getMax(int array[], int n) {
        int max = array[0];
        for (int i = 1; i < n; i++)
            if (array[i] > max)
                max = array[i];
        return max;
    }

    // Main function to implement radix sort
    static int[] radixSort(int array[], int size) {
        // Get maximum element
        int max = getMax(array, size);

        // Apply counting sort to sort elements based on place value.
        for (int place = 1; max / place > 0; place *= 10)
            countingSort(array, size, place);
        return array;
    }
    //Radix sort for double
    static void countingSort(double array[], int size, int place) {
        double[] output = new double[size + 1];
        double max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max)
                max = array[i];
        }
        int[] count = new int[(int) (max + 1)];

        for (int i = 0; i < max; ++i)
            count[i] = 0;

        // Calculate count of elements
        for (int i = 0; i < size; i++)
            count[(int) ((array[i] / place) % 10)]++;

        // Calculate cumulative count
        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Place the elements in sorted order
        for (int i = size - 1; i >= 0; i--) {
            output[count[(int) ((array[i] / place) % 10)] - 1] = array[i];
            count[(int) ((array[i] / place) % 10)]--;
        }

        for (int i = 0; i < size; i++)
            array[i] = output[i];
    }

    // Function to get the largest element from an array
    static double getMax(double array[], int n) {
        double max = array[0];
        for (int i = 1; i < n; i++)
            if (array[i] > max)
                max = array[i];
        return max;
    }

    // Main function to implement radix sort
    static double[] radixSort(double array[], int size) {
        // Get maximum element
        double max = getMax(array, size);

        // Apply counting sort to sort elements based on place value.
        for (int place = 1; max / place > 0; place *= 10)
            countingSort(array, size, place);
        return array;
    }

//    static int largest(int[] a)
//    {
//        int larger=a[0], i;
//        for(i=1;i<a.length;i++)
//        {
//            if(a[i]>larger)
//                larger = a[i];
//        }
//        return larger;
//    }
//    static int[] radix_sort(int[] a)
//    {
//        int[][] bucket =new int[a.length][a.length];
//        int[] bucket_count =new int[a.length];
//        int i, j, k, remainder, NOP=0, divisor=1, larger, pass;
//        larger = largest(a);
//        while(larger>0)
//        {
//            NOP++;
//            larger/=10;
//        }
//        for(pass=0;pass<NOP;pass++)
//        {
//            for(i=0;i<a.length;i++)
//                bucket_count[i]=0;
//            for(i=0;i<a.length;i++)
//            {
//                remainder = (a[i]/divisor)%a.length;
//                bucket[remainder][bucket_count[remainder]] = a[i];
//                bucket_count[remainder] += 1;
//            }
//            i=0;
//            for(k=0;k<a.length;k++)
//            {
//                for(j=0;j<bucket_count[k];j++)
//                {
//                    a[i] = bucket[k][j];
//                    i++;
//                }
//            }
//            divisor *= a.length;
//        }
//        return a;
//    }
//    static double largest(double[] a)
//    {
//        double larger=a[0];
//        int i;
//        for(i=1;i<a.length;i++)
//        {
//            if(a[i]>larger)
//                larger = a[i];
//        }
//        return larger;
//    }
//    static double[] radix_sort(double[] a)
//    {
//        double[][] bucket =new double[a.length][a.length];
//        double[] bucket_count =new double[a.length];
//        int i, j, k, remainder, NOP=0, divisor=1, pass;
//        double larger;
//        larger = largest(a);
//        while(larger>0)
//        {
//            NOP++;
//            larger/=10;
//        }
//        for(pass=0;pass<NOP;pass++)
//        {
//            for(i=0;i<a.length;i++)
//                bucket_count[i]=0;
//            for(i=0;i<a.length;i++)
//            {
//                remainder = (int) ((a[i]/divisor)%a.length);
//                bucket[remainder][(int) bucket_count[remainder]] = a[i];
//                bucket_count[remainder] += 1;
//            }
//            i=0;
//            for(k=0;k<a.length;k++)
//            {
//                for(j=0;j<bucket_count[k];j++)
//                {
//                    a[i] = bucket[k][j];
//                    i++;
//                }
//            }
//            divisor *= a.length;
//        }
//        return a;
//    }
//    static char largest(char[] a)
//    {
//        char larger=a[0];
//        int i;
//        for(i=1;i<a.length;i++)
//        {
//            if(a[i]>larger)
//                larger = a[i];
//        }
//        return larger;
//    }
//    static char[] radix_sort(char[] a)
//    {
//        char[][] bucket =new char[a.length][a.length];
//        char[] bucket_count =new char[a.length];
//        int i, j, k, remainder, NOP=0, divisor=1, pass;
//        char larger;
//        larger = largest(a);
//        while(larger>0)
//        {
//            NOP++;
//            larger/=a.length;
//        }
//        for(pass=0;pass<NOP;pass++)
//        {
//            for(i=0;i<a.length;i++)
//                bucket_count[i]=0;
//            for(i=0;i<a.length;i++)
//            {
//                remainder = ((a[i]/divisor)%a.length);
//                bucket[remainder][bucket_count[remainder]] = a[i];
//                bucket_count[remainder] += 1;
//            }
//            i=0;
//            for(k=0;k<a.length;k++)
//            {
//                for(j=0;j<bucket_count[k];j++)
//                {
//                    a[i] = bucket[k][j];
//                    i++;
//                }
//            }
//            divisor *= a.length;
//        }
//        return a;
//    }
//    static float largest(float[] a)
//    {
//        float larger=a[0];
//        int i;
//        for(i=1;i<a.length;i++)
//        {
//            if(a[i]>larger)
//                larger = a[i];
//        }
//        return larger;
//    }
//    static float[] radix_sort(float[] a)
//    {
//        float[][] bucket =new float[a.length][a.length];
//        float[] bucket_count =new float[a.length];
//        int i, j, k, remainder, NOP=0, divisor=1, pass;
//        float larger;
//        larger = largest(a);
//        while(larger>0)
//        {
//            NOP++;
//            larger/=a.length;
//        }
//        for(pass=0;pass<NOP;pass++)
//        {
//            for(i=0;i<a.length;i++)
//                bucket_count[i]=0;
//            for(i=0;i<a.length;i++)
//            {
//                remainder = (int) ((a[i]/divisor)%a.length);
//                bucket[remainder][(int) bucket_count[remainder]] = a[i];
//                bucket_count[remainder] += 1;
//            }
//            i=0;
//            for(k=0;k<a.length;k++)
//            {
//                for(j=0;j<(int)bucket_count[k];j++)
//                {
//                    a[i] = bucket[k][j];
//                    i++;
//                }
//            }
//            divisor *= a.length;
//        }
//        return a;
//    }
}