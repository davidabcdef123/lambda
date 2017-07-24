package com.david.test8;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

/**
 * Created by admin on 2017/7/3.
 */
public class Test8 {

    public static void main(String[] args) {
        List<Integer> numbers=asList(1,2,3,4);

        List<Integer> stillOrdered=numbers.stream().map(x->x+1).collect(Collectors.toList());
        for (int i = 0; i < stillOrdered.size(); i++) {
            System.out.println(stillOrdered.get(i));
        }
    }
}
