package zh.codegym.task.task16.task1633;

public class Solution {

    public static Thread.UncaughtExceptionHandler handler = new OurUncaughtExceptionHandler();

    public static void main(String[] args) {
        TestedThread commonThread = new TestedThread(handler);

        Thread threadA = new Thread(commonThread, "线程 1");
        Thread threadB = new Thread(commonThread, "线程 2");

        threadA.start();
        threadB.start();

        threadA.interrupt();
        threadA.setUncaughtExceptionHandler(handler);
        threadB.interrupt();
        threadB.setUncaughtExceptionHandler(handler);
    }

    public static class TestedThread extends Thread {
        public TestedThread(Thread.UncaughtExceptionHandler handler) {
            setUncaughtExceptionHandler(handler);
            start();
        }

        public void run() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException("我的异常消息");
//                System.out.println(currentThread().getName() + "：我的异常消息");
            }
        }
    }

    public static class OurUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
        @Override
        public void uncaughtException(Thread t, Throwable e) {
            System.out.println(t.getName() + ": " + e.getMessage());
        }
    }
}
