package com.xiaozhao.observer;

/**
 * Created by xiaozhao on 2016/12/22.
 */
public class Cat implements IObserver {
    public void doAction(String stateInfo) {
        System.out.println("猫观察到了 "+stateInfo);
        System.out.println("猫扑了过去抓老鼠");
    }
}
