package com.rahul.designpatterns.gof.p1_creational.p7_objectpool.threadpool;

/*
    Object pool can be used when:
    1. a large number of objects are needed for short durations
    2. object creation is expensive

    Either we pre-create objects or collect unused objects in memory cache (pool)
    When the code needs an object of this class, it is provided from the cache
*/
public class ObjectPoolClient {
    public static void main(String[] args) {
        ThreadPool pool = new ThreadPool(2);
        try {
            pool.execute(new Task(1));
            pool.execute(new Task(2));
            pool.execute(new Task(3));
            pool.execute(new Task(4));
            pool.execute(new Task(5));
            pool.execute(new Task(6));
            pool.execute(new Task(7));
        }finally {
            pool.shutdown();
        }
    }
}
