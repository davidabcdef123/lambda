package com.david.test7;

import com.david.entity.Album;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntConsumer;

/**
 * Created by admin on 2017/7/3.
 */
public class Test7 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i=0;i<10;i++){
            list.add(i+"");
        }
        Album album=new Album();
        Runnable getTracks = album::getTracks;
        //String[]::new
    }
}
