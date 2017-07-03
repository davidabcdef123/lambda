package com.david.test4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by admin on 2017/6/27.
 */
public class Test4 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i=0;i<10;i++){
            list.add(i + "");
        }
        /*long count=list.stream().filter(l->l.equals("1")).count();
        long allcount=list.stream().count();
        Stream<String> nLis=list.stream().filter(l -> l.equals("2"));
        System.out.println(count);
        System.out.println(allcount);*/
        list.stream().filter(arr -> {
            System.out.println(arr);
            return arr.equals("2");
        });

       /* allArtists.stream()
                .filter(artist -> {
                    System.out.println(artist.getName());
                    return artist.isFrom("London");
                });*/
    }
}
