package com.xalagor.greenfield;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AnimalTaskExecutor {
    private ExecutorService executor;

    public AnimalTaskExecutor() {
        this.executor = Executors.newCachedThreadPool();
    }

    public void executeTask(Runnable task) {
        executor.submit(task);
    }
}
