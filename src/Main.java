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
        double numbers[] = {1.2, 3.2, -4.3, 3.6, -7.8, -9.1, 5.2, 9.8, -1.6, -8.1, 9.5, -5.6, 5.2, 1.7, 8.2};
        double sum = 0.0;
        int colvo = 0;
        boolean check = false;
        for (double foreach : numbers) {
            if (foreach < 0) {
                check = true;
            } else if (foreach > 0 && check) {
                sum += foreach;
                colvo++;
                System.out.println(foreach);

            }
        }
        System.out.println(sum / colvo);

        // ДЗ НА СООБРАЗИТЕЛЬНОСТЬ
        int[] arr = {-7, -4, -2, 2, 3, 6, 8};
        System.out.println(Arrays.toString(arr));

        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }

}


