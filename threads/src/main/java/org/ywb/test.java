package org.ywb;

public class test {
    public static void main(String[] args) {
        Product product = new Product(false);
        new Producer(product).start();
        new Consumer(product).start();
    }
}
