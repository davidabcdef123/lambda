package com.david.entity;

import java.util.List;

/**
 * Created by admin on 2017/6/27.
 */
public class ArtList {

    private String name;//艺术家名字
    private String members;//乐队成员
    private String origin;//乐队来自哪里

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMembers() {
        return members;
    }

    public void setMembers(String members) {
        this.members = members;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
