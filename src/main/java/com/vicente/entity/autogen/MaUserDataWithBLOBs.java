package com.vicente.entity.autogen;

import java.io.Serializable;

public class MaUserDataWithBLOBs extends MaUserData implements Serializable {
    private String question1;

    private String question2;

    private String view;

    private static final long serialVersionUID = 1L;

    public String getQuestion1() {
        return question1;
    }

    public void setQuestion1(String question1) {
        this.question1 = question1;
    }

    public String getQuestion2() {
        return question2;
    }

    public void setQuestion2(String question2) {
        this.question2 = question2;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }
}