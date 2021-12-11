package org.jun.thread;

public class ShowStopThread implements Runnable{
    private volatile boolean flag;
    public void stop(){
        flag = false;
    }

    @Override
    public void run() {
        while (true) System.out.println("jun");
    }
}
