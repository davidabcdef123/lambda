package com.david.test10;

import com.david.entity.ArtList;

import java.lang.management.BufferPoolMXBean;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Super.Sun on 2017/7/5.
 */
public class Test10 {

    public static void main(String[] args) {
        List<ArtList> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            ArtList artList=new ArtList();
            artList.setName("张"+i);
            list.add(artList);
        }
        StringBuilder sb = new StringBuilder("[");
        list.stream().map(ArtList::getName).forEach(name->{
            if(sb.length()>1){
                sb.append(", ");
            }
            sb.append(name);
        });
        sb.append("]");
        System.out.println(sb.toString());
    }
}
