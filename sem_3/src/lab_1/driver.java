package lab_1;

public class driver {
    public static void main(String[] args) {

        /*
        ----------
         Task - 2
        ----------
         */

        for(int T = 1; T<=3; T++){
            System.out.println("\n\nTest Case - " + T +"\n\n");
            int min = 0, max = 100000;
            int c[] = new int[100000];
            for(int i = 0; i<100000; i++)
                c[i] = (int) (Math.random() * (max - min + 1) + min);
            int [] a = new SelectionSort_202011017().selectionSort(c.clone());
            int [] b = new int[100000];
            for(int i = 0; i<a.length; i++)
                b[i] = a[a.length-i-1];

            //For Selection Sort
            long start = System.nanoTime();
            new SelectionSort_202011017().selectionSort(a);
            long end = System.nanoTime();
            System.out.println("\nSelection Sort: Time taken by array a[] in microseconds is " + (end-start)/1000);

            start = System.nanoTime();
            new SelectionSort_202011017().selectionSort(b);
            end = System.nanoTime();
            System.out.println("Selection Sort: Time taken by array b[] in microseconds is " + (end-start)/1000);

            start = System.nanoTime();
            new SelectionSort_202011017().selectionSort(c);
            end = System.nanoTime();
            System.out.println("Selection Sort: Time taken by array c[] in microseconds is " + (end-start)/1000);

            //For Insertion Sort
            start = System.nanoTime();
            new InsertionSort_202011017().insertionSort(a);
            end = System.nanoTime();
            System.out.println("\nInsertion Sort: Time taken by array a[] in microseconds is " + (end-start)/1000);

            start = System.nanoTime();
            new InsertionSort_202011017().insertionSort(b);
            end = System.nanoTime();
            System.out.println("Insertion Sort: Time taken by array b[] in microseconds is " + (end-start)/1000);

            start = System.nanoTime();
            new InsertionSort_202011017().insertionSort(c);
            end = System.nanoTime();
            System.out.println("Insertion Sort: Time taken by array c[] in microseconds is " + (end-start)/1000);

            //For Bubble Sort
            start = System.nanoTime();
            new BubbleSort_202011017().bubbleSort(a);
            end = System.nanoTime();
            System.out.println("\nBubble Sort: Time taken by array a[] in microseconds is " + (end-start)/1000);

            start = System.nanoTime();
            new BubbleSort_202011017().bubbleSort(b);
            end = System.nanoTime();
            System.out.println("Bubble Sort: Time taken by array b[] in microseconds is " + (end-start)/1000);

            start = System.nanoTime();
            new BubbleSort_202011017().bubbleSort(c);
            end = System.nanoTime();
            System.out.println("Bubble Sort: Time taken by array c[] in microseconds is " + (end-start)/1000);

//            For Linear Search

            start = System.nanoTime();
            new LinearSearch_202011017().linearSearch(c, 45342);
            end = System.nanoTime();
            System.out.println("Linear Search: Time taken for average case in microseconds is " + (end-start)/1000);

            start = System.nanoTime();
            new LinearSearch_202011017().linearSearch(c, c[0]);
            end = System.nanoTime();
            System.out.println("Linear Search: Time taken for best case in microseconds is " + (end-start)/1000);

            start = System.nanoTime();
            new LinearSearch_202011017().linearSearch(c, c[c.length-1]);
            end = System.nanoTime();
            System.out.println("Linear Search: Time taken for worst case in microseconds is " + (end-start)/1000);

//            For Binary Search

            start = System.nanoTime();
            new BinarySearch_202011017().binarySearch(a, 33522);
            end = System.nanoTime();
            System.out.println("Binary Search: Time taken for average case in microseconds is " + (end-start)/1000);

            start = System.nanoTime();
            new BinarySearch_202011017().binarySearch(a, a[(a.length-1)/2]);
            end = System.nanoTime();
            System.out.println("Binary Search: Time taken for best case in microseconds is " + (end-start)/1000);

            start = System.nanoTime();
            new BinarySearch_202011017().binarySearch(a, 15);
            end = System.nanoTime();
            System.out.println("Binary Search: Time taken for worst case in microseconds is " + (end-start)/1000);

        }

        /*
        ----------
         Task - 3
        ----------
         */

            int min = 1000, max = 9999;
            int inpSize = 100000;
            int c[] = new int[inpSize];
            for(int i = 0; i<inpSize; i++)
                c[i] = (int) (Math.random() * (max - min + 1) + min);
            int [] a = new SelectionSort_202011017().selectionSort(c.clone());
            int [] b = new int[inpSize];
            for(int i = 0; i<a.length; i++)
                b[i] = a[a.length-i-1];


            //For Selection Sort
            long start = System.nanoTime();
            new SelectionSort_202011017().selectionSort(a);
            long end = System.nanoTime();
            System.out.println("\nSelection Sort: Time taken by array a[] in microseconds is " + (end-start)/1000);

            start = System.nanoTime();
            new SelectionSort_202011017().selectionSort(b);
            end = System.nanoTime();
            System.out.println("Selection Sort: Time taken by array b[] in microseconds is " + (end-start)/1000);

            start = System.nanoTime();
            new SelectionSort_202011017().selectionSort(c);
            end = System.nanoTime();
            System.out.println("Selection Sort: Time taken by array c[] in microseconds is " + (end-start)/1000);

            //For Insertion Sort
            start = System.nanoTime();
            new InsertionSort_202011017().insertionSort(a);
            end = System.nanoTime();
            System.out.println("\nInsertion Sort: Time taken by array a[] in microseconds is " + (end-start)/1000);

            start = System.nanoTime();
            new InsertionSort_202011017().insertionSort(b);
            end = System.nanoTime();
            System.out.println("Insertion Sort: Time taken by array b[] in microseconds is " + (end-start)/1000);

            start = System.nanoTime();
            new InsertionSort_202011017().insertionSort(c);
            end = System.nanoTime();
            System.out.println("Insertion Sort: Time taken by array c[] in microseconds is " + (end-start)/1000);

            //For Bubble Sort
            start = System.nanoTime();
            new BubbleSort_202011017().bubbleSort(a);
            end = System.nanoTime();
            System.out.println("\nBubble Sort: Time taken by array a[] in microseconds is " + (end-start)/1000);

            start = System.nanoTime();
            new BubbleSort_202011017().bubbleSort(b);
            end = System.nanoTime();
            System.out.println("Bubble Sort: Time taken by array b[] in microseconds is " + (end-start)/1000);

            start = System.nanoTime();
            new BubbleSort_202011017().bubbleSort(c);
            end = System.nanoTime();
            System.out.println("Bubble Sort: Time taken by array c[] in microseconds is " + (end-start)/1000);

        //            For Linear Search

        start = System.nanoTime();
        new LinearSearch_202011017().linearSearch(c, (max+min)/2);
        end = System.nanoTime();
        System.out.println("\nLinear Search: Time taken for average case in microseconds is " + (end-start)/1000);

        start = System.nanoTime();
        new LinearSearch_202011017().linearSearch(c, c[0]);
        end = System.nanoTime();
        System.out.println("Linear Search: Time taken for best case in microseconds is " + (end-start)/1000);

        start = System.nanoTime();
        new LinearSearch_202011017().linearSearch(c, c[c.length-1]);
        end = System.nanoTime();
        System.out.println("Linear Search: Time taken for worst case in microseconds is " + (end-start)/1000);

//            For Binary Search

        start = System.nanoTime();
        new BinarySearch_202011017().binarySearch(a, (max+min)/2);
        end = System.nanoTime();
        System.out.println("\nBinary Search: Time taken for average case in microseconds is " + (end-start)/1000);

        start = System.nanoTime();
        new BinarySearch_202011017().binarySearch(a, a[(a.length-1)/2]);
        end = System.nanoTime();
        System.out.println("Binary Search: Time taken for best case in microseconds is " + (end-start)/1000);

        start = System.nanoTime();
        new BinarySearch_202011017().binarySearch(a, a[a.length-1]);
        end = System.nanoTime();
        System.out.println("Binary Search: Time taken for worst case in microseconds is " + (end-start)/1000);

//        To Find Probability

            int min0 = 1000, max0 = 9999;
            int inpSize0 = 100000;
            int c0[] = new int[inpSize0];
            int ascending = 0, descending = 0, random = 0;
            for(int count = 1; count<=100; count++){
                    for(int i = 0; i<inpSize0; i++)
                            c0[i] = (int) (Math.random() * (max0 - min0 + 1) + min0);
                    if(isAscending(c0)) ascending++;
                    else if(isDescending(c0))   descending++;
                    else        random++;
            }
            System.out.println("Best case: " + ascending);
            System.out.println("Worst case: " + descending);
            System.out.println("Average case: " + random);
    }

    public static boolean isAscending(int [] arr){
            for(int i = 0; i<arr.length-1; i++)
                    if(arr[i]>arr[i+1]) return false;
            return true;
    }

    public static boolean isDescending(int [] arr){
            for(int i = 0; i<arr.length-1; i++)
                    if(arr[i]<arr[i+1]) return false;
            return true;
    }
}
