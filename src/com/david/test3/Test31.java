package com.david.test3;

import javax.sound.midi.Soundbank;

/**
 * Created by admin on 2017/6/27.
 */
public class Test31 {

    final static String salution = "hello";
    public static void main(String[] args) {
        Test3.GreetingService greetingService = message -> System.out.println(salution + message);
        greetingService.sayMessage("sam");

    }
}
