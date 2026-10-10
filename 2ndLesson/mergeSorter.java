import java.util.Arrays;

public class mergeSorter {
    public static void main(String[] args){
        int[] numbers = {5, 6, 9, 8, 2, 1, 3, 4, 7};

        System.out.println("До сортировки: " + Arrays.toString(numbers));

        mergeSort(numbers);

        System.out.println("После сортировки: " + Arrays.toString(numbers));
    }

    private static void merge(int[] arr, int[] left, int[] right){
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length){
            if (left[i] <= right[j]){
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length){
            arr[k++] = left[i++];
        }
        while (j < right.length){
            arr[k++] = right[j++];
        }
    }

    private static void mergeSort(int[] arr){
        if (arr.length < 2){
            return;
        }
        int mid = arr.length / 2;

        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }
}
