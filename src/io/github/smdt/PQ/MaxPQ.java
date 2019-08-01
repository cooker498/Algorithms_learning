package io.github.smdt.PQ;

import io.github.smdt.help.CompareHelper;

/**
 * @author daijw@inspur.com
 * @version 1.0.0
 * @ClassName MaxPQ.java
 * @Description 优先队列
 * @createTime 2019年07月31日 14:12:00
 */
public class MaxPQ <Key extends Comparable<Key>>{
    private Key[] pq;
    private int N;

    public MaxPQ(int capacity) {
        pq = (Key[]) new Comparable[capacity + 1];
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public void insert(Key x){
        pq[++N] = x;
        CompareHelper.swim(pq, N);
    }

    public Key delMax() {
        Key max = pq[1];
        CompareHelper.exch(pq, 1, N--);
        CompareHelper.sink(pq, 1, N);
        pq[N+1] = null;
        return max;
    }


}
