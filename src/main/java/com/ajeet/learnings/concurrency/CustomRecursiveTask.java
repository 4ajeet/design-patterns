package com.ajeet.learnings.concurrency;

import java.util.Arrays;
import java.util.concurrent.RecursiveTask;

public final class CustomRecursiveTask extends RecursiveTask<int[]> {
    private static final int THRESHOLD_TO_SPLIT = 5;

    private final int[] _input;
    private final int[] _aux;
    private final int _start;
    private final int _end;

    public CustomRecursiveTask(int[] input) {
        this(input, 0, input.length - 1);
    }

    private CustomRecursiveTask(int[] input, int start, int end) {
        _input = input;
        _aux = new int[input.length];
        _start = start;
        _end = end;
    }

    @Override
    protected int[] compute() {
        if (_start < _end || (_end - _start) <= THRESHOLD_TO_SPLIT) {
            return sort(_input);
        }
        int mid = (_start + _end) >>> 1;
        CustomRecursiveTask leftTask = new CustomRecursiveTask(_input, _start, mid);
        leftTask.fork();
        CustomRecursiveTask rightTask = new CustomRecursiveTask(_input, mid + 1, _end);
        rightTask.compute();
        leftTask.join();

        merge(_start, mid, _end);
        return _input;
    }

    // Merge in sorted order
    private void merge(int start, int mid, int end) {
        for (int k = start; k <= end; k++) {
            _aux[k] = _input[k];
        }
        int i = start;
        int j = mid + 1;
        for (int k = i; k <= end; k++) {
            if (i > mid)
                _input[k] = _aux[j++];
            else if (j > end)
                _input[k] = _aux[i++];
            else if (_aux[i] < _aux[j])
                _input[k] = _aux[i++];
            else
                _input[k] = _aux[j++];
        }
    }

    // We can use insertion sort for smaller number of elements
    private int[] sort(int[] input) {
        Arrays.sort(input);
        return input;
    }
}
