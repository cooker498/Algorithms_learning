package io.github.smdt.PQ;

import io.github.smdt.help.CompareHelper;

/**
 * @author daijw@inspur.com
 * @version 1.0.0
 * @ClassName UnorderMaxPQ.java
 * @Description TODO
 * @createTime 2019年07月29日 23:23:00
 */
public class UnorderMaxPQ<Key extends Comparable<Key>> {
    private Key[] pq;
    private int N;

    public UnorderMaxPQ setN(int capacity) {
        pq = (Key[]) new Comparable[capacity];
    }

    public boolean isEmpay(){
        return N == 0;
    }


    public void insert(Key x) {
        pq[N++] = x;
    }

    public Key deMax(){
        int max = 0;
        for (int i = 1; i < N; i++) {
            if (CompareHelper.less(max, i)) {
                max = i;
            }
        }
        CompareHelper.exch(pq, max, N-1);
        return pq[--n];
    }

}
