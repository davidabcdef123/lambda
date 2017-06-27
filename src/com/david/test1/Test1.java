package com.david.test1;

import java.util.function.BinaryOperator;

/**
 * Created by admin on 2017/6/26.
 */
public class Test1 implements Runnable{
    public static void main(String[] args) {

        Runnable noArguments = () -> System.out.println("hello world");

        Runnable multistaement=()->{
            System.out.println("123");
            System.out.println("456");
        };

        //隐士声明
        BinaryOperator<Long> add=(x,y)->x+y;

        //显示声明
        BinaryOperator<Long> addExplicit=(Long x,Long y)->x+y;
    }

    @Override
    public void run() {

    }
}
