package com.xiaozhao.observer;

/**
 * Created by xiaozhao on 2016/12/22.
 */
public class Mouse extends Subject {
    private String stateInfo;


    public String getStateInfo() {
        return stateInfo;
    }

    public void  pushGlass(){
        this.stateInfo ="老鼠打翻了玻璃瓶";
        System.out.println(this.stateInfo);
        this.notifyAllObservers(this.stateInfo);
    }
}
