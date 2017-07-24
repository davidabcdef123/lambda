package com.david.minglingzhe;

/**
 * Created by Super.Sun on 2017/7/24.
 */
public class Open implements Action {

    private final Editor editor;

    public Open(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void perform() {
        editor.open();
    }
}
