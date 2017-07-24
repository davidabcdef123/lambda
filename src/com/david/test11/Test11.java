package com.david.test11;

import com.david.test1.Test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * Created by Super.Sun on 2017/7/24.
 */
public class Test11 {

    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        //l.stream().map(Test11::test).collect(Collectors.<String>toList());
/*        double[] values = new double[4];
        Arrays.parallelSetAll(values, i -> i);*/
    }

    public static double[] parallelInitialize(int size) {
        double[] values = new double[size];
        Arrays.parallelSetAll(values, i -> i);
        return values;
    }

    public static String test(){
        return "";
    }


}
