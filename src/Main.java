import java.util.Arrays;


public class Main {
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
            if(num < 0) {
                continue;
            }
            else{
                allCount++;
            }
            sum = num + sum;
        }
        System.out.println(sum + "/" + allCount);



        
        // ДЗ НА СООБРАЗИТЕЛЬНОСТЬ

        int[] mas = {5, -2, 1, 40, 21, 50};
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            System.out.println(Arrays.toString(mas));

            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {

                if(mas[i] > mas[i+1]){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;

                }
            }
        }

    }
}


