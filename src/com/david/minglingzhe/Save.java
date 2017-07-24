package com.david.minglingzhe;

/**
 * Created by Super.Sun on 2017/7/24.
 */
public class Save implements Action {

    private final Editor editor;

    public Save(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void perform() {
        editor.save();
    }
}
