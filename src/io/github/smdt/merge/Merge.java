package io.github.smdt.merge;

import io.github.smdt.help.CompareHelper;

/**
 * @author daijw@inspur.com
 * @version 1.0.0
 * @ClassName Merge.java
 * @Description 归并
 * @createTime 2019年07月02日 10:27:00
 */
public class Merge {

    public static void sort(Comparable[] a) {
        Comparable[] aux = new Comparable[a.length];
        sort(a, aux, 0, a.length - 1);
    }


    private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid+1, hi);
        CompareHelper.merge(a, aux, lo, mid, hi);
    }


}
