package OODP10;

class MyThread extends Thread{

    public void run(){
        for(int i = 1; i<=10; i++){
            System.out.println("Task " + i);
            Thread.currentThread().interrupt();
            try {
                Thread1.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        new MyThread().start();
    }
}