package io.github.smdt.help;

/**
 * @author daijw@inspur.com
 * @version 1.0.0
 * @ClassName CompareHelper.java
 * @Description TODO
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
}
