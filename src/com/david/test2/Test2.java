package com.david.test2;

import java.util.function.Predicate;

/**
 * Created by admin on 2017/6/26.
 */
public class Test2 {

    public static void main(String[] args) {
        Predicate<Integer> atLeast5=x->x>5;
        System.out.println(atLeast5.toString());
    }
}
