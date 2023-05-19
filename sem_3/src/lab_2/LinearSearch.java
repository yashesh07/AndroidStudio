package lab_2;

public class LinearSearch {
    public int linearSearch(Candidate [] arr, String key){
        for(int i = 0; i<arr.length; i++)
            if(arr[i].getApplicationID().equals(key)) return i;
        return -1;
    }
}
