package com.ajeet.learnings.concurrency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public final class SampleConcurrencyApp {
    private static final Log LOG = LogFactory.getLog(SampleConcurrencyApp.class);

    public static void main(String[] args) {
        int[] input = {1, 4, 2, 3, 7, 9, 3, 4, 6, 7, 1, 2, 1, 1, 4, 2, 3, 7, 9, 3, 4, 6, 7, 1, 2, 1, 1, 4, 2, 3, 7, 9, 3, 4, 6, 7, 1, 2, 1, 1, 4, 2, 3, 7, 9, 3, 4, 6, 7, 1, 2, 1, 1, 4, 2, 3, 7, 9, 3, 4, 6, 7, 1, 2, 1, 1, 4, 2, 3, 7, 9, 3, 4, 6, 7, 1, 2, 1, 1, 4, 2, 3, 7, 9, 3, 4, 6, 7, 1, 2, 1, 1, 4, 2, 3, 7, 9, 3, 4, 6, 7, 1, 2, 1};
        RecursiveTask<int[]> recursiveTask = new CustomRecursiveTask(input);
        //ForkJoinPool.commonPool().execute(recursiveTask);
        int[] result = new ForkJoinPool().invoke(recursiveTask);
        for (int i = 0; i < input.length; i++) {
            System.out.println(result[i]);
        }
    }
}