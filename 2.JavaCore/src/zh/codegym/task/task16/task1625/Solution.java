package zh.codegym.task.task16.task1625;

/* 
死锁
*/

public class Solution {

    static Thread t1 = new T1();
    static Thread t2 = new T2();

    public static void main(String[] args) throws InterruptedException {
        t1.start();
        t1.join();
        t2.start();
    }

    public static class T1 extends Thread {
        @Override
        public void run() {
            try {
                t2.join();
                System.out.println("T1 已完成");
            } catch (InterruptedException e) {
                System.out.println("T1 已中断");
            }
        }
    }

    public static class T2 extends Thread {
        @Override
        public void run() {
            try {
                t1.join();
                System.out.println("T2 已完成");
            } catch (InterruptedException e) {
                System.out.println("T2 已中断");
            }
        }
    }
}
