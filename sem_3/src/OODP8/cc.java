package OODP8;

class MyThread1 extends Thread {
    public void run(){
        int i = 0;
        while(i<=10){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1 is running....");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    public void run(){
        int i = 0;
        while(i<=10){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2 is running....");
            i++;
        }
    }
}

class Driver {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
