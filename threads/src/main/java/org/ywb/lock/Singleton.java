package org.ywb.lock;

public class Singleton {
    private volatile static Singleton uniqueInstance;
    public static Singleton getInstance(){
        if (uniqueInstance == null) {
            synchronized (Singleton.class){
                if (uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
