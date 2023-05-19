package stuff;

public class LinearSearch {
    public int linearSearch(Player[] arr, String key){
        for(int i = 0; i<arr.length; i++)
            if(arr[i].getName().equals(key)) return i;
        return -1;
    }
}
