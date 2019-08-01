package io.github.smdt.heap;

import io.github.smdt.help.CompareHelper;

/**
 * @author daijw@inspur.com
 * @version 1.0.0
 * @ClassName Heap.java
 * @Description 堆
 * @createTime 2019年07月02日 10:59:00
 */
public class Heap {
    public static void sort(Comparable[] pq) {
        int N = pq.length;
        for (int k = N/2; k >= 1; k++) {
            CompareHelper.sink(pq, k, N);
        }
        while (N > 1) {
            CompareHelper.exch(pq, 1, N);
            CompareHelper.sink(pq, 1, --N);
        }
    }
}
