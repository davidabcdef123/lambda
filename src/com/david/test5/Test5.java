package com.david.test5;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;


/**
 * Created by admin on 2017/6/27.
 */
public class Test5 {

    public static void main(String[] args) {
        List<String> collected=Stream.of("a", "b", "c").collect(toList());
        System.out.println(collected.get(1));

        List re=Stream.of("a", "b", "c").map(string -> string.toUpperCase()).collect(toList());
        System.out.println(re.get(1));

        List<String> result=Stream.of("a","b","c").filter(value->aaa(value)).collect(toList());
        System.out.println(result.size());

        List<Integer> togegher=Stream.of(asList(1,2),asList(3,4)).flatMap(number->number.stream()).collect(toList());
        System.out.println("togegher.size="+togegher.size());
    }

    public static boolean aaa(String value){
        if(value.equals("a")){
            return true;
        }else{
            return false;
        }
    }
}
