package lab_exam;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9,2,4,6,8,9,11,11,22,20,29,29,19,20,10,9,4,7,7,10,22,3,18,17,18,19,20,22};

        int [] newArr = new RemoveDuplicateElements(arr).removingDuplicateElements();
        System.out.println(Arrays.toString(newArr));
    }
}
