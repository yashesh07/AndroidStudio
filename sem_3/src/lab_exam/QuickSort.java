package lab_exam;

public class QuickSort {

    public int[] quickSort(int[] arr) {
        quickSort(arr, 0, arr.length);
        return arr;
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int i = low + 1, j = high;
            int pivot = arr[low];
            int pivotLow = low, pivotHigh = low;
            if(i<arr.length){
                do {
                    if (arr[i] < pivot) {
                        int temp = arr[i];
                        int c;
                        for (c = pivotHigh; c >= pivotLow; c--)
                            arr[c + 1] = arr[c];
                        arr[++c] = temp;
                        pivotHigh++;
                        pivotLow++;
                        i++;
                    } else if (arr[i] == pivot) {
                        pivotHigh++;
                        i++;
                    } else {
                        while (j > i) {
                            j--;
                            if (arr[j] < arr[i]) {
                                int temp = arr[j];
                                arr[j] = arr[i];
                                arr[i] = temp;
                                break;
                            }
                        }
                    }
                } while (i < j);
            }
            quickSort(arr, low, pivotLow);
            quickSort(arr, pivotHigh + 1, high);
        }
    }
}
