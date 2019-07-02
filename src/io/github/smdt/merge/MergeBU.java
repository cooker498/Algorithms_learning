package io.github.smdt.merge;

/**
 * @author daijw@inspur.com
 * @version 1.0.0
 * @ClassName MergeBU.java
 * @Description TODO
 * @createTime 2019年07月02日 10:53:00
 */
public class MergeBU {
    public static void sort(Comparable[] a) {
        int N = a.length;
        Comparable[] aux = new Comparable[N];
        for (int sz = 1; sz < N; sz = sz + sz) {
            for (int lo = 0; lo < N - sz; lo += sz+sz) {
                Merge.merge(a, aux, lo, lo+sz-1, Math.min(lo+sz+sz-1, N-1));
            }
        }
    }

}
