package OODP10;

class Thread1 extends Thread{

    int [] arr;

    Thread1(int [] arr){
        this.arr = arr;
    }

    public void run(){
        for(int i : arr){
            System.out.println("Thread 1\t" + i*i);
            try {
                Thread1.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Thread2 extends Thread{

    int [] arr;

    Thread2(int [] arr){
        this.arr = arr;
    }

    public void run(){
        for(int i : arr){
            System.out.println("Thread 2\t" + Math.sqrt(i));
            try {
                Thread2.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Main1 {
    public static void main(String[] args) {
        int [] arr = {11,12,13,14,15,16,17,18,19};
        new Thread1(arr).start();
        new Thread2(arr).start();
    }
}
