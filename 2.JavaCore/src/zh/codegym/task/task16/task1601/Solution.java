package zh.codegym.task.task16.task1601;

/* 
我的第一个线程
*/

public class Solution {
    public static void main(String[] args) {
        TestThread task = new TestThread();
        new Thread(task).start();
    }

    public static class TestThread implements Runnable {
        @Override
        public void run() {
            System.out.println("我的第一个线程");
        }
    }
}