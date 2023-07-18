package org.ywb;

public class Consumer extends Thread{
    Product pd;

    public Consumer(Product pd) {
        this.pd = pd;
    }

    @Override
    public void run() {
        synchronized (pd){
            //如果没有产品
            if (!pd.flag){
                try {
                    pd.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("消费者开始消费！");
            try {
                System.out.println("正在消费...");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            pd.flag = true;
            pd.notify();
            System.out.println("消费者消费结束，等待生产者生产...");
        }
    }
}
