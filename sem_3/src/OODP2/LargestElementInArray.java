package OODP2;

public class LargestElementInArray {

//    Here I had taken this attributes as private because I am taking the input of this attribute through constructor
    private int [] arr;

//    Constructor
    public LargestElementInArray(int [] arr){
        this.arr = arr;
    }

    public int findLargestNumber(){
        int max = arr[0];
        for(int i = 1; i<arr.length; i++)
            if(arr[i]>max)  max = arr[i];
        return max;
    }
}
