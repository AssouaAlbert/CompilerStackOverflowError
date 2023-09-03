package org.peronal;

public class StackOverflow {
    public static void test(int i)
    {
        // Incorrect as base condition leads to
        // non-stop recursion.
        if (i == 0)
            return;
        else {
            test(i++);
        }
    }
}
