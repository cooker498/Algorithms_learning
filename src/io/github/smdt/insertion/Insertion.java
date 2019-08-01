package io.github.smdt.insertion;

import io.github.smdt.help.CompareHelper;

/**
 * @author daijw@inspur.com
 * @version 1.0.0
 * @ClassName Insertion.java
 * @Description 插入
 * @createTime 2019年07月02日 09:10:00
 */
public class Insertion {
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0; j--) {
                if (CompareHelper.less(a[j], a[j-1])) {
                    CompareHelper.exch(a, j, j-1);
                } else {
                    break;
                }
            }
        }
    }
}
