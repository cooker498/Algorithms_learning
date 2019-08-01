package io.github.smdt.help;

/**
 * @author daijw@inspur.com
 * @version 1.0.0
 * @ClassName CompareHelper.java
 * @Description 排序公用方法
 * @createTime 2019年06月17日 00:51:00
 */
public class CompareHelper {
    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    public static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
        for (int k = lo; k <= hi; k ++) {
            aux[k] = a[k];
        }

        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (CompareHelper.less(aux[j], aux[i])) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }
    }

    public static void sink(Comparable[] pq, int k, int N) {
        while (2 * k <= N) {
            int j = 2*k;
            if (j < N && less(j, j+1)) {
                j++;
            }
            if(!less(k,j)) {
                break;
            }
            exch(pq, k, j);
            k = j;
        }
    }

    public static void swim(Comparable[] pq, int k){
        while (k > 1 && less(k/2, k)) {
            exch(pq, k, k/2);
            k = k/2;
        }
    }

    public static int partition(Comparable[] a, int lo, int hi) {
        int i = lo, j = hi + 1;
        while (true)
        {
            while (CompareHelper.less(a[++i], a[lo])) {
                if (i == hi){
                    break;
                }
            }
            while (CompareHelper.less(a[lo], a[--j])) {
                if (j == lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            CompareHelper.exch(a, i, j);
        }
        CompareHelper.exch(a, lo, j);
        return j;
    }
}
