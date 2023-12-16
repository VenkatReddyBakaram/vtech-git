package com.vtech.threads;

class DaemonThread implements Runnable {

    public void run() {

        int i = 0;

        while (true) {
            try {
                Thread.sleep(500);
                System.out.println("Providing Background services to Normal Thread");
                System.out.println("Executing Thread : " + Thread.currentThread().getName() + " With Iteration :" + i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}

public class DaemonThreadTest {

    public static void main(String[] args) {


        Thread daemonThread = new Thread(new DaemonThread());
        daemonThread.setName(("Daemon - Thread"));
        daemonThread.setDaemon(true);
        daemonThread.start();

        Thread normalThread = Thread.currentThread();
        normalThread.setName("Normal - Thread");

        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Executing Thread : " + normalThread.getName() + " With Iteration :" + i);
        }

    }
}
