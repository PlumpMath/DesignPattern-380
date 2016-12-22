package com.xiaozhao.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaozhao on 2016/12/22.
 */
public abstract class Subject {
    private List<IObserver> list = new ArrayList<IObserver>();

    public void attachObserver(IObserver newObserver){
        this.list.add(newObserver);
    }

    public void detachObserver(IObserver observer){
        this.list.remove(observer);
    }

    protected void notifyAllObservers(String stateInfo){
        for (IObserver observer:this.list ) {
            observer.doAction(stateInfo);
        }
    }

}
