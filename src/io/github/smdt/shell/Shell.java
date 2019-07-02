package io.github.smdt.shell;

import io.github.smdt.help.CompareHelper;

/**
 * @author daijw@inspur.com
 * @version 1.0.0
 * @ClassName Shell.java
 * @Description TODO
 * @createTime 2019年07月02日 10:14:00
 */
public class Shell {
    public static void sort(Comparable[] a) {
        int N = a.length;

        int h = 1;
        while (h < N/3) {
            h = 3*h + 1;
        }

        while (h >= 1) {
            for (int i = h; i < N; i ++) {
                for (int j = i; j > h && CompareHelper.less(a[j], a[j-h]); j -= h) {
                    CompareHelper.exch(a, j, j-h);
                }
            }

            h = h/3;
        }
    }

}
