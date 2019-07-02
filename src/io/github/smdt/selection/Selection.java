package io.github.smdt.selection;

import io.github.smdt.help.CompareHelper;

/**
 * @author daijw@inspur.com
 * @version 1.0.0
 * @ClassName Selection.java
 * @Description TODO
 * @createTime 2019年07月02日 09:05:00
 */
public class Selection {
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i ;
            for (int j = i + 1; j < N; j++) {
                if (CompareHelper.less(a[j], a[i])) {
                    min = j;
                }
            }
            CompareHelper.exch(a, i, min);
        }
    }
}
