package com.david.entity;

import java.util.List;

/**
 * Created by admin on 2017/6/27.
 */
public class Album {
    //专辑，由若干曲目组成。
    private String name;//专辑名
    private List<String> tracks;//专辑上所有曲目的列表。
    private List<String> musiclans;//参与创作本专辑的艺术家列表。

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    public List<String> getMusiclans() {
        return musiclans;
    }

    public void setMusiclans(List<String> musiclans) {
        this.musiclans = musiclans;
    }
}
