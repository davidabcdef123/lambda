package com.david.test9;

import com.david.entity.ArtList;
import com.sun.javafx.css.SelectorPartitioning;
import com.sun.javafx.scene.control.skin.VirtualFlow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

/**
 * Created by Super.Sun on 2017/7/5.
 */
public class Test9 {

    public static void main(String[] args) {
        List<ArtList> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            ArtList artList=new ArtList();
            artList.setName("张"+i);
            list.add(artList);
        }
        String resuylt=list.stream().map(ArtList::getName).collect(Collectors.joining(",","[","]"));
        System.out.println(resuylt);



    }



    /*public  void ttt(){
        Map m = new HashMap();
        m.computeIfAbsent("aaa",this::ttt(""));
    }*/

    /*private Object ttt(Object o) {
    }*/
}
