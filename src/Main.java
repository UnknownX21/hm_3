import java.util.Arrays;

public class Main {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;


            System.out.println( Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        // 1
        double[] numbers = {-1.5, -2.3, -4.7, -3.2, 0.9, 6.1, -5.4, 2.8, -1.0, 3.6, -4.9, 7.2, -0.5, 2.4, -1.8};
        System.out.println(numbers.length);

        // 2
        double sum = 0;
        int count = 0;
        int allCount = 0;
        boolean skipFirstElement = true;

        for (double num : numbers) {
            if (skipFirstElement) {
                skipFirstElement = false;
                continue;
            }
            if (num < 0) {
                continue;
            } else {
                allCount++;
            }
            sum = num + sum;
        }
        System.out.println(sum + "/" + allCount);

        // ДЗ НА СООБРАЗИТЕЛЬНОСТЬ
        int[] arr = {-7, -4, -2, 2, 3, 6, 8};
        System.out.println(Arrays.toString(arr));

        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
