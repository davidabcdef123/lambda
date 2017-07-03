package com.david.test6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

/**
 * Created by admin on 2017/6/27.
 */
public class Test6 {



    public static void main(String[] args) {
        List<String> names= asList("1","12","123");
        String min=names.stream().max(Comparator.comparing(name->name.length())).get();
        System.out.println(min);
        List<Integer> sss = asList(1, 2, 3);
        //sss.stream().max(Comparator.comparing(s->s.))

        int count=Stream.of(1,2,3).reduce(0,(acc,element)->acc+element);
        System.out.println(count);

        BinaryOperator<Integer> accumulator=(acc,element)->acc+element;
        int cc = accumulator.apply(accumulator.apply(accumulator.apply(1,1),2),3);
        System.out.println("cc="+cc);
    }
}
