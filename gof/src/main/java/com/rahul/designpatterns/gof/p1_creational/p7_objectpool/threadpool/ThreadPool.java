package com.rahul.designpatterns.gof.p1_creational.p7_objectpool.threadpool;

import java.util.concurrent.LinkedBlockingQueue;

class ThreadPool {
    private final int nThreads;
    private final WorkerThread[] workerThreads;
    private final LinkedBlockingQueue<Runnable> runnablesQueue;

    public ThreadPool(int nThreads) {
        this.nThreads = nThreads;
        runnablesQueue = new LinkedBlockingQueue<>();
        workerThreads = new WorkerThread[nThreads];

        for (int i = 0; i < nThreads; i++) {
            workerThreads[i] = new WorkerThread();
            workerThreads[i].start();
        }
    }

    public void execute(Runnable runnable) {
        try {
            runnablesQueue.put(runnable);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void shutdown() {
        while (runnablesQueue.size() != 0) {}
        System.out.println("Threadpool shutting down");

        for (int i = 0; i < nThreads; i++) {
            workerThreads[i].shutdown();
        }
    }

    class WorkerThread extends Thread {
        private boolean alive = true;

        public void shutdown() {
            alive = false;
        }

        @Override
        public void run() {
            while (alive) {
                try {
                    Runnable runnable = runnablesQueue.take();
                    runnable.run();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}