package lab_7;

import java.util.Arrays;

public class Question1 {

    Course [] course;

    public Question1(String [] courses, int [] d, int [] p){
        course = new Course[courses.length];
        for(int i = 0; i<course.length; i++)
            course[i] = new Course(courses[i], d[i], p[i]);
    }

    public String [] getMinimumPenaltySequence(){
        String [] res = new String[course.length];
        new MergeSort().sort(course);
        for(int i = 0; i<course.length; i++)
            res[i] = course[course.length-i-1].courseName;
        return res;
    }

}

class Course {
    String courseName;
    int d;
    int p;
    public Course(String courseName, int d, int p){
        this.courseName = courseName;
        this.d = d;
        this.p = p;
    }
}

class MergeSort {

    public void sort(Course [] arr){
        sort(arr, 0, arr.length-1);
    }

    private void sort(Course [] arr, int low, int high){
        if(low<high){
            int mid = (low+high)/2;

            sort(arr, low, mid);
            sort(arr, mid+1, high);

            Course [] temp = new Course[high-low+1];
            int i = low, j = mid+1, count = 0;

            while(i<=mid && j<=high){
                if((arr[i].p*arr[j].d)<(arr[j].p*arr[i].d))    temp[count++] = arr[i++];
                else    temp[count++] = arr[j++];
            }

            for(; i<=mid; i++)
                temp[count++] = arr[i];

            for(; j<=high; j++)
                temp[count++] = arr[j];

            count = 0;

            for(int c = low; c<=high; c++)
                arr[c] = temp[count++];

        }
    }
}

class Driver1 {
    public static void main(String[] args) {
        String [] courses = {"CS261", "CS262", "CS263"};
        int [] d = {4,6,7};
        int [] p = {2,1,4};
        System.out.println("Input:\n");
        System.out.println("Courses : " + Arrays.toString(courses));
        System.out.println("Days : " + Arrays.toString(d));
        System.out.println("Penalties : " + Arrays.toString(p));

        System.out.println("\nOutput\n");
        System.out.println("Sequence to get minimum penalty: \n" + Arrays.toString(new Question1(courses, d, p).getMinimumPenaltySequence()));
    }
}