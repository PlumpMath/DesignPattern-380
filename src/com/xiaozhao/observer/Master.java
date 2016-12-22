package com.xiaozhao.observer;

/**
 * Created by xiaozhao on 2016/12/22.
 */
public class Master implements IObserver {
    public void doAction(String stateInfo) {
        System.out.println("主人观察到了 "+ stateInfo);
        System.out.println("主人投了一个水杯过去打老鼠");
    }
}
