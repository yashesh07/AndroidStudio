package lab_5;

public class SortXNY {

    public void sortingX(Point [] arr, int low, int high){
        if(low<high){
            Point pivot = arr[low];
            int i = low, j = high;
            while(i<j){
                do{
                    i++;
                }while(i<high && arr[i].x<=pivot.x);
                do{
                    j--;
                }while(arr[j].x>pivot.x);
                if(i<j){
                    Point temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            Point temp = arr[low];
            arr[low] = arr[j];
            arr[j] = temp;
            sortingX(arr, low, j);
            sortingX(arr, j+1, high);
        }
    }

    public void sortingY(Point [] arr, int low, int high){
        if(low<high){
            Point pivot = arr[low];
            int i = low, j = high;
            while(i<j){
                do{
                    i++;
                }while(i<high && arr[i].y<=pivot.y);
                do{
                    j--;
                }while(arr[j].y>pivot.y);
                if(i<j){
                    Point temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            Point temp = arr[low];
            arr[low] = arr[j];
            arr[j] = temp;
            sortingY(arr, low, j);
            sortingY(arr, j+1, high);
        }
    }
}
