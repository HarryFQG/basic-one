package com.it;

public class TestFourThread {
	private int j;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	TestFourThread many = new TestFourThread();
        Inc inc = many.new Inc();
        Dec dec = many.new Dec();
        for (int i = 0; i < 2; i++) {
            Thread t = new Thread(inc);
            t.start();
            t = new Thread(dec);
            t.start();
        }
    }

    private synchronized void inc() {
        j++;
        System.out.println(Thread.currentThread().getName() + "inc" + j);
    }

    private synchronized void dec() {
        j--;
        System.out.println(Thread.currentThread().getName() + "dec" + j);
    }

    class Inc implements Runnable {

        @Override
        public void run() {
            // TODO Auto-generated method stub
            for (int i = 0; i < 20; i++) {
                inc();
            }
        }

    }

    class Dec implements Runnable {

        @Override
        public void run() {
            // TODO Auto-generated method stub
            for (int i = 0; i < 20; i++) {
                dec();
            }
        }

    }

}
