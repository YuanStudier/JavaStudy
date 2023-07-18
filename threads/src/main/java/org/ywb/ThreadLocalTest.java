package org.ywb;

import java.util.stream.IntStream;

public class ThreadLocalTest {


    public static void main(String[] args) {
        ThreadLocal<String> local = new ThreadLocal<>();
        IntStream.range(0, 10).forEach(i -> new Thread(() ->{
            local.set(Thread.currentThread().getName() + ":" + i);
            System.out.println("线程：" + Thread.currentThread().getName() + ",local:" + local.get());
        }).start());
    }
}
