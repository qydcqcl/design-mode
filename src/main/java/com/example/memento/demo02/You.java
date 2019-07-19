package com.example.memento.demo02;

/**
 * 发起人：您
 * @author hzq
 * @date 2019/7/19 12:44
 */
public class You {

    String wifeName;

    public String getWifeName() {
        return wifeName;
    }

    public void setWifeName(String wifeName) {
        this.wifeName = wifeName;
    }

    public Girl createMemento(){
        return new Girl(wifeName);
    }

    public void restoreMemento(Girl girl){
        setWifeName(girl.getName());
    }
}
