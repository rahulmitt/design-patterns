package com.rahul.designpatterns.gof.p1_creational.p7_objectpool.threadpool;

class Task implements Runnable {
    private int id;
    public Task(int id) {
        this.id = id;
    }

    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Task " + id + " completed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
