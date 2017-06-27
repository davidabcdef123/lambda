package com.david.test3;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

/**
 * Created by admin on 2017/6/27.
 */
public class Test3 {

    public static void main(String[] args) {
        Test3 t3 = new Test3();

        //类型声明
        MathOperation addition = (int a, int b) -> a + b;
        //不用类型声明
        MathOperation subbraction = (a, b) -> a - b;
        //大括号中的返回语句
        MathOperation multiplication=(a,b)->{return a * b;};
        //没有大括号的返回预计
        MathOperation division=(a,b)->a/b;

        System.out.println("10+5="+t3.operate(10,5,addition));
        System.out.println("10-5="+t3.operate(10,5,subbraction));
        System.out.println("10*5="+t3.operate(10,5,multiplication));
        System.out.println("10/5="+t3.operate(10,5,division));

        //不用括号
        GreetingService greetingService1 = message -> System.out.println("hello"+message);
        System.out.println("123");
        System.out.println("456");
        System.out.println("结束");
        //用括号
        GreetingService greetingService2=(message) -> System.out.println("hello"+message);

        greetingService1.sayMessage("bob");
        greetingService2.sayMessage("david");

    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}
