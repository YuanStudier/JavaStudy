package org.ywb;

public class Producer extends Thread{
    private Product pd;

    public Producer(Product pd) {
        this.pd = pd;
    }

    @Override
    public void run() {
        while (true){
            synchronized (pd){
                //如果有产品
                if(pd.flag){
                    try {
                        pd.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("生产者开始生产！");
                try {
                    System.out.println("请等待5s...");
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                pd.flag = true;
                pd.notify();
                System.out.println("生产完毕，消费者开始消费...");
            }
        }
    }
}
