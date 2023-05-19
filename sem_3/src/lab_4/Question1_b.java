package lab_4;

import java.util.Arrays;

public class Question1_b {

    public int [] quickSort(int [] arr){
        quickSort(arr, 0, arr.length-1);
        return arr;
    }

    private void quickSort(int [] arr, int low, int high){
        if(low<high){
            if(arr[low]>arr[high]){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            }
            int pivotMin = arr[low], pivotMax = arr[high];
            int l = low, r = high;
            int i = low;
            while(i<r){
                if(arr[i]<pivotMin){
                    int temp = arr[l];
                    arr[l] = arr[i];
                    arr[i] = temp;
                    l++;
                }
                else if(arr[i]>pivotMax){
                    int temp = arr[r];
                    arr[r] = arr[i];
                    arr[i] = temp;
                    r--;
                }
                else if(arr[i]==pivotMax){
                    int temp = arr[r];
                    arr[r] = arr[i];
                    arr[i] = temp;
                }
                else if(arr[i]==pivotMin){
                    int temp = arr[l];
                    arr[l] = arr[i];
                    arr[i] = temp;
                    i++;
                }
                else i++;
            }
            quickSort(arr, low, l);
            quickSort(arr, l+1, r);
            quickSort(arr, r+1, high);
        }
    }

    public static void main(String[] args) {
        int [] arr = {7,1,2,3,4,23,65,77,12,45,65,33,99,78,911,23,45,990};
        System.out.println("Input:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Output:");
        System.out.println(Arrays.toString(new Question1_b().quickSort(arr)));
    }
}
