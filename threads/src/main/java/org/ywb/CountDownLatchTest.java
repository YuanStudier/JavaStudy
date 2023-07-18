package org.ywb;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {
    public static void main(String[] args) throws InterruptedException {
        final CountDownLatch countDownLatch = new CountDownLatch(10);
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                try {
                    System.out.println("子线程" + Thread.currentThread().getName() + "正在赶路");
                    Thread.sleep(1000);
                    countDownLatch.countDown();
                    System.out.println("子线程" + Thread.currentThread().getName() + "到公司了");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        System.out.println("等待员工上班中...");
        countDownLatch.await();
        System.out.println("员工开始上班...");

    }
}
