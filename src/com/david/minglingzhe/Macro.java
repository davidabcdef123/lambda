package com.david.minglingzhe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Super.Sun on 2017/7/24.
 */
public class Macro {

    private final List<Action> actions;

    public Macro() {
        this.actions = new ArrayList<>();
    }

    public void record(Action action){
        actions.add(action);
    }

    public void run(){
        actions.forEach(Action::perform);
    }
}
