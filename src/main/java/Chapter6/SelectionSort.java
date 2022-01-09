package Chapter6;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] data = new DataSet().getData();

        for (int i = 0; i < data.length-1; i++) {
            int minIndex = i + 1;
            for (int j = i + 1; j < data.length - 1; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
        }

        System.out.println(Arrays.toString(data));
    }
}
