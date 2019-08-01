package io.github.smdt.quick;


import edu.princeton.cs.algs4.Insertion;
import edu.princeton.cs.algs4.StdRandom;
import io.github.smdt.help.CompareHelper;

/**
 * @author daijw@inspur.com
 * @version 1.0.0
 * @ClassName Quick.java
 * @Description 快速
 * @createTime 2019年06月17日 00:09:00
 */
public class Quick {

    private static final int CUTOFF = 10;



    public static void sort(Comparable[] a) {
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo + CUTOFF - 1) {
            //使用插入排序操作小数组
            Insertion.sort(a, lo, hi);
            return;
        }
        int j = CompareHelper.partition(a, lo, hi);
        sort(a, lo, j-1);
        sort(a, j+1, hi);
    }



    //三区快速排序，针对数组中只有少量不同的点（即大量相同点）的情况能达到线性的时间复杂度
    private static void sortThreeWay(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int lt = lo, gt = hi;
        Comparable v = a[lo];
        int i = lo;
        while (i <= gt)
        {
            int cmp = a[i].compareTo(v);
            if (cmp < 0) {
                CompareHelper.exch(a, lt++, i++);
            } else if (cmp > 0) {
                CompareHelper.exch(a, i, gt--);
            } else {
                i ++;
            }
        }
        sortThreeWay(a, lo, lt - 1);
        sortThreeWay(a, gt + 1 , hi);
    }

    private static Comparable select(Comparable[] a, int k) {
        StdRandom.shuffle(a);
        int lo = 0, hi = a.length - 1;
        while (hi > lo) {
            int j = CompareHelper.partition(a, lo, hi);
            if (j < k) {
                lo = j + 1;
            }
            else if (j > k) {
                hi = j - 1;
            }
            else {
                return a[k];
            }
        }
        return a[k];
    }



}
